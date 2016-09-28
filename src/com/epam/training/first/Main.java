package com.epam.training.first;

import com.epam.training.first.action.Action;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.log4j.*;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        //ArrayList<Circle> list = CircleBuilder.fileCircleBuilder("./text files/data.txt");

        ArrayList<Circle> list;
        try (Stream<String> stream = Files.lines(Paths.get("./text files/data.txt"))) {
            stream
                    .forEach(s -> {
                        try {
                            list = CircleBuilder.createCircleList(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray());
                            System.out.println(s);
                        } catch(NumberFormatException e) {
                            System.out.println(e);
                        }

                    });
        } catch (IOException e) {
            System.out.println(e);
        }
//        int[] a = Arrays.stream("1 2 3".split(" ")).mapToInt(Integer::parseInt).toArray();
//        for(int e: a) {
//            System.out.println(e);
//        }

//        if (list != null) {
//            for (Circle c : list) {
//                System.out.println(c);
//                System.out.println(Action.calculateArea(c));
//                System.out.println(Action.calculatePerimeter(c));
//            }
//        }
    }
}
