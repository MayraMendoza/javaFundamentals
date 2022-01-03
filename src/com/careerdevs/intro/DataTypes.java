package com.careerdevs.intro;

import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        // -------------------- Variables ----------------------------
        // variables we use variables to temporarily store data in computers memory.
        // first to declare type of variable --> name(identifier) --> (=) assignment operator  --> value being assigned
        int age = 30; // only whole numbers
        int temperture = 20; // it is best practice, to declare one variable per line.
        age = 35; // we can also change the values of variables like this.
        System.out.println(age);

        // you can copy the value of one variable into another lile this.
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        // -------------------------primitive types-------------------------------
        // one byte allows you to store numbers up to 127.. we dont need an int.
        byte age1 =30;
        long viewsCount = 3_123_456_789L; // always use meaningful names for variables
        // you can use _ instead of an , between large numbers to make them more readible.
        // add L to suffix of the number to make sure java sees the long numbers as whole numbers.\
        float price = 10.99f; // add suffix f to represent number as a float since java sees 10.99 as a double.
        char letter = 'A';
        boolean isEligible = false;

        //------------------ Reference Types ----------------
        // refrence types are used to store complex objects
        byte age3 = 30;
        Date now = new Date(); // instance of the date class
        // object is an instance of a class
        System.out.println(now);




    }
}
