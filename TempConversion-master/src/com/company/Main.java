package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit as a double:");
        double tempF = scan.nextDouble();
       System.out.println("The temperature in Celsius is " + ((tempF - 32) * 5/9) + " degrees.");
    }

}
