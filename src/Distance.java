import java.util.Scanner;



public class Distance {

    public static double distance(int x1, int y1, int x2, int y2) {

        double x = (x2 - x1);
        double y = (y2 - y1);
        double power1 = Math.pow(x, 2);
        double power2 = Math.pow(y, 2);
        double power = power1 + power2;
        return Math.abs(Math.sqrt(power));

    }

    // create the distance method below. See the instructions for the signature of the method.
    public static void main(String[] args) {

        // Create your main method below. It will get the input (you will need a Scanner), call the distance
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = scan.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        int y1 = scan.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = scan.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = scan.nextInt();
        // method, and then print the results.
        double distance = distance(x1, y1, x2, y2);
        System.out.print("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);

    }
}
