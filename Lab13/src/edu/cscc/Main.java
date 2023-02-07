package edu.cscc;

import java.util.Map;
import java.util.Scanner;

/**
 * Purpose of program, November 29, 2022
 * @author Jeffrey McCullough
 */
public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Map<String, Surname> map = Census.loadCensusData(CENSUSDATAFNAME);

        String surname;
        boolean keepGoing;
        try {
            do {
                System.out.print("Type the surname of the person you're looking for, or type 'quit' to exit the program: ");
                surname = input.nextLine().trim().toUpperCase();
                keepGoing = !"quit".equalsIgnoreCase(surname);
                if (keepGoing) {
                    Surname name = map.get(surname);

                    if (name != null) {
                        System.out.println("Surname:" + surname + " rank: " + name.getRank() + " count: " + name.getCount() + " proportion: " + name.getProportion());
                    } else {
                        System.out.println("Surname: " + surname + " not found");
                    }
                }
            } while (keepGoing);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
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
