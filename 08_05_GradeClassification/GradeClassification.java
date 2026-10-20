import java.util.Scanner;

public class GradeClassification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numeric grade (0-100):");
        short grade = input.nextShort();

        if (grade >= 90 & grade <= 100) {
            System.out.println("A = Excellent");
        } else if (grade >= 70 & grade <= 89) {
            System.out.println("B = Good");
        } else if (grade >= 60 & grade <= 69) {
            System.out.println("C = Satisfactory");
        } else if (grade >= 50 & grade <= 59) {
            System.out.println("D = Pass");
        } else if (grade >= 0 & grade <= 49) {
            System.out.println("F = Fail");
        } else {
            System.out.println("Invalid grade");
        }
    }
}
