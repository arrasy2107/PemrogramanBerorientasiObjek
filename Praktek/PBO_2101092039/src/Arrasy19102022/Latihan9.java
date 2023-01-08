/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy19102022;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan9 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int angka = 0;
        int pangkat = 0;
        int hasil = 0;
        
        System.out.println("==Program Menghitung Nilai Pangkat==\n");
        
        try {
            System.out.print("Masukkan Angka : ");
            angka = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
        }
        catch (IOException e){
            System.out.println("Error!");
        }
         hasil = angka;
        for (int i=0; i<pangkat-1; i++){
            hasil = hasil * angka;
        }
        System.out.println("Hasil Pangkat : "+hasil);
    }
}

