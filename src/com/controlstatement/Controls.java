package com.controlstatement;

public class Controls {

    public static void main(String[] args) {

        int i = 10;

        {
            int k = 15;
            System.out.println("i =" + i);
            System.out.println("k =" + k);
        }

        int testScore = 65;
        System.out.printf("You've got ");
        if (testScore >= 90) {
            System.out.printf("an Excellent ");
        } else if (testScore >= 75) {
            System.out.printf("a Good");
        } else if (testScore >= 60) {
            System.out.printf("a Satisfactory ");

        } else {
            System.out.printf("an bad ");
        }
        System.out.println("mark");
    }
}
