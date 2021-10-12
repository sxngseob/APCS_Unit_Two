import java.util.Scanner;

public class TemperatureDifference {
    /**
     * This method will calculate the difference in two temperatures, regardless of which one is larger.
     * @param temp1 - an int temperature value
     * @param temp2 - an int temperature value
     * @return the absolute value of the difference between the two temps. Make sure to change the 0
     */
    public static int calculateDifference(int temp1, int temp2) {

        return Math.abs(temp1 - temp2);

    }

    public static void main(String[] args) {
        // Scanner object to get input
        Scanner scan = new Scanner(System.in);

        // Get the two temperatures from the user as input
        System.out.print("Enter the first temperature: ");
        int firstTemp = scan.nextInt();

        System.out.print("Enter the second temperature: ");
        int secondTemp = scan.nextInt();
        // Call the calculateDifference method and save the result in a variable.
        int tempChan = calculateDifference(firstTemp, secondTemp);
        System.out.print("Temperature changed " + tempChan + " degrees.");

        // Print out the information to the user
    }
}
