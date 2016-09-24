package com.epam.training.first;

import com.epam.training.first.action.Action;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.Point;

import java.io.*;
import java.util.ArrayList;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) throws IOException{
        Circle c1 = new Circle.CircleBuilder(3).build();
        System.out.println(c1);
//        String data;
//        Circle c1;
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(new File("./text files/data.txt")));
//            while ((data = reader.readLine()) != null) {
//                String[] circleData = data.split(" ");
//                ArrayList<Integer> intCircleData = new ArrayList<Integer>();
//                for (int i = 0; i < circleData.length; i++) {
//                    intCircleData.add(Integer.parseInt(circleData[i]));
//                }
//                int currentRadius = intCircleData.get(0);
//                if (intCircleData.size() > 1) {
//                    Point currentCenter = new Point(intCircleData.get(1), intCircleData.get(2));
//                    c1 = new Circle.CircleBuilder(currentRadius).center(currentCenter).build();
//                }
//                else {
//                    c1 = new Circle.CircleBuilder(currentRadius).build();
//                }
//                System.out.println(Action.calculateArea(c1));
//                System.out.println(Action.calculatePerimeter(c1));
//                System.out.println(c1);
//            }
//            reader.close();
//        } catch (IOException e) {
//        }



    }
}
