package org.example;

import java.util.Scanner;

public class Main {
     /*
    	•	Mart, Aprel, May → Yaz
        •	İyun, İyul, Avqust → Yay
        •	Sentyabr, Oktyabr, Noyabr → Payız
        •	Dekabr, Yanvar, Fevral → Qış
        •	Əgər ay 1-dən 12-yə daxil deyilsə, “Yanlış ay” yazılsın
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(
                n<1 || n>12 ? "Yanlış ay":
                        n==12 || n==1 || n==2 ? "Qis" :
                                n>=3 && n<=5 ? "Yaz" :
                                        n>=6 && n<=8 ? "Yay" :
                                                "Payiz"
        );
    }
}