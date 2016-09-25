package com.epam.training.first.shapes;

import com.epam.training.first.exception.NotCircleException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static com.epam.training.first.ReadFromFile.*;
import org.apache.log4j.*;


public class CircleBuilder {
    private static Logger logger = Logger.getLogger(CircleBuilder.class);
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
                    logger.error(notCircle);
                }
            } else {
                try {
                    circleList.add(new CircleBuilder(singleCircle.get(0)).build());
                } catch (NotCircleException notCircle) {
                    logger.error(notCircle);
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
            logger.error(fileNotFound);
        } catch (IOException ioexception) {
            logger.error(ioexception);
        }
        return list;
    }
}
