/*
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
*/

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int number1FirstDigit, number1LastDigit, number2FirstDigit, number2LastDigit;
        number1LastDigit = number1 % 10;
        number1 /= 10;
        number1FirstDigit = number1 % 10;        
        number2LastDigit = number2 % 10;
        number2 /= 10;
        number2FirstDigit = number2 % 10;
        if (number1LastDigit == number2FirstDigit || number1LastDigit == number2LastDigit || number1FirstDigit == number2FirstDigit || number1FirstDigit == number2LastDigit) {
            return true;
        }
        return false;        
    }
}
