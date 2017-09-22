package com.exerciseTwo;

public class WeekDaysUtilites {
    private static String isItWorkingDayOrFreeDay(int day) {
        if (day < 6) {
            return "pracujący";
        } else {
            return "wolny";
        }
    }

    public static void dayInfo(int day) {
        switch (day) {
            case 1:
                System.out.println("Poniedziałek to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 2:
                System.out.println("Wtorek to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 3:
                System.out.println("Sroda to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 4:
                System.out.println("Czwartek to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 5:
                System.out.println("Piątek to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 6:
                System.out.println("Sobota to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            case 7:
                System.out.println("Niedziela to: dzień " + isItWorkingDayOrFreeDay(day));
                break;
            default:
                System.out.println("Niepoprawne dane");
        }
    }
}
