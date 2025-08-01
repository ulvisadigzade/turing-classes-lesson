package turing.lesson12;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;


public class BirthDayApp {
    public static void main(String[] args) {
        int birthYear, birthMonth, birthDay;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();

        System.out.print("Enter your birth month: ");
        birthMonth = sc.nextInt();

        System.out.print("Enter your birth day: ");
        birthDay = sc.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();

        if (birthDate.isAfter(today)) {
            System.out.println("Birth date is in the future.");
            return;
        }

        long daysLived = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println(daysLived);
    }
}
