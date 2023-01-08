/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy02122022;

/**
 *
 * @author USER
 */
public class OperasiAritmatik {
    public static void main(String[] args) {
        int sum = 0;
        int difference = 0;  
        int product = 0;
        int quotient = 0;
        sum = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);
        difference = Integer.parseInt(args[2]) - Integer.parseInt(args[3]);
        product = Integer.parseInt(args[2]) * Integer.parseInt(args[3]);
        quotient = Integer.parseInt(args[2]) / Integer.parseInt(args[3]); 
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
    }
}
