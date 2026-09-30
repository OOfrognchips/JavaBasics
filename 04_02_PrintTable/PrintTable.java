public class PrintTable {
  public static void main(String[] args) {
    int[] ages = new int[4];
    double[] grades = new double[4];
    String[] names = new String[4];
    String[] lastnames = new String[4];
    String[] subjects = new String[4];

    ages[0] = 25;
    grades[0] = 8.756;
    names[0] = "Alice";
    lastnames[0] = "Black";
    subjects[0] = "Maths";

    ages[1] = 33;
    grades[1] = 7.734;
    names[1] = "Peter";
    lastnames[1] = "Green";
    subjects[1] = "Geography";

    ages[2] = 24;
    grades[2] = 9.142;
    names[2] = "Anne";
    lastnames[2] = "White";
    subjects[2] = "Computing";

    ages[3] = 23;
    grades[3] = 6.2663;
    names[3] = "John";
    lastnames[3] = "Pink";
    subjects[3] = "Physics";

    System.out
      .printf("|NAME      |LASTNAME  |AGE       |SUBJECT   |GRADE     |%n");
    System.out
      .printf("|----------|----------|----------|----------|----------|%n");
    for (byte i = 0; i < 4; i++) {
      System.out.printf("|%-10s|%-10s|%10d|%-10S|%10.2f|%n", names[i],
        lastnames[i], ages[i], subjects[i], grades[i]);
    }
  }
}
