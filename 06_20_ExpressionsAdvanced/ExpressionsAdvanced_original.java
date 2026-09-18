public class ExpressionsAdvanced {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int z = 3;
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;

        boolean var1 = x < y && z > 0 && z < x;
        System.out.println("var1 = " + (var1 == ??? ));

        boolean var2 = x > y || z == 3 && (x + z ) > y ;
        System.out.println("var2 = " + (var2 == ??? ));

        boolean var3 = x > 5 && y < 10 && z <= 3;
        System.out.println("var3 = " + (var3 == ??? ));

        boolean var4 = b1 || b2 && !b3;
        System.out.println("var4 = " + (var4 == ??? ));

        boolean var5 = (x < y || !b1) && b2;
        System.out.println("var5 = " + (var5 == ??? ));

        boolean var6 = (x > y && b2) || b3 || !b2;
        System.out.println("var6 = " + (var6 == ??? ));

        boolean var7 = x + z + 2 == y && b2;
        System.out.println("var7 = " + (var7 == ??? ));

        boolean var8 = (x * 2) % z == 2 & !(z > 5);
        System.out.println("var8 = " + (var8 == ??? ));

        boolean var9 = (x >= 10 & y > 20) | (z == 3 & !b3);
        System.out.println("var9 = " + (var9 == ??? ));

        boolean var10 = (x < y && !b1) ^ (z > 0 && b2);
        System.out.println("var10 = " + (var10 ==  ??? ));
        
        boolean var11 = (x < y && !b1) ^ (z > 0 && b2) ^ (b1 != b2);
        System.out.println("var11 = " + (var11 ==  ??? ));

    }
}
