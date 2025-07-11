package turing.lesson04;

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void generator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number N:");
        int N = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
