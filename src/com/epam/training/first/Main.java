package com.epam.training.first;

import com.epam.training.first.action.ReadFromFile;
import org.apache.log4j.BasicConfigurator;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        ReadFromFile.readFromFile("./text files/data.txt");
    }
}
