package org.example.lesson06;

import java.util.Random;

public class RandomPlaceGenerator {
    public static void main(String[] args) {
        String[] students = {
                "Huseyn",
                "Aqil",
                "Emin",
                "Sadulla",
                "Ramzi",
                "Ebulfez",
                "Saleh",
                "Trual",
                "Yusif",
                "Ayla",
                "Sevinc",
                "Orkhan",
                "Ulvi",
                "Ays",
                "Assassin"
        };

        int[] placesOfStudents = new int[students.length];

        generateRandomPlaces(students,placesOfStudents);
        printOrders(students,placesOfStudents);
    }

    public static void generateRandomPlaces(String[] students ,int[] placesOfStudents){
        int numberOfStudents = students.length;
        int studentIndex=0;
        Random random = new Random();

        while(studentIndex<numberOfStudents){
            int randomPlace =  random.nextInt(numberOfStudents)+1;

            if(containsPlace(placesOfStudents,studentIndex,randomPlace)){
                continue;
            }

            placesOfStudents[studentIndex]=randomPlace;
            studentIndex++;
        }
    }

    public static boolean containsPlace(int[] placesOfStudents, int upToIndex, int randomPlace){
        // we don't need check whole array, only up to current index, other elements are 0
        for(int i=0;i<upToIndex;i++){
            if(placesOfStudents[i]==randomPlace){
                return true;
            }
        }
        return false;
    }

    public static void printOrders(String[] students ,int[] placesOfStudents){
        for(int i=0;i<students.length;i++){
            System.out.printf("%s's place is %d\n",students[i],placesOfStudents[i]);
        }
    }
}
