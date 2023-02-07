package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

//Jeffrey McCullough
//September 19, 2022
//This program will create a grocery list from user input and sort it alphabetically.
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        String[] groceryList;
        groceryList = new String[6];
        while (count < groceryList.length) {
            System.out.print("Enter grocery item: ");
            String grocery = input.nextLine();
            if (isDuplicate(grocery, groceryList, count)) {
                System.out.println("Sorry, item: " + grocery + " is a duplicate");
            } else {
                groceryList[count++] = grocery;
            }
        }
        Arrays.sort(groceryList);
        System.out.println("Your Grocery List:");
        for (String food : groceryList) {
            System.out.println(food);
        }
    }

    public static boolean isDuplicate(String item, String[] list, int listcnt) {
        for (int i = 0; i < listcnt; i++) {
            if (item.equals(list[i])) {
                return true;
            }
        }
        return false;
    }
}