package edu.cscc;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate Target Heart Rate and Maximum Heart Rate using the Karvonen Method
 * @author Jeffrey McCullough
 * 10/25/2022
 */
public class Main {
    private static Scanner input = new Scanner(System.in);

    /**
     * Main method - get user input and calculate / output target and maximum heart rate
     * @param args not used
     */
    public static void main(String[] args) {
        double restingHR = getRestingHR();
        double age = getAge();
        System.out.println("Your target heart rate is: " +
                calculateTargetHR(restingHR, age, 0.65) + " to " +
                calculateTargetHR(restingHR, age, 0.85)
        );
        System.out.println("Your maximum heart rate is: "+calculateMaxHR(age));
    }

    /**
     * Get resting heart rate
     * @return resting heart rate
     */
    public static double getRestingHR() {
        double restingHR = 0;
        do {
            System.out.print("Enter your resting heart rate: ");
            try {
                restingHR = Double.parseDouble(input.nextLine());
                if (restingHR <= 0) {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException | NullPointerException invalid) {
                System.out.println("Invalid input");
            }
        }
            while (restingHR <= 0);
            return restingHR;
    }

    /**
     * Get person's age (years)
     * @return person's age
     */
    public static double getAge() {
        double age = 0;
        do {
            System.out.print("Enter your age: ");
            try {
                age = Double.parseDouble(input.nextLine());
                if (age <= 0) {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException | NullPointerException invalid) {
                System.out.println("Invalid input");
            }
        }
        while (age <= 0);
        return age;
    }

    /**
     * Calculate maximum heart rate for aerobic exercise
     * @param age persons are
     * @return maximum hear rate
     */
    public static int calculateMaxHR(double age) {
        double maxHR = 220 - age;
        return (int)maxHR;
    }

    /**
     * Calculate target heart rate for aerobic exercise
     * @param restingHR resting heart rate
     * @param age person age (years)
     * @param intensity intensity of exercise (percentage 0.0 - 1.0)
     * @return target heart rate for a given intensity aerobic workout
     */
    public static int calculateTargetHR(double restingHR, double age, double intensity) {
        double targetHR = (((calculateMaxHR(age) - restingHR) * intensity) + restingHR);
        return (int)targetHR;
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