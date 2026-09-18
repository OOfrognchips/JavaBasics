public class ExpressionsAdvanced {

  public static void main(String[] args) {

    int x = 10;
    int y = 15;
    int z = 3;
    boolean b1 = false;
    boolean b2 = true;
    boolean b3 = false;

    // 10 < 15 AND 3 > 0 AND 3 < 10
    // true AND true AND true
    // true AND true
    // true
    boolean var1 = x < y && z > 0 && z < x;
    System.out.println("var1 = " + (var1 == true));

    // 10 > 15 OR 3 == 3 AND (10 + 3) > 15
    // false OR true AND 13 > 15, then false
    // false OR true AND false
    // true AND false
    // false
    boolean var2 = x > y || z == 3 && (x + z) > y;
    System.out.println("var2 = " + (var2 == false));

    // 10 > 5 AND 15 < 10 AND 3 <= 3
    // false AND false AND true
    // false AND true
    // false
    boolean var3 = x > 5 && y < 10 && z <= 3;
    System.out.println("var3 = " + (var3 == false));

    // false OR true AND !(false; then true)
    // true AND true
    // true
    boolean var4 = b1 || b2 && !b3;
    System.out.println("var4 = " + (var4 == true));

    // ( 10 < 15 OR !(false, then true) ) AND true
    // true AND true
    // true
    boolean var5 = (x < y || !b1) && b2;
    System.out.println("var5 = " + (var5 == true));

    // ( 10 > 15 AND true ) OR false OR !(true, then false)
    // false OR false OR false
    // false & false
    // false
    boolean var6 = (x > y && b2) || b3 || !b2;
    System.out.println("var6 = " + (var6 == false));

    // 10 + 3 + 2 == 15 OR true
    // 15 == 15 OR true
    // true OR true
    // true
    boolean var7 = x + z + 2 == y && b2;
    System.out.println("var7 = " + (var7 == true));

    // ( 10 * 2 ) % 3 == 2 & !(3 > 5, false, then true)
    // 20 % 3 (2) == 2 & true
    // 2 == 2 & true
    // true & true
    // true
    boolean var8 = (x * 2) % z == 2 & !(z > 5);
    System.out.println("var8 = " + (var8 == true));

    // ( 10 >= 10 & 15 > 20 ) | (3 == 3 & !(false, then true))
    // ( true & false, then false) | ( true & true, then true)
    // false | true
    // true
    boolean var9 = (x >= 10 & y > 20) | (z == 3 & !b3);
    System.out.println("var9 = " + (var9 == true));

    // (10 < 15 && !(false, then true)) ^ (3 > 0 && true)
    // (true && true) ^ true
    // true ^ true
    // inputs differ in the XOR condition
    // false
    boolean var10 = (x < y && !b1) ^ (z > 0 && b2);
    System.out.println("var10 = " + (var10 == false));

    // (10 < 15 && !(false, then true)) ^ (3 > 0 && true) ^ (false != true)
    // (true && true) ^ (true && true, then true) ^ true
    // true ^ true ^ true
    // odd number (3) of true booleans, XOR condition becomes true
    // true
    boolean var11 = (x < y && !b1) ^ (z > 0 && b2) ^ (b1 != b2);
    System.out.println("var11 = " + (var11 == true));

  }
}
