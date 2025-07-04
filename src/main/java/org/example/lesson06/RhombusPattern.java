package org.example.lesson06;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rhombusSide = scanner.nextInt();

        generateRhombus(rhombusSide);
    }

    public static void generateRhombus(int rhombusSide){
        int with = 2*rhombusSide+1;
        int spaceSize = rhombusSide;

        for(int i=1;i<=with;i+=2){
            for(int j=1;j<=spaceSize;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            spaceSize--;
            System.out.println();
        }

        spaceSize=1;
        for(int i=with-2;i>=1;i-=2){
            for(int j=1;j<=spaceSize;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            spaceSize++;
            System.out.println();
        }
    }
}

