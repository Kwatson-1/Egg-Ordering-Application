
import java.util.Scanner;

/*
* Unit: Java OOP
* Team Name: Team 3
* Programmers: Jae Kim, Kyle Watson and Kris Tribbeck.
* Program description: prompts the user for the number of eggs 
* they wish to order and provides cost breakdown analysis.
* 
* MIT License - Copyright(c) 2021 Jae Kim, Kyle Watson and Kristiin Tribbeck.
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
 */
public class EggsOrder {

    public static void main(String[] args) {

        // Creation of Scanner object and return of input stream.
        Scanner sc = new Scanner(System.in);
        // Variable declaration.
        int eggs = 0;
        double totalCost;
        int amountOfDozen;
        int amountOfEggs;

        while (eggs == 0) {
            System.out.print("How many eggs would you like to purchase? : ");
            // Error trapping - if input entered is not an int.
            while (!sc.hasNextInt()) {
                System.out.print("Please correctly input a number value, how many eggs do you wish to purchase? : ");
                sc.nextLine();
            }
            // User requested number of eggs requested is assigned to the egg variable.
            eggs = sc.nextInt();
            // Nested if else block to output the total cost of the eggs requested.
            if (eggs > 0) {
                amountOfDozen = eggs / 12;
                amountOfEggs = eggs % 12;
                totalCost = (amountOfDozen * 7.25) + (amountOfEggs * 0.75);
                if (amountOfDozen == 0) {
                    System.out.println("You ordered " + eggs + " eggs. That is "
                            + amountOfEggs + " eggs at $0.75 each for a total cost of $"
                            + String.format("%.2f", totalCost) + ".");
                } else if (amountOfEggs == 0) {
                    System.out.println("You ordered " + eggs + " eggs. That is "
                            + amountOfDozen + " dozen eggs at $7.25 per dozen for a total cost of $"
                            + String.format("%.2f", totalCost) + ".");
                } else {
                    System.out.println("You ordered " + eggs + " eggs. That is "
                            + amountOfDozen + " dozen eggs at $7.25 per dozen and "
                            + amountOfEggs + " additional eggs at $0.75 each for a total cost of $"
                            + String.format("%.2f", totalCost) + ".");
                }
                // Error trapping - user must order at least one egg.
            } else {
                System.out.println("Error! You must purchase at least one egg.");
            }
        }
    }
}
