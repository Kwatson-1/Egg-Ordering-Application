import java.util.Scanner;

public class EggsOrder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //user input through Scanner
        // Declare some variables
        int eggs;
        double totalCost;
        int amountOfDozen;
        int amountOfEggs;

        System.out.print("How many eggs do you want to buy? : ");
        //error trapping - if input not integer
        while (!sc.hasNextInt()) {
<<<<<<< Updated upstream
            System.out.print("Please input number value, How many eggs do you want to buy? : ");
=======
            System.out.print("Please correctly enter the number of eggs you wish to purchase as a value greater than 0.");
>>>>>>> Stashed changes
            sc.nextLine();
        }
        eggs = sc.nextInt();
<<<<<<< Updated upstream

        if(eggs >= 0) {
            amountOfDozen = eggs / 12;  
=======
        //Nested if else block to output the total cost of the eggs requested.
        
        if (eggs > 0) {
            amountOfDozen = eggs / 12;
>>>>>>> Stashed changes
            amountOfEggs = eggs % 12;
            totalCost = (amountOfDozen * 7.25) + (amountOfEggs * 0.75);
            if (amountOfDozen == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfEggs + " eggs at $0.75 each for a total of $" + String.format("%.2f", totalCost));
            } else if (amountOfEggs == 0) {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen for a total of $" + String.format("%.2f", totalCost));
            } else {
                System.out.println("You ordered " + eggs + " eggs. That is " + amountOfDozen + " dozen eggs at $7.25 per dozen and " + amountOfEggs + " additional eggs at $0.75 each for a total of $" + String.format("%.2f", totalCost));
            }
        } else {
            System.out.println("Error! Please input plus number!"); //error trapping - if user input not plus value
        }
    }
}