import java.util.Scanner;

public class TriangleChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the first side:");
        float side1 = input.nextFloat();

        System.out.println("Enter the length of the second side:");
        float side2 = input.nextFloat();

        System.out.println("Enter the length of the third side:");
        float side3 = input.nextFloat();

        input.close();

        // Version 1
        /*
        float dummySide = side1;
        if (side1 == side2 & side1 == side3 & side2 == side3) {
        	System.out.println("Type: Equilateral");
        } else if (dummySide == side2 | dummySide == side3) {
        	dummySide = side2;
        	if (dummySide == side3 | dummySide == side1) {
        		dummySide = side3;
        		System.out.println("two sides");
        		if (dummySide == side1 | dummySide == side2) {
        			System.out.println("three sides");
        		} else if (dummySide != side1 | dummySide != side2) {
        			System.out.println("two sides");
        		}
        	} else if (dummySide != side3 | dummySide != side1) {
        		System.out.println("two sides");
        	}
        } else if (side1 != side2 & side1 != side3 & side2 != side3) {
        	System.out.println("no sides");
        }
        */

        // Version 2
        /*
        // All three sides
        if (side1 == side2 & side1 == side3 & side2 == side3) {
        	System.out.println("Type: Equilateral");
        
        // side1 & side2 only
        } else if (side1 == side2 & side1 != side3 & side2 != side3) {
        	System.out.println("Type: Isosceles");
        
        // side1 & side3 only
        } else if (side1 != side2 & side1 == side3 & side2 != side3) {
        	System.out.println("Type: Isosceles");
        
        // side2 & side3 only
        } else if (side1 != side2 & side1 != side3 & side2 == side3) {
        	System.out.println("Type: Isosceles");
        
        // Not a triangle
        } else if (side1 != side2 & side1 != side3 & side2 != side3) {
        	System.out.println("The sides cannot form a triangle");
        }
        */

        // Version 3
        if (side1 + side2 > side3 & side1 + side3 > side2
            & side2 + side3 > side1)
        {
            if (side1 == side2 & side2 == side3) {
                System.out.println("Type: Equilateral");
            } else if (side1 == side2 | side1 == side3 | side2 == side3) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Escalene");
            }
        } else {
            System.out.println("The sides cannot form a triangle");
        }
    }
}
