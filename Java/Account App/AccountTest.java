// Creating and manipulating an Account object
import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {
        //cCreating a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // create an Account object and assign it to myAccount 
        // OR
        // create an instance of Account Class
        Account myAccount = new Account();

        // display intial value of name 
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read name 
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read the line of text
        myAccount.setName(theName); // put the name in myAccount
        System.out.println(); // outputs a blank line

        // display the name stored in object myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}