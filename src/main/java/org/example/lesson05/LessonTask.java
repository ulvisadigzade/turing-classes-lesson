package org.example.lesson05;

public class LessonTask {
    /*
        Task:
        Create string "Hello World"

        research it's methods
    */


    public static void start(){
        String word = "hello World";

        // .isEmpty(), checks if string has length 0, can use .length()==0 instead
        System.out.println(word.isEmpty());

        // .equals(), checks if to string contents are equal, doesn't compare reference
        System.out.println(word.equals("hello World")); // -> true

        // .charAt(), returns character at specific index
        System.out.println(word.charAt(4)); // -> o

        // .startsWith(), checks if string starts with specifix prefix
        System.out.println(word.startsWith("hel")); // -> true
        //can use start index , .startsWitch(prefix,offset)

        // .toLowerCase(), creates new string where each character converted to lower case
        System.out.println(word.toLowerCase()); // -> hello world

        // .length(), returns number of characters in string
        System.out.println(word.length()); // -> 11

        // .concat(), returns new string by concatenating 2 strings
        System.out.println(word.concat("!")); // -> hello World!

        // .contains(), checks if string contains another string
        System.out.println(word.contains("java")); // -> false
    }
}
