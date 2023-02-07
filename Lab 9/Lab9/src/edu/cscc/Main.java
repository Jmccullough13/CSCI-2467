package edu.cscc;

import java.io.*;
import java.util.Scanner;

/**
 * This program will read a line from a file, split the line into an array of item, number of units, and cost.
 * It will then change the numbers for units and cost in the array to number variables, add the total units and cost,
 * and display the information for all items in a table with total units and costs at the bottom.
 * @author Jeffrey McCullough
 */

public class Main {
    static final String INPUTFILE = "components.txt";
    static final String PRINTFFORMAT = "%20s %2d    %6.2f\n";

    public static void main(String[] args) {
        double total = 0;
        int units = 0;
        File infile = new File(INPUTFILE);
        System.out.printf("%s%n", "           Component Units Price");

        try (BufferedReader br = new BufferedReader(new FileReader(new File(INPUTFILE)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String newline = line;
                String[] array = newline.split(",");
                 int quantity = Integer.parseInt(array[1]);
                 double cost = Double.parseDouble(array[2]);
                 double totalcost = cost * quantity;
                System.out.format(PRINTFFORMAT, array[0], quantity, cost);
                total = total + totalcost;
                units = units + quantity;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Total units: " + units);
        System.out.println("Total cost: " + total);
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */