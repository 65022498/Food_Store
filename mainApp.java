import java.nio.ShortBuffer;
import java.util.Scanner; // Import the Scanner class

import Human.*;
import Shop.*;

public class mainApp {

    public static Scanner kb = new Scanner(System.in); // Create a Scanner object
    public static String unknownStr = "???";

    public static void main(String[] args) {

        //// -Initialize- ////
        Customer customer = new Customer(unknownStr);
        Chef chef = new Chef("Bobby");

        boolean flag1 = true;
        String inputAnswer = null;

        // Create an instance of Bakery, which is a subclass of Shop
        Shop bakery = new Shop("Bakery", true);

        // Add Candy and Bread to the Bakery
        for (int i = 0; i < 3; i++) {
            bakery.AddFood("Baguette no." + i, "Bread", 50);
        }


        System.out.println(GetSmileyFaceASCII());
        System.out.println("Welcome to bakery house.");

        SetNameOfCustomer(customer);
        SetPronouns(customer);
        System.out.println(customer.GetPronouns() + " " + customer.GetName() + " is enter the bakery house.");

        System.out.println("Hi I'm " + chef.GetName() + " what do you want?");
        do {

            ShowOption();
            inputAnswer = kb.nextLine();

            switch (inputAnswer) {
                case "6":
                    Back(chef.GetName());
                    flag1 = false;
                    break;
                case "5":
                    ShowMenu(bakery);
                    break;
                case "4":
                    CallShef(customer.GetName(), chef.GetName());
                    break;
                case "3":
                    customer.Poop();
                    break;
                case "2":
                    Eat(bakery); 
                    break;
                case "1":
                    bakery.Remove("Bread ");
                    break;
                default:
                    break;
            }

            // System.out.println("1 : I want Bread. Do you have it? \n"
            // + "2 : I want Candy. Do you have it? \n"
            // + "3 : What menu are sold in this shop?\n"
            // + "4 : Eat now random menu?\n"
            // + "5 : Go home.\n");
            // Scanner ctm = new Scanner(System.in);
            // String ans = ctm.nextLine();
            // //
            // switch (ans) {
            // case "1":
            // System.out.println("Bread? ok follow me sir.");
            // break;
            // case "2":
            // System.out.println("Candy? ok follow me sir.");
            // break;
            // case "3":
            // System.out.println("Here's the menu, sir.");
            // bakery.ShowMenu();
            // break;
            // case "4":
            // customer.Eat("food");
            // break;
            // case "5":
            // System.out.println("Go home");
            // flag1 = false;
            // break;

        } while (flag1);
    }

    public static void ShowMenu(Shop shop) {
        shop.ShowMenu();
        System.out.println("-------------------------------------------\n");
    }

    public static void ShowOption() {
        System.out.println("------------------------\n");
        System.out.println("\t\tOPTION");
        System.out.println("------------------------\n");
        System.out.println("1: Buy food");
        System.out.println("2: Eat someting");
        System.out.println("3: Go to toilet");
        System.out.println("4: Talk with chef");
        System.out.println("5: Show list menu");
        System.out.println("6: Back!");
        System.out.println("------------------------\n");
    }

    public static void SetPronouns(Customer customer) {
        String inputPronouns = null;
        boolean flag = true;
        do {

            if (inputPronouns == null) {
                System.out.println("What are your pronouns \n(Enter 0 = He, Enter 1 = She)\n>");
                inputPronouns = kb.nextLine();
                switch (inputPronouns) {
                    case "0":
                        customer.SetPronouns("He");
                        System.out.println("Success! Your pronoun is " + customer.GetPronouns());
                        flag = false;
                        break;
                    case "1":
                        customer.SetPronouns("She");
                        System.out.println("Success! Your pronoun is " + customer.GetPronouns());
                        flag = false;
                        break;
                }
            } else {
                System.out.println("Enter your pronouns again pls. \n(Enter 0 = He, Enter 1 = She)\n> ");
                inputPronouns = kb.nextLine();
                switch (inputPronouns) {
                    case "0":
                        customer.SetPronouns("He");
                        System.out.println("Success! Your pronoun is " + customer.GetPronouns());
                        flag = false;
                        break;
                    case "1":
                        customer.SetPronouns("She");
                        System.out.println("Success! Your pronoun is " + customer.GetPronouns());
                        flag = false;
                        break;
                }
            }
        } while (flag);
    }

    public static void SetNameOfCustomer(Customer customer) {
        String inputName = null;

        do {
            if (inputName == null)
                System.out.print("Let's us know your name pls.\n> ");
            else
                System.out.print("Enter your name again pls.\n> ");

            inputName = kb.nextLine(); // Get Name's input

            if (inputName.length() == 0)
                inputName = unknownStr;
            else {
                System.out.println("Success!");
                customer.SetName(inputName);
                return;
            }

        } while (inputName == unknownStr);

    }

    public static String GetSmileyFaceASCII() {
        String smileyFaceASCII = "   *****   \n" +
                " *       * \n" +
                " *  O O  * \n" +
                " *   ^   * \n" +
                " *  \\_/  * \n" +
                " *       * \n" +
                "   *****   \n";

        return smileyFaceASCII;
    }

    public static Shop Setup(Shop shop) {

        shop.AddFood(unknownStr, unknownStr, 0);

        return shop;
    }

    public static void Eat(Shop shop) {
        if(shop.IsFoodIsOutOfStock()) {
            System.out.println("You can't anymore.");
            return;
        }

        System.out.println("You eat food." );
    }

    public static void Back(String name) {
        System.out.println(name + " thank you for comming.");
    }

    public static void CallShef(String name1, String name2) {

        System.out.println("Hello! I'm " + name1 + " What your name?");
        System.out.println("Hi! My name is " + name2 + ". How are you today " + name1);

        System.out.println("(0: I'm good, 1: want food, other: back!");
        String takeChoice = kb.nextLine();
        switch (takeChoice) {
            default:
                System.out.println(name2 + ": Nice to see you " + name1 + ".");
                break;
            case "1":
                System.out.println(name1 + ": let's me get inside, I long food pls give me buy one.");
                break;
            case "0":
                System.out.println(name1 + ": " + "I'm good" + "\n" + name2 + ": nice to talk to you.");
                break;
        }
        System.out.println("-------------------------------\n");
    }

    

}

