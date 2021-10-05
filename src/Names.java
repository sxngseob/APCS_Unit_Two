import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.print("First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Last Name: ");
        String lastName = scan.nextLine();

        System.out.println(firstName + " " + lastName);

        int length = firstName.length() + lastName.length();
        System.out.println(length);

        String initials = firstName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initials);

        System.out.println(firstName.compareTo(lastName));

        int indexPosition1 = firstName.length() + 1;
        int indexPosition2 = firstName.length();
        int indexPosition4 = lastName.length() + 1;
        int indexPosition3 = lastName.length();
        int index = firstName.indexOf(indexPosition3, indexPosition4);
        System.out.println(index);


        int index1 = lastName.indexOf(indexPosition2, indexPosition1);
        System.out.println(index1);

        int mid1;
        int mid2;

        int lengthFirst = firstName.length();
        int lengthLast = lastName.length();

        mid1 = lengthFirst / 2;
        mid2 = lengthLast / 2;

        String mid3 = firstName.substring(0, mid1);
        String mid4 = lastName.substring(0,mid2);

        String mid5 = firstName.substring(mid1);
        String mid6 = lastName.substring(mid2);

        System.out.print(mid3 + mid6);
        System.out.print(" ");
        System.out.println(mid4 + mid5);

        // Use the required string methods to print out the information


    }
}
