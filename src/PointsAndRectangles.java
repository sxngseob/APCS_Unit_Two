import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        System.out.print("Enter the x coordinate: ");
        int coordinateX = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int coordinateY = scan.nextInt();

        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point objectP = new Point(coordinateX, coordinateY);

        // create print statements and get input for the length and width
        System.out.print("Enter the length: ");
        int length = scan.nextInt();
        System.out.print("Enter the width: ");
        int width = scan.nextInt();

        //Instantiate a Dimension object d.
        Dimension objectD = new Dimension(length, width);

        //Instantiate a Rectangle object r.
        Rectangle objectR = new Rectangle(coordinateX, coordinateY, length, width);

        // Print each object p, d, and r on a separate line.
        System.out.println(objectP);
        System.out.println(objectD);
        System.out.println(objectR);
    }
}