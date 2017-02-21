package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> predictions = new ArrayList<>();
        ArrayList<String> correctPredictions = new ArrayList<>();

        functions.readFromFile("toto.txt", name, result);
        functions.readPredictions(name, predictions);
        functions.evaluatePredictions(name, result, predictions, correctPredictions);

    }
}
