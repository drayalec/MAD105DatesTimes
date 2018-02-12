package com.example.java;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // stores local date of today (2.11.2018)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); //this will set the format of dates

        LocalDate full_moon = LocalDate.of(2018, 3, 1); //setting variable to the next full moon.

        LocalDate full_moon2 = LocalDate.of(2018, 3, 31);
        // storing the current year, day of month, and month values for use later
        int currentyear = today.getYear();
        int currentday = today.getDayOfMonth();
        int currentmonth = today.getMonthValue();

        // reformatting each of the dates into new strings
        String currentdate = today.format(formatter);
        String nextMoon = full_moon.format(formatter);
        String secondMoon = full_moon2.format(formatter);

        //Setting variable equal to the days until the next full moon (starting from system time/date)
        long daysuntilmoon = today.until(full_moon, ChronoUnit.DAYS);
        long daysuntilmoon_2 = today.until(full_moon2, ChronoUnit.DAYS);

        //If the system date is equal to the date of the next full moon, than the program will notify the user.
        if (currentmonth == 3 && currentday == 1 && currentyear == 2018) {
            System.out.println("Today's date is:  " + currentdate);
            System.out.println("There is a full moon today");
        }
        //else it will print the date, then print the time until and the specific date of the next two full moons.

        else {
            System.out.println("Today's date is:  " + currentdate);
            System.out.println();
            System.out.println("The next full moon is in " + daysuntilmoon + " days");
            System.out.println("Which would be : " + nextMoon);
            System.out.println();
            System.out.println();
            System.out.println("The following full moon after that is in " + daysuntilmoon_2 + " days from now");
            System.out.println("Which would be : " + secondMoon);


        }
    }    
}
