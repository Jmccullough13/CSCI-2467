package edu.cscc;

import java.util.Scanner;

//Jeffrey McCullough
//September 12, 2022
//Takes user's weight in pounds and height in inches, converts them into kilograms and meters respectively,
//calculates the users BMI, and return the classification based on the BMI.
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;

        System.out.print("Let's calculate your BMI. \nEnter your weight in pounds: ");
        lbs = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        inches = input.nextDouble();
        meters = computeM(inches);
        kgs = computeKg(lbs);
        bmi = computeBMI(kgs, meters);
        classification = computeClass(bmi);
        System.out.printf("Your BMI is %.4f\n", bmi);
        System.out.printf("Your BMI classification is %s", classification);
       }
    public static double computeKg(double lbs) {
        double metric = lbs/2.2046;
        return metric;
    }
    public static double computeM(double inches){
        double metric = inches/39.37;
        return metric;
    }
    public static double computeBMI(double kgs, double meters){
        double BMI = kgs / (Math.pow(meters, 2));
        return BMI;
    }
    public static String computeClass(double bmi) {
        String classification;
        if (bmi < 18.5) {
            classification = ("Underweight.");
        } else if (bmi < 25.0) {
            classification = ("Normal.");
        } else if (bmi < 30.0) {
            classification = ("Overweight.");
        } else {
            classification = ("Obese.");
        }
        return classification;
    }
}
