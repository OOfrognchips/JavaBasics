import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici2 {
    /*
    // Varargs (Java 5) create an array under the hood for all the variables used as parameters
    static float localMaxMin(byte type, float... numbers) {
    // Asume the first number is the biggest or the smallest
    float dummyNumber = numbers[0];
    
    if (type == 1) { // Max
      // Quick operator to create a for-each loop
      for (float number : numbers) {
        // Override the value of the variable if the comparison results in a new bigger number
        dummyNumber = Math.max(dummyNumber, number);
      }
      return dummyNumber;
    
    } else if (type == 2) { // Min
      // Quick operator to create a for-each loop
      for (float number : numbers) {
        // Override the value of the variable if the comparison results in a new smaller number
        dummyNumber = Math.min(dummyNumber, number);
      }
      return dummyNumber;
    
    }
    return dummyNumber;
    }
    */

    public static void main(String[] args) {
        ArrayList<Float> storage = new ArrayList<Float>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first temp:");
        float temp1 = input.nextFloat();
        storage.add(temp1);

        System.out.println("Enter second temp:");
        float temp2 = input.nextFloat();
        storage.add(temp2);

        System.out.println("Enter third temp:");
        float temp3 = input.nextFloat();
        storage.add(temp3);

        System.out.println("Enter fourth temp:");
        float temp4 = input.nextFloat();
        storage.add(temp4);

        System.out.println("Enter fifth temp:");
        float temp5 = input.nextFloat();
        storage.add(temp5);

        // System.out.printf("Max: %.1f%n", localMaxMin((byte)1, temp1, temp2, temp3, temp4, temp5));
        // System.out.printf("Min: %f%n", localMaxMin((byte)2, temp1, temp2, temp3, temp4, temp5));

        System.out.printf("Max: %.1f%nMin: %.1f%n", Collections.max(storage),
            Collections.min(storage));
    }

}
