import com.epam.training.first.action.ReadCirclesFromFile;
import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReadFromFileTest {
    @Test
    public void readCorrectData() throws NotCircleException{
        List<Circle> circleFromFile = ReadCirclesFromFile.readCirclesFromFile("./data/correctData");
        List<Circle> circle = new ArrayList();
        circle.add(new CircleBuilder(1).center(new Point(2, 3)).build());
        assertEquals(circle.get(0), circleFromFile.get(0));
    }

    @Test
    public void readIncorrectData() {
        List<Circle> circle = ReadCirclesFromFile.readCirclesFromFile("./data/incorrectData");
        assertTrue(circle.isEmpty());
    }
}
