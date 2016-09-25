package com.epam.training.first.shapes;

import com.epam.training.first.exception.NotCircleException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static com.epam.training.first.ReadFromFile.*;

public class CircleBuilder {
    private Point center;
    private int radius;

    public CircleBuilder(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public CircleBuilder center(Point c) {
        this.center = c;
        return this;
    }

    public Circle build() throws NotCircleException {
        if (this.center == null) {
            this.center = new Point(0, 0);
        }
        if (this.radius <= 0) {
            throw new NotCircleException("There are no circles with " + this.radius + " radius");
        }
        return new Circle(this);
    }

    //Create list of Circle objects. Arguments - converted data from text file.
    public static ArrayList<Circle> createCircleList(ArrayList<ArrayList<Integer>> convertedData) {
        ArrayList<Circle> circleList = new ArrayList<>();
        for (ArrayList<Integer> singleCircle : convertedData) {
            //in data.txt there should be either one number (radius) or three (radius + center)
            if (singleCircle.size() > 1) {
                Point currentCenter = new Point(singleCircle.get(1), singleCircle.get(2));
                try {
                    circleList.add(new CircleBuilder(singleCircle.get(0)).center(currentCenter).build());
                } catch (NotCircleException notCircle) {
                    System.out.println(notCircle);
                }
            } else {
                try {
                    circleList.add(new CircleBuilder(singleCircle.get(0)).build());
                } catch (NotCircleException notCircle) {
                    System.out.println(notCircle);
                }
            }
        }
        return circleList;
    }

    public static ArrayList<Circle> fileCircleBuilder(String filepath) {
        ArrayList<Circle> list = null;
        try {
            list = CircleBuilder.createCircleList(convertToInt(readData(openFile(filepath))));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound);
        } catch (IOException ioexception) {
            System.out.println(ioexception);
        }
        return list;
    }
}
