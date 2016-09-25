package com.epam.training.first;

import com.epam.training.first.action.Action;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.Point;
import java.io.*;
import java.util.ArrayList;
import com.epam.training.first.ReadFromFile.*;

import static com.epam.training.first.ReadFromFile.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> list = null;
        try {
            list = Circle.CircleBuilder.createCircleList(convertToInt(readData(openFile("./text files/data.txt"))));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound);
        } catch (IOException ioexception) {
            System.out.println(ioexception);
        }

        for (Circle c : list) {
            System.out.println(c);
            System.out.println(Action.calculateArea(c));
            System.out.println(Action.calculatePerimeter(c));
        }
    }
}
