package com.controlstatement;

public class SwitchCase {

    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is the first working day");
                break;
            case "tuesday":
                System.out.println("This is the second working day");
                break;
            case "wednesday":
                System.out.println("This is the third working day");
                break;
            case "thursday":
                System.out.println("This is the fouth working day");
                break;
            case "friday":
                System.out.println("This is the fifth working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Good Bye!");
                break;
            default:
                System.out.println("Not a day of the week");
        }
        System.out.println("Final string");
    }
}
