package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        //getEven();
        //getTemperature();
        //getSquare();
        //getMultiplication();
        //getSum();
    }

    public static void getEven()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Tne number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }

    public static void getTemperature()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature of the weather: ");
        double temperature = input.nextDouble();
        if (temperature > -5) System.out.println("Warm");
        else if (temperature <= -5 && temperature >= -20)
            System.out.println("Normal");
        else System.out.println("Cold");
    }

    public static void getSquare()
    {
        for (int num = 10; num <= 20; num++)
        {
            System.out.println("The square of " + num + " is " + num*num);
        }
    }

    public static void getMultiplication()
    {
        int i = 1, res = 0;
        while (res < 98) {
            res = i*7;
            System.out.print(res + " ");
            i++;
        }
    }

    public static void getSum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int bound = input.nextInt();
        int sum = 0;

        //input check
        while (bound <= 0) {
            System.out.print("The number is incorrect. Try again: ");
            bound = input.nextInt();
        }

        for (int i = 1; i <= bound; i++)
        {
            sum+=i;
        }
        System.out.print("The sum is " + sum);
    }
}
