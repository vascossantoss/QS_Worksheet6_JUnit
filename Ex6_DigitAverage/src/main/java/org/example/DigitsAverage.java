package org.example;

public class DigitsAverage {
    public static double getDigitsAverage(int num){
        int digitSum = 0;
        int digit;
        int count = 0;
        while (num > 0){
            digit = num % 10;
            digitSum += digit;
            count++;
            num /= 10;
        }
        return (double) digitSum / count;
    }
}
