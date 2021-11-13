
import java.util.Scanner;

public class EggsOrder {

    public static void main(String[] args) {

        //Creation of Scanner object and return of input stream.
        Scanner sc = new Scanner(System.in);
        //Variable Declaration
        int eggs;
        double totalCost;
        int amountOfDozen;
        int amountOfEggs;

        System.out.print("How many eggs would you like to purchase? : ");
        //Error trapping - if input entered is not int
        while (!sc.hasNextInt()) {
            System.out.print("Please correctly enter the number of eggs you wish to purchase as a value greater than 0.");
            sc.nextLine();
        }
        //User requested number of eggs requested is assigned to the egg variable.
        eggs = sc.nextInt();
        //Nested if else block to output the total cost of the eggs requested.
        
        if (eggs > 0) {
            amountOfDozen = eggs / 12;
            amountOfEggs = eggs % 12;
            totalCost = (amountOfDozen * 7.25) + (amountOfEggs * 0.75);
            if (amountOfDozen == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfEggs + " eggs at $0.75 each for a total cost of $" + String.format("%.2f", totalCost) + ".");
            } else if (amountOfEggs == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen for a total cost of $" + String.format("%.2f", totalCost) + ".");
            } else {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen and " + amountOfEggs + " additional eggs at $0.75 each for a total cost of $" + String.format("%.2f", totalCost) + ".");
            }
            //Error trapping - user must order at least one egg.
        } else {
            System.out.println("Error! You must purchase at least one egg. The program will now close.");
        }
    }
}
