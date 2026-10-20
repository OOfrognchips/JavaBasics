public class CubicEquation {

    static int formula(int value) {
        // Declare the function as a float variable in case of decimals and operate using operators
        // The pow function returns a double rather than a float, so convert it to an int as requested by the exercise
        int result = ((int)Math.pow(value, 3)) + (2 * ((int)Math.pow(value, 2)))
            + (4 * value) + 5;
        return result;
    }

    public static void main(String[] args) {
        // Use the int variable type to prevent any issue
        int x = 3;
        System.out.println("f(3) = " + formula(x));

        x = 5;
        System.out.println("f(5) = " + formula(x));

        x = 10;
        System.out.println("f(10) = " + formula(x));
    }
}
