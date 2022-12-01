/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy05102022;

/**
 *
 * @author USER
 */
import java.io.*;
public class Latihan4 {
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String Word1 = "";
    String Word2 = "";
    String Word3 = "";

    try{ 
        System.out.print("Enter Word1 : ");
        Word1 = dataIn.readLine();
        System.out.print("Enter Word2 : ");
        Word2 = dataIn.readLine();
        System.out.print("Enter Word3 : ");
        Word3 = dataIn.readLine();
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
    System.out.println(Word1 + " " + Word2 + " " + Word3); 

    } 
}
