package com.epam.training.first;
import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

//tests are created in folder "test" but it won't upload to github. so this is a copy
public class CircleTest {
    @Test
    public void isCircle(){
        //not sure if necessary because object with radius <= 0 will not be built
        try {
            Circle c1 = new CircleBuilder(2).build();
            assertTrue(c1.getRadius() > 0);
        } catch (NotCircleException e) {}
    }
}
