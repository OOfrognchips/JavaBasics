import java.math.BigDecimal;

public class PowerFormula {
  public static void main(String[] args) {
    byte force = 125;
    byte distance = 37;
    byte time = 12;

    // The double variable type is more precise than a float
    // At least one variable is needed as a double so all the decimals are shown in the output
    double power = (force * distance) / (double)time;
    System.out.println("Power = " + power + " W");
  }
}
