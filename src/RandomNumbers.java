public class RandomNumbers {

    public static int getRandom() {

        return (int) (Math.random() * 37 + 1);

    }

    // create a static method called getRandom() that does not take any parameters and returns an int
    // between 0 and 37 inclusive.

    // Write a main method that calls the getRandom() function five times and prints the result. Make sure to
    // uncomment the RandomNumbersTest when ready to test your code.
    public static void main(String[] args) {

        System.out.print(getRandom());
        System.out.print(getRandom());
        System.out.print(getRandom());
        System.out.print(getRandom());
        System.out.print(getRandom());


    }

}
