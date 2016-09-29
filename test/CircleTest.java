import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import org.junit.Test;


public class CircleTest {

    @Test(expected = NotCircleException.class)
    public void isCircle() throws NotCircleException {
        Circle c1 = new CircleBuilder(-1).build();
    }

}
