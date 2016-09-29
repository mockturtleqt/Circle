package com.epam.training.first;

import com.epam.training.first.action.ReadFromFile;
import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;
import org.apache.log4j.BasicConfigurator;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Stream.of(ReadFromFile.readFromFile("./data/data.txt")).forEach(System.out::println);

    }
}
