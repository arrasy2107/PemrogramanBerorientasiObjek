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
public class Latihan2 {
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    int  Bilangan1 =0;
    int Bilangan2 =0;
    int jumlah = 0;
            

    try{ 
        System.out.print("Please Enter Number1 : ");
        Bilangan1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Please Enter Number2 : ");
        Bilangan2 =Integer.parseInt(dataIn.readLine());
       
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
        jumlah = Bilangan1 + Bilangan2;
        
        System.out.println("Hasil = " + jumlah);
    }
}
