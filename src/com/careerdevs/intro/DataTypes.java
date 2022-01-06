package com.careerdevs.intro;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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

        // ------------------primitive vs reference types---------
        // primitive- store simple values
        byte x = 1;   // y and x are in two different memory locations/ independent of each other
        byte y = x;   // if value of x changes y will not be affected
        x = 2;         // they are copied by their value which are independent of each other.
        System.out.println(y);

        // reference type - store complex objects
        Point point1 = new Point(1,1) ;  // will be stored in an address of memory location
        Point point2 =  point1;                // they store a reference to an object (point one and point 2 are referencing
        point1.x = 2;                           // the same point object in memory if you update one of these variables the change will be visible to the other variable
        System.out.println(point2);             // reference are copied by their references.

        //----------------------------------Strings-------------------------------------------

        String message = "  Hello World" + "!!"; // strings are reference tye in java
        // we can concatenate a string using the  (+) plus operator.
        // since string is a class it has member we can access using the dot . operator
        // the ends with will check if the string ends with what ever you put in the parenthesis
        //System.out.println(message.endsWith("!!"));
        //System.out.println(message.startsWith("!!"));
        //System.out.println(message.length());      // can use to check the length of input by users
        //System.out.println(message.indexOf("World"));   // This will check the position of character or string thats is passed
        // with indexOf it will return -1 if the character or string passed is not present.
        //System.out.println(message.replace("!", "*")); // this method does not modify our
        // original string. it returns a different string. in java strings are immutable. we cannot mutate them or change them.
        //System.out.println(message.toLowerCase()); // this will return everything with lowercase letters
        //System.out.println(message.trim()); // we can get rid of white spaces before and after our message.


        // -----------------------------Escape sequence -------------------------------------
        String message1 = "Hello \"Mosh\""; // if you want to add double quotes to a string add \".
        // c:\Windows\..
        String message2 = " c:\\Windows\\.."; // to add backslashes you need to add \\ so it won't confuse it with you trying to add quotes.
        // \n add new line
        // \t add tab.
        System.out.println(message1);


        // ------------------------------ARRAYS -------------------------------
        // arrays are reference type
        // have fixed length

        int [] numbers = new int[5];  // inside the bracket we need to declare the length of the array.
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // will return the address of this object in memory
        System.out.println(Arrays.toString(numbers)); // to print array we will use to string
        // this will print out [1,2,0,0,0] the numbers that aren't declared will be set to 0 by default.
        // boolean will be initialized as false

        // if you know items ahead of time you can add them within curly braces

        int [] numbers1 = {2,3,5,1,4};
        System.out.println(numbers1.length);
        Arrays.sort(numbers1);    // this will sort numbers in an array.
        System.out.println(Arrays.toString(numbers1));

        // -------------------------Multi-dimensional Arrays ---------------------------
        // 2 rows 3 columbs
        int [][] numbers2 = new int[2][3];
        numbers2[0][0] = 1;
        System.out.println(numbers2); // will not print out array. it will show you the address in memory location.
        System.out.println(Arrays.deepToString(numbers2));

        int [][] numbers3 = {{1,2,3},{4,5,6}}; // how to add items manually in a two-dimensional array.
        System.out.println(Arrays.deepToString(numbers3));

        // ----------------------------Constants---------------------------------------
        // when you don't want the value of a variable to change it to a constant by adding final
        final float PI = 3.14F;  // finals ---- values cannot be changed

        // ---------------------------Arithmetic Expressions --------------------------
        double result = 10.0 / 3.0; // this will return a decimal
        // if you divide ints you will receive a whole number
        // you will need to convert numbers to a double or float to receive decimals.
        System.out.println(result);

        int a = 1;
        int b = a++;
        System.out.println(a);  // this will = 2
        System.out.println(b);  // this will = 1 (because a will be copied to b and then it will be incremented by one)
        // if you write it as a prefix ++a  1 will be added to a and then it will be copied to b.

        //augmented/ compound assignment operator  (turns this ) x = x +2  -----(same)--->  x+=2
        // it can be used with subtraction, division and multiplication.


        // ------------------------------ order of operations ----------------------
        int c = 10 + 3 * 2;
        System.out.println(c);
        // in math multiplication and division have a higher oder priority so they get applied first.
        // to change the order you wrap it in parentheses 10 +3 *2 = 16 ---(10 +3) *2 = 32.
        // -----> order of operations (), */ , +-

        // -----------------------------------casting ---------------------------
        // implicit casting- automatic casting/ automatic conversion.
        // when a value can be converted into a data type that is bigger casting/ conversion happens automatically
        // byte can be automatically converted into int, int can be converted into long
        // implicit casting happens when there is no chance of data being lost.
        // byte > short > int> long > float > double
        // explicit and implicit casting can only happen when types are compatible. (previous line).
        // we cannot cast a string to a number. we would have to use a wrap class
        // integer.parseIt() -- short -- float --- double etc.
        short d = 1;    //(2 bytes in a short)
        int e = d +2;   //(4 bytes in an int)
        // values stored in a short variable can also be stored in an int variable.
        //
        System.out.println(e);

        // floating point numbers -- will have to change double on both to receive decimal.

        double f = 1.1;
        double g = f +2;       // f is a double | 2 is an int(an int is less precise than a double.)
        //in this example java is going to automatically cast 2 to a double (2.0)
        System.out.println(g);

        // Explicit casting -
        double h = 1.1;
        int i = (int) h +2;
        System.out.println(i);
        // converting a string to a number (usually user input are received as strings)
        String j = "1";
        int k = Integer.parseInt(j)+2;
        System.out.println( k);

        //-------------------------------The Math Class-------------------------
        //java already has a Math class with alot of useful methods
        // the math class has a round method that allows you to round numbers
        // it is overloaded (which means you can enter different types )
        // the round method has one that accepts a float and returns an int
        // it also accepts a double type which returns a long.
        int results = Math.round(1.1F);  // will return 1.
        System.out.println(results);

        // another useful method in the math class is ceil which returns
        // Math.ceil(1.1F) will returns the smallest interger that is greater than
        // or equal to the number passed (1.1). ceiling of 1.1 is 2 .
        int result1 = (int) Math.ceil(1.1F);  // we need to explicitly cast this to an integer (int)
        // because you are trying to put a float which is bigger into an int--- will return 2
        System.out.println(result1);

        // we use floor when we want to find the largest number that is smaller or equal to the number that is passed.
        // this will return 1
        int result2 = (int)Math.floor(1.1F);
        System.out.println(result2);

        double result3 = Math.max(3.5, 2);
        System.out.println(result3);
        // this method is overloaded so you can mix doubles, ints, floats in the parameter
        // but make sure that the variable type is able to hold the type that is returned.

        int result4 = (int) Math.round(Math.random() * 100) ;  // will return a random number between 0-1 - multiply it
        // by 100 to return a number between 0-100.
        // to get an int without any decimal you will have to round and declare it an int
        // you will have to use explicit casting (add int before Math.round) because the number will be between 0 and 100.
        // can also be written like this
        int result5 = (int) (Math.random() * 100);
        System.out.println(result4);

        // ------------------------Formatting Numbers ---------------------------
        // how to format numbers in java.
        //
        //NumberFormat currency = new NumberFormat();
        // we cannot create an instance of the numberformat class because its abstract
        // the
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result6 = currency.format(1234567.891);
        System.out.println(result6);

        // formatting a number as a percent
        NumberFormat percent = NumberFormat.getPercentInstance(); // you can have this if
        // you are referencing to this multiple times.
        String result7 = percent.format(0.1);
        System.out.println(result7);

        // you can do a method chain if you are only calling it once
        String result8 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result8);

        // ---------------------------Reading input ---------------------
        // how to read input from the user.
        Scanner scanner = new Scanner(System.in);
        // to work with the terminal window, we will use System.in this is one of the fields in the system class
        //this object has a bunch of methods to read data --- they all start with next
        // example nextByte().. nextLine() etc...








































    }
}
