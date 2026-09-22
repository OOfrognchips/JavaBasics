public class Hours2Seconds {

  static int formula(short value) {
    int result = value * 3600;
    return result;
  }

  public static void main(String[] args) {
    short hours = 12;
    System.out.println(hours + " hours are " + formula(hours) + " seconds");

    hours = 15;
    System.out.println(hours + " hours are " + formula(hours) + " seconds");

    hours = 23;
    System.out.println(hours + " hours are " + formula(hours) + " seconds");
  }

}
