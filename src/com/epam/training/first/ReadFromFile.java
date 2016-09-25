package com.epam.training.first;

import java.io.FileNotFoundException;
import org.apache.log4j.*;
import java.io.*;
import java.util.ArrayList;


public class ReadFromFile {
    private static Logger logger = Logger.getLogger(ReadFromFile.class);

    public static BufferedReader openFile(String filepath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(filepath)));
        } catch (FileNotFoundException fileNotFoundException) {
            logger.error(fileNotFoundException + "No acceptable file here " + filepath);
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
            logger.error(ioexception);
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
            try {
                for (int i = 0; i < splittedString.length; i++) {
                    splittedStringAsInt.add(Integer.parseInt(splittedString[i]));
                }
                convertedData.add(splittedStringAsInt);
            } catch (NumberFormatException formatException) {
                logger.error(formatException + " Wrong input! Only accepts ints.");
            }
        }
        return convertedData;
    }

}
