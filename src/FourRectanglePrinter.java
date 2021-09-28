import java.awt.*;

public class FourRectanglePrinter {

    public static void main(String[] main) {

        Rectangle box = new Rectangle(5, 3, 7, 13);
        System.out.println(box);

        // Use the translate method to move the box over to the right.
        box.translate(7,0);
        // Print the box
        System.out.println(box);
        // Use translate to move the box down
        box.translate(0,13);
        // Print the box
        System.out.println(box);
        // Use translate to move the box to the left
        box.translate(-7,0);
        // print the box
        System.out.println(box);

    }
}
