package com.epam.training.first;

import com.epam.training.first.action.ReadFromFile;
import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.exception.NotCircleException;
import org.apache.log4j.BasicConfigurator;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        ReadFromFile.readFromFile("./data/data.txt");
    }
}
