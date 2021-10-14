import java.util.Scanner;

public class EmailGenerator {


    public static String makeUserName(String fullName){

        //User's initial of Firstname
        String initialFirst = fullName.substring(0,1);

        //User's last name
        int index = fullName.indexOf(" ");
        String lastName = fullName.substring(index + 1);

        //Random Number 10-99 (Inclusive)
        int number = (int) (Math.random() * 90) + 10;

        //Username without letter
        String Name1 = initialFirst + lastName;

        //Username
        return Name1 + number;

    }

    public static String makeEmail(String userNameEmail, String emailProvider){

        return userNameEmail + "@" + emailProvider;

    }

    public static void main (String[] args){

        //scanner
        Scanner scan = new Scanner(System.in);

        //User's full name
        System.out.print("What is your full name: ");
        String name = scan.nextLine();

        //User's full name to lower case
        String lowerUserName = name.toLowerCase();

        //Method for UserName
        String Username = makeUserName(lowerUserName);

        //User input for Email Provider
        System.out.print("What is your email provider: ");
        String emailProvider = scan.nextLine();

        //User input (Email Provider) to lower case
        String lowerEmailProvider = emailProvider.toLowerCase();

        //Method for User Email
        String UserEmail = makeEmail(Username, lowerEmailProvider);

        //Print Username and Email Address
        System.out.println(" ");
        System.out.println("Username: " + Username);
        System.out.println("Email: " + UserEmail);


    }

}
