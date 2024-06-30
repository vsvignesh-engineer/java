package app.vignesh;

public class Operators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 30;

        // Note : BODMAS - Brackets , Of , Division, Multiplication, Addition, Subtraction

        // Arithmetic Operators
        int addition = numberOne + numberTwo;
        int subtraction = numberTwo - numberOne;
        int multiplication = numberOne * numberTwo;
        int division = numberTwo / numberOne;
        int modulus = numberOne % numberTwo;

        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : " + division);
        System.out.println("Modulus : " + modulus);

        // Prints an empty line
        System.out.println();

        // Increment and Decrement Operator
        int numberThree = 1;
        int numberFour = 1;
        int increment = numberThree + 1;
        int decrement = numberFour - 1;
        System.out.println("Increment :" + increment);
        System.out.println("Decrement :" + decrement);

        System.out.println("PreIncrement : " + ++numberThree);      // Result is 1, output is 2
        System.out.println("PostIncrement : " + numberThree++);     // Output is 2 , result is 3
        System.out.println("NumberThree : " + numberThree);         // Output is 3

        System.out.println("PreDecrement : " + --numberFour);       // Result is 0, output is 0
        System.out.println("PostDecrement : " + numberFour--);      // Result is 0, output is -1
        System.out.println("NumberFour : " + numberFour);           // Output is -1

        // Prints an empty line
        System.out.println();

        // Shorthand form
        numberThree += 2;                                           // Result is 5
        numberThree++;                                              // Result is 6
        System.out.println("Shorthand Result : " + numberThree);

        /*
            **** Shorthand ****
            x += y is x = x + y;
            x -= y is x = x - y;
            x *= y is x = x * y;
            x /= y is x = x / y;
            x %= y is x = x % y;
         */

        //Note : Shorthand form can be used for addition, subtraction, multiplication and division

        // Prints an empty line
        System.out.println();

        // Comparison Operators
        // < <= > >= == !=
        // Result of Comparison Operator is always a boolean
        System.out.println(10 < 10);    // false
        System.out.println(10 <= 10);   // true
        System.out.println(10 > 10);    // false
        System.out.println(10 >= 10);   // true
        System.out.println(10 == 10);   // true
        System.out.println(10 != 10);   // false
    }
}
