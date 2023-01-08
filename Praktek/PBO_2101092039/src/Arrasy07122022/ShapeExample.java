/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy07122022;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ShapeExample {
    public static void main(String[] args){
        Circle circle1=new Circle();
        Square square1=new Square();
        Scanner in=new Scanner(System.in);
        
        circle1.setName("Lingkaran");
        circle1.setJari(2);
        
        circle1.getName();
        circle1.getArea();
        
        
        circle1.print(circle1.getName(), 2, circle1.getArea());
        System.out.println();
        
        square1.setName("Persegi");
        square1.setSisi(2);
        
        square1.getName();
        square1.getArea();
        
        square1.print(square1.getName(), 2, square1.getArea());
        
    }
}
