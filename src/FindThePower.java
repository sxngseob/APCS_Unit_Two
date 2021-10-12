import java.util.Scanner;

public class FindThePower {

    // create a main method below and follow the given requirements carefully.
    public static void main(String[] args) {

        // Remember to create a Scanner object in order to get input from the user.
        Scanner scan = new Scanner(System.in);
        // You will need to uncomment the FindThePower test in order to get it to run.
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();

        System.out.print(base + "^" + exp + " = ");
        System.out.print((int) Math.pow(base, exp));


    }
}
