package com.epam.training.first;

import java.io.FileNotFoundException;
import com.epam.training.first.action.Action;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.Point;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {

    public static BufferedReader openFile(String filepath) throws FileNotFoundException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(filepath)));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
        return reader;
    }

    public static ArrayList<String> readData(BufferedReader reader) throws IOException{
        ArrayList<String> data = new ArrayList<>();
        String s;

        try {
            while ((s = reader.readLine()) != null) {
                data.add(s);
            }
        } catch (IOException ioexception) {
            System.out.println(ioexception);
        } finally {
            reader.close();
        }
        return data;
    }

    public static ArrayList<ArrayList<Integer>> convertToInt(ArrayList<String> data) {
        ArrayList<ArrayList<Integer>> convertedData = new ArrayList<>();

        for (String str : data) {

            String[] splittedString = str.split(" ");
            ArrayList<Integer> splittedStringAsInt = new ArrayList<>();

            for (int i = 0; i < splittedString.length; i++) {
                splittedStringAsInt.add(Integer.parseInt(splittedString[i]));
            }
            convertedData.add(splittedStringAsInt);
        }
        return convertedData;
    }

}
