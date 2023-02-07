package edu.cscc;
import java.util.Scanner;
// Jeffrey McCullough
// September 5, 2022
// Return the storm classification of a given wind speed.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        long speed;
        String classification;
        System.out.print("Enter the wind speed in MPH: ");
        speed = input.nextLong();
        if (speed < 0) {
            System.out.print("Invalid input. Wind speeds cannot be negative.");
        } else {
            if (speed < 39) {
                classification = ("Not in scale");
                System.out.print("Classification: " + classification);
            } else {
                if (speed < 74) {
                    classification = ("Tropical storm");
                    System.out.print("Classification: " + classification);
                } else {
                    if (speed < 96) {
                        classification = ("Category One Hurricane");
                        System.out.print("Classification: " + classification);
                    } else {
                        if (speed < 111) {
                            classification = ("Category Two Hurricane");
                            System.out.print("Classification: " + classification);
                        } else {
                            if (speed < 130) {
                                classification = ("Category Three Hurricane");
                                System.out.print("Classification: " + classification);
                            } else {
                                if (speed < 157) {
                                    classification = ("Category Four Hurricane");
                                    System.out.print("Classification: " + classification);
                                } else {
                                    classification = ("Category Five Hurricane");
                                    System.out.print("Classification: " + classification);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
