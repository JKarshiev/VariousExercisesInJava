package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any number: ");
        int number = scanner.nextInt();
        System.out.println(getEvenDigitSum(number));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sumOfDigits = 0;
        while (number > 0){
            int digit = number % 10;
            int evenNumber = digit % 2;
            if (evenNumber == 0){
                sumOfDigits += digit;
            }
            number /= 10;
        }
        return sumOfDigits;
    }
}
