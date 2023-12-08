/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (example: 1 + 2): ");
        double num1 = sc.nextDouble();
        String operator = sc.next();
        double num2 = sc.nextDouble();
        switch (operator) {
            case "+" -> System.out.println("The result is: " + (num1 + num2));
            case "-" -> System.out.println("The result is: " + (num1 - num2));
            case "/" -> System.out.println("The result is: " + (num1 / num2));
            case "*" -> System.out.println("The result is: " + (num1 * num2));
            default -> System.out.println("Sorry, but something is wrong!"); 
        }   
    }
    
}
