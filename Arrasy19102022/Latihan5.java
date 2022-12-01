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

public class Latihan5 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        double avg = 0;
        
        System.out.println("==Program Menghitung Nilai Siswa==\n");
        try {
            System.out.print("Masukkan Nilai Pertama Anda : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Kedua Anda : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Ketiga Anda : ");
            nilai3 = Integer.parseInt(dataIn.readLine());
        }
        catch (IOException e) {
            System.out.println("Error !");
        }
        
        avg = (nilai1 + nilai2 + nilai3)/3;
                       
        System.out.println("\nJadi Nilai Rata-ratanya adalah : "+ avg);
        if (avg >= 60){
            System.out.println("Anda Berhasil!\n");
        }
        else{
            System.out.println("Maaf, Anda Gagal!\n");
        }
    }
}
         