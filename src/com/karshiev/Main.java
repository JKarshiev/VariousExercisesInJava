// This console app calculates various types of exercises using if, else and while loop
// every method calculates different exercises
// 1: Shared digits of two random number 2: Checks if at least two of three numbers have the same last digits
// 3: Calculates GCD of two random integers 4: Finds factors of given numbers 5: Checks if the given number is perfect number or not
// all of the exercises checked in main method if necessary
package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("These numbers have shared digits: " + hasSharedDigit(firstNumber, secondNumber));
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Insert three numbers in the range of 10 to 1000: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("These numbers have common last digits: " + hasSameLastDigit(number1, number2, number3));
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Insert numbers larger than 10 which you want to find their GCD: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("GCD of " + numberOne + " and " + numberTwo + " is " + getGreatestCommonDivisor(numberOne, numberTwo));
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Insert any number larger than 1 to find its factors: ");
        int number = scanner.nextInt();
        printFactors(number);
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Insert your number to check if it is perfect or not: ");
        int numberForCheck = scanner.nextInt();
        System.out.println("Is your number perfect or not? Answer: " + isPerfectNumber(numberForCheck));
    }
// This method checks the given two numbers and detect if they have shared digits and return true if yes and vise versa if not
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if (firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber <= 99){
            int digitOfFirstNumber = firstNumber % 10;
            int anotherDigitOfFirstNumber = firstNumber / 10;
            int digitOfSecondNumber = secondNumber % 10;
            int anotherDigitOfSecondNumber = secondNumber / 10;
            return digitOfFirstNumber == digitOfSecondNumber || anotherDigitOfFirstNumber == anotherDigitOfSecondNumber || digitOfFirstNumber == anotherDigitOfSecondNumber || anotherDigitOfFirstNumber == digitOfSecondNumber;
        } return false;
    }
// This method checks if the given three numbers have common last digits and return true if at least two of three numbers have common last digits
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if (number1 >= 10 && number1 <= 1000 && number2 >= 10 && number2 <= 1000 && number3 >= 10 && number3 <= 1000){
            int lastDigitOfNumber1 = number1 % 10;
            int lastDigitOfNumber2 = number2 % 10;
            int lastDigitOfNumber3 = number3 % 10;
            return lastDigitOfNumber1 == lastDigitOfNumber2 || lastDigitOfNumber1 == lastDigitOfNumber3 || lastDigitOfNumber2 == lastDigitOfNumber3;
        } else return false;
    }
// This method checks if the given number is in the range of 10 to 1000
    public static boolean isValid(int anyNumber){
        return anyNumber >= 10 && anyNumber <= 1000;
    }
// This method calculates GCD of two positive numbers which is larger or equal to 10
    public static int getGreatestCommonDivisor(int numberOne, int numberTwo) {
        if (numberOne >= 10 && numberTwo >= 10) {
            while (numberOne != numberTwo) {
                if (numberOne > numberTwo) {
                    numberOne -= numberTwo;
                } else {
                    numberTwo -= numberOne;
                }
            } return numberOne;
        } else return -1;
    }
// This methods finds out factors of the given number and print them on the console
    public static void printFactors(int number){
        if (number >= 1){
            int divisor = 1;
            while (number >= divisor){
                int factors = number % divisor;
                if (factors == 0){
                    System.out.println(divisor);
                }
                divisor++;
            }
        }else
            System.out.println("Invalid Value");
    }
// This method checks if the given number is perfect or not
// Perfect number is a type of number which is equal to sum of its proper divisors
    public static boolean isPerfectNumber(int numberPerfect){
        if (numberPerfect > 1){
            int divisor = 1;
            int sumOfDivisors = 0;
            while (numberPerfect > divisor){
                int factor = numberPerfect % divisor;
                if (factor == 0){
                    sumOfDivisors += divisor;
                }
                divisor++;
            }
            return sumOfDivisors == numberPerfect;
        }else return false;
    }
}
