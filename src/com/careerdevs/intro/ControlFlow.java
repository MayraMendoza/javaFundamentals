package com.careerdevs.intro;

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









    }
}
