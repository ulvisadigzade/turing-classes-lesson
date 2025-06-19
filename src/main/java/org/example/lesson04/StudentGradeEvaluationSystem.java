package org.example.lesson04;

import java.util.Scanner;

public class StudentGradeEvaluationSystem {

    public static void evaluate(){
        /*
            Scores: 55, 40, 80 → Failed - One or more exam scores are too low.
            It's example in pdf, but it's not correct.
            There is no score below 40.
         */

        System.out.println("Enter you scores:");
        Scanner sc = new Scanner(System.in);
        double score1,score2,score3,average;

        score1 = sc.nextDouble();
        score2 = sc.nextDouble();
        score3 = sc.nextDouble();
        average = (score1+score2+score3)/3;

        if(score1<40 || score2<40 || score3<40){
            System.out.println("Failed - One or more exam scores are too low.");
        }
        else if(average>=85 && score1>=85 && score2>=85 && score3>=85){
            System.out.println("Congratulations! You have earned a Certificate of Excellence.");
        }
        else if(average>=70 && average<85 && score1>=60 && score2>=60 && score3>=60){
            System.out.println("Well done! You have earned a Certificate of Achievement.");
        }
        else if(average>=50 && average<70){
            System.out.println("You passed.");
        }
        else{
            System.out.println("Failed");
        }
    }
}
