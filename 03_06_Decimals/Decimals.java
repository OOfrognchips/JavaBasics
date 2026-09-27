public class Decimals {

  static double genericMethod(double input, double quantity) {
    // Since the input is given as a double variable type, use it here too
    // Math.ceil could be used too here though, but the exercise requires us to use the following formula
    double formula =
      Math.round(input * Math.pow(10, quantity)) / Math.pow(10.0, quantity);
    return formula;
  }

  public static void main(String[] args) {
    double x = 12.3456789;

    System.out.println("Rounded to 0 decimals: " + (byte)genericMethod(x, 0));
    System.out.println("Rounded to 2 decimals: " + genericMethod(x, 2));
    System.out.println("Rounded to 4 decimals: " + genericMethod(x, 4));
    System.out.println("Rounded to 6 decimals: " + genericMethod(x, 6));
  }
}
