import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);

        // Get input for x, y, width, and height. Create four separate variables for these.

        System.out.print("X: ");
        int x = scan.nextInt();

        System.out.print("Y: ");
        int y = scan.nextInt();

        System.out.print("Width: ");
        int width = scan.nextInt();

        System.out.print("Height: ");
        int height = scan.nextInt();

        // Create a Rectangle object using the four pieces of user input.
        Rectangle square = new Rectangle(x,y,width, height);

        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        double perimeter = square.getWidth() * 2 + square.getHeight() * 2;
        System.out.println("Perimeter = " + perimeter);

        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        square.setLocation(-1,-7);
        System.out.print("New location is (" + square.getX() + ", " +  square.getY() + ")");
    }
}
