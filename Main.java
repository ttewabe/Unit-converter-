import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create Scanner object
        Scanner input = new Scanner(System.in);

        // welcome message
        System.out.println("Welcome to our Unit Converter!");

        // start loop
        int conversionChoice = -1;

        while(conversionChoice != 4) {
            // menu of conversions to choose from
            System.out.println("Pick a choice:");
            System.out.println("1) Cups to Ounces");
            System.out.println("2) Miles to Kilometers");
            System.out.println("3) Grams to Pounds");
            System.out.println("4) Quit");

            // get user's conversion choice
            try {
                conversionChoice = input.nextInt();
            } catch(InputMismatchException exception) {
                System.out.println("Please enter a number between 1-4");
                input.nextLine();
                continue;
            }


            // IF user quits
            if (conversionChoice == 4) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                // get user's quantity choice
                System.out.println("How many units you like to convert?");
                double quantityChoice = 0;

                try {
                    quantityChoice = input.nextDouble();
                } catch(InputMismatchException exception) {
                    System.out.println("Please enter a number between 1-4");
                    input.nextLine();
                    continue;
                }


                // display the operation / results
                switch(conversionChoice) {
                    case 1: // cups to ounces ( 1 cup is 8 oz)
                        System.out.println(quantityChoice * 8);
                        break;
                    case 2: // miles to kilometers (1 mile is 1.60934 kilometers)
                        System.out.println(quantityChoice * 1.60934);
                        break;
                    case 3: // grams to pounds (1 gram is 0.00220462 pounds)
                        System.out.println(quantityChoice * 0.00220462);
                        break;
                    default:
                        System.out.println("Wrong input.");
                }
            }

        }

        // close Scanner object
        input.close();
    }
}