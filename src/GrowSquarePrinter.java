import java.awt.*;

public class GrowSquarePrinter {

    public static void main(String[] args) {

        // Create a Rectangle object with a starting x, y of (100, 100) and a width and height of 50.
        Rectangle square = new Rectangle(100, 100, 50, 50);
        // print the rectangle object.
        System.out.println(square);
        // Use the translate and grow methods as described in the instructions
        square.grow(25,25);
        square.translate(25,25);
        // print the rectangle object.
        System.out.println(square);
    }
}
