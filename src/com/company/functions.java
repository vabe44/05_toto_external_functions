package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by GTX on 20/02/2017.
 */
public class functions {

    static void readFromFile(String filename, ArrayList<String> name, ArrayList<String> result) {
        // read data from file
        try {
            System.setProperty("file.encoding", "UTF8");
            FileReader file = new FileReader(filename);
            LineNumberReader lnr = new LineNumberReader(file);
            String line;

            while((line = lnr.readLine()) != null) {
                int ln = lnr.getLineNumber();
                if (ln % 2 == 0) result.add(line);
                else name.add(line);
            }

            file.close();
            lnr.close();
        } catch (IOException e) {
            System.out.println("Can't find the file! " + e);
        }
    }

    static void readPredictions(ArrayList<String> name, ArrayList<String> predictions) {
        System.out.println("Enter your predictions!");
        Scanner konzol = new Scanner(System.in);
        int i;
        for (i = 0; i < name.size(); i++) {
            System.out.print(i+1 + ". " + name.get(i) + ": ");
            String prediction = konzol.next();
            predictions.add(prediction);
        }
        konzol.close();
    }

    static void evaluatePredictions(ArrayList<String> name, ArrayList<String> result, ArrayList<String> predictions, ArrayList<String> correctPredictions) {
        int i;
        for (i = 0; i < name.size(); i++) {
            if (result.get(i).equals(predictions.get(i))) correctPredictions.add(name.get(i) + ": " + result.get(i));
        }

        System.out.println("Correct predictions (" + correctPredictions.size() + "): ");
        int k;
        for (k = 0; k < correctPredictions.size(); k++) {
            System.out.println(correctPredictions.get(k));
        }
    }
}
