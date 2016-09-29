package com.epam.training.first;

import com.epam.training.first.action.ReadCirclesFromFile;
import org.apache.log4j.BasicConfigurator;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Stream.of(ReadCirclesFromFile.readCirclesFromFile("./data/data.txt")).forEach(System.out::println);
    }
}
