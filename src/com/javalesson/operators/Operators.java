package com.javalesson.operators;

public class Operators {

    public static void main(String[] args) {
//        + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

//        a = a + 5;
//        a += 5;
        ++a;
        System.out.println("New a = " + a);

//        a = a + 1;
        --b;
        System.out.println("New b = " + b);

        double n = 7;
        double m = 7;

        double res1 = 2 * n++;
        double res2 = 2 * ++m;

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

//        == != < > <= >= && ?:
        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = x == y;
        System.out.println("boolVal = " + boolVal);

        boolean boolVal2 = y != z;
        System.out.println("boolVal2 = " + boolVal2);

        boolean boolVal3 = n >= m;
        System.out.println("boolVal3 = " + boolVal3);

        boolean boolVal4 = y > z;

        boolean resultBoolean = boolVal3 && boolVal4;
        System.out.println("resultBoolean = " + resultBoolean);

        boolean resultBoolean2 = boolVal3 || boolVal4;
        System.out.println("resultBoolean2 = " + resultBoolean2);

//      true && true = true
//      true && false = false
//      true || true = true
//      false | false = false

        int res = x > y ? x : y;
        System.out.println("Ternary res = " + res);

        int res3 = (x > y) && (z < y) ? x : y;
        System.out.println("Ternaty res3 = " + res3);

        System.out.println("NOT = " + !(x > y));


    }


}
