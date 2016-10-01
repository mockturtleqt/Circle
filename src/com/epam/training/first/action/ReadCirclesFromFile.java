package com.epam.training.first.action;

import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.exception.NotCircleException;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class ReadCirclesFromFile {
    private static Logger logger = Logger.getLogger(ReadCirclesFromFile.class);

    public static List<Circle> readCirclesFromFile(String filename) {
        List<Circle> circleList = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            stream.forEach(s -> {
                try {
                    circleList.add(new CircleBuilder(Arrays.stream(s.split(" "))
                            .mapToInt(Integer::parseInt).toArray()).build());
                } catch (NumberFormatException | NotCircleException e) {
                    logger.error(e, e);
                }
            });
        } catch (IOException e) {
            logger.error(e, e);
        }
        return circleList;
    }
}
