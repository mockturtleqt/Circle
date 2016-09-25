package com.epam.training.first;

import com.epam.training.first.action.Action;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import java.util.ArrayList;
import org.apache.log4j.*;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        ArrayList<Circle> list = CircleBuilder.fileCircleBuilder("./text files/data.txt");

//        try {
//            //convertToInt, readData and openFile from com.epam.training.first.ReadFromFile
//            list = CircleBuilder.createCircleList(convertToInt(readData(openFile("./text files/data.txt"))));
//        } catch (FileNotFoundException fileNotFound) {
//            System.out.println(fileNotFound);
//        } catch (IOException ioexception) {
//            System.out.println(ioexception);
//        }
        if (list != null) {
            for (Circle c : list) {
                System.out.println(c);
                System.out.println(Action.calculateArea(c));
                System.out.println(Action.calculatePerimeter(c));
            }
        }
    }
}
