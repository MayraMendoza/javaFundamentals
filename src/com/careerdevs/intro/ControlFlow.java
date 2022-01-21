package com.careerdevs.intro;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        //------------------------------------Comparison Operators --------------------------------------
        //we use these comparison operators to compare primitive values (int, long, byte, boolean, char etc)
        int x = 1;
        int y = 1;

        System.out.println(x == y); // this will provide a boolean expression - true
        System.out.println(x != y); // this will provide a boolean expression - false (because the statement of x not equaling y is false)
        // theirs also > , < , <= , >=

        //-------------------------------------Logical operators ------------------------------------------
       //*(&&) logical operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;  // combine multiple boolean expressions
        // temperature is greater than 20 and tem is less than 30
        // if at least one of these statements is false then the entire result is false
        // java will evaluate the expression from left to right - if the first expression is false java will ignore the
        // second one (because && means they both have to be true)

        // *(||) or logical operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligibleFirst = hasHighIncome || hasGoodCredit;
        // with the or operator if at least one condition is true the result will be true.
        // if the first condition is false java will continue to the second one to see if it's true.

        // *(!) not operator
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome|| hasGoodCredit) && !hasCriminalRecord;
        // we want to make sure they don't have a criminal record so we use the not operator
        // !true = false. -- it will reverse the value of the boolean value or expression.

        // -------------------------------------- if statements -----------------------------------------------
        int temp = 32;
        if(temp > 30) {                                     //first clause
            System.out.println("Its a hot day");
            System.out.println("Drink water");
        } else if(temp > 20 && temp <= 30){                 // second clause
            System.out.println("Beautiful day");
        }else {                                             // third clause
            System.out.println("cold day");
        }


        int temp1 = 32;
        if(temp1 > 30) {                                     //first clause
            System.out.println("Its a hot day");
            System.out.println("Drink water");
        }
        else if(temp1 > 20 )// && temp < 30)               // second clause

            System.out.println("Beautiful day");
        else                                                // third clause
            System.out.println("cold day");

        // this statement (&& temp < 30) in clause 2 is not necessary because first clause already shows  that temp1 is greater than one if
        // it goes to clause two then first one is false temp will be less than 30

        //------------------------------------Simplifying if statements-------------------------------------------
        //We can only declare new variables in code blocks
        //but if we declare hasHighIncome inside the code block then it will be out of scope
        // so we have to declare it outside and then change it after if statements.
        int income = 120_000;
        boolean hasHighIncome1 = false;
        if (income > 100_000)
             hasHighIncome1 = true;
        else
            hasHighIncome = false;

        // --------IMPROVED/SIMPLIFIED IF STATEMENT
        // if has income is greater than 120000 then boolean hasHigh income wiil be set to true
        // if not it will be set to false. add parenthesis to make it easier to read


        int income1 = 120_000;
        boolean hasHighIncome2 = (income1 > 100_000);

        //------------------------------------ The Ternary Operator -----------------------------------

        int income2 = 120_000;
        String className;
        if (income2 > 100_000)
            className="First";
        else
            className ="Economy";

        // The statement above can be simplified to this.
        int income3 = 120_000;
        String className2="Economy";
        if (income2 > 100_000)
            className2="First";

        // Even further simplify you can use the ternary statement
        int income4 = 120;
        String className4 = income4 > 100_000 ?  "First" : "Economy";
        System.out.println(className4);

        //--------------------------------Switch Statements -------------------------
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("you're an admin");
                break;

            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
                break;
        }

        // instead of using this you can use a switch statement shown above.
        if (role== "admin")
            System.out.println("you're an admin");
        else if (role== "moderator")
            System.out.println("you are a moderator");
        else
            System.out.println("you are a guest ");

        //----------------------Exercise: FizzBuzz --------------------------------------------
        // if number is divisible by 5 you get fizz
        // if its divisible by 3 you get buzz
        // if number is divisible by both 5 and 3 - fizbuzz is printed out
        // if number is not divisible by 5 or 3 - print out number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int numberInput = scanner.nextInt();
        System.out.println(numberInput);

        if (numberInput % 5 == 0 && numberInput % 3 == 0 )
            System.out.println("fizzbuzz");

        else if (numberInput % 5 == 0)
            System.out.println("Fizz");

        else if (numberInput % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(numberInput);

        //--------------------------------for loops-------------------------------------------------
        // inside the parenthesis you need to declare a counter variable (usually i, j & k)
        //followed by a boolean expression determines how many times the loop will be executed
        //followed by an increment.

        for (int i = 0; i < 5; i++)
            System.out.println("Hello world");
        // if you have one statement you don't need to add curly braces
        // if you have multiple statements you need to add curly braces and make it a code block.



















    }
}
