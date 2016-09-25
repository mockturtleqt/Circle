package com.epam.training.first;

import com.epam.training.first.action.Action;
import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionTest {
    @Test
    public void calcAreaTest() {
        Circle c = null;
        try {
            c = new CircleBuilder(2).build();
        } catch (NotCircleException e) {}
        assertEquals(12.56, Action.calculateArea(c), 0.01);
    }

    @Test
    public void calcPerimeterTest() {
        Circle c = null;
        try {
            c = new CircleBuilder(2).build();
        } catch (NotCircleException e) {}
        assertEquals(12.56, Action.calculatePerimeter(c), 0.01);
    }
}
