import java.util.Scanner; // Import the Scanner class

import Human.*;
import Shop.*;

public class mainApp {

    public static Scanner kb = new Scanner(System.in); // Create a Scanner object
    public static String unknownStr = "???";

    public static void main(String[] args) {
        String inputAnswer = null;
        boolean flag1 = true;

        //// -Initialize- ////
        Customer customer = new Customer(unknownStr);
        Chef chef = new Chef("Bobby");

        // Create an instance of Bakery, which is a subclass of Shop
        Shop bakery = new Shop("Bakery", true);

        // Add Candy and Bread to the Bakery
        for(int i = 0; i < 12; i++) {
            bakery.AddFood("Baguette no." + i, "Bread",50);
        }

        for(int i = 0; i < 4; i++) {
            bakery.AddFood("Chickend no." + i + 1, "Meat",40);
        }

        for(int i = 0; i < 4; i++) {
            bakery.AddFood("Cockroach no." + i + 1, "Creature",40);
        }
        for(int i = 0; i < 4; i++) {
            bakery.AddFood("Alien no." + i + 1, "Creature",999);
        }
        for(int i = 0; i < 4; i++) {
            bakery.AddFood("Shark hoodie no." + i + 1, "Hoodie",.50d);
        }
        

        
        System.out.println(GetSmileyFaceASCII());
        System.out.println("Welcome to bakery house.");

        SetNameOfCustomer(customer);
        SetPronouns(customer);
        System.out.println(customer.GetPronouns() + " " + customer.GetName() + " is enter the bakery house.");
        //
            
        //
        System.out.println("Hi I'm " + chef.GetName() + " what do you want?");
        do {
            if (inputAnswer == null) {
                System.out.println("1 : I want Bread. Do you have it? \n"
                        + "2 : I want Candy. Do you have it? \n"
                        + "3 : What menu are sold in this shop?\n"
                        + "4 : Eat now random menu?\n"
                        + "5 : Go home.\n");
                Scanner ctm = new Scanner(System.in);
                String ans = ctm.nextLine();
                //
                switch (ans) {
                    case "1":
                        System.out.println("Bread? ok follow me sir.");
                        break;
                    case "2":
                        System.out.println("Candy? ok follow me sir.");
                        break;
                    case "3":
                        System.out.println("Here's the menu, sir.");
                        bakery.ShowMenu();
                        break;
                    case "4":
                        customer.Eat("food");
                        break;
                    case "5":
                        System.out.println("Go home");
                        flag1 = false;
                        break;

                }
            }
        } while (flag1);
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
}
