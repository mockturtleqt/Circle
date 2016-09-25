package com.epam.training.first;

import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import com.epam.training.first.shapes.Point;
import org.junit.Test;
import static org.junit.Assert.*;


//tests are created in folder "test" but it won't upload to github. so this is a copy
public class CircleTest {
    @Test(expected = NotCircleException.class)
    public void isCircle(){
        try {
            Circle c1 = new CircleBuilder(-1).build();
        }
        catch (NotCircleException e) {}
    }

    @Test
    public void intersectionTest() {
        int distance = 3;
        boolean doesIntersect = false;
        Circle c1 = null;
        try {
            c1 = new CircleBuilder(1).center(new Point(2, 3)).build();
        } catch (NotCircleException e) {}

        if (c1 != null) {
            int abs_x = Math.abs(c1.getCenter().getX());
            int abs_y = Math.abs(c1.getCenter().getY());
            if ((abs_x != abs_y) && (abs_x == distance) || (abs_y == distance)) {
                doesIntersect = true;
            }
        }
        assertTrue(doesIntersect);
    }
}
