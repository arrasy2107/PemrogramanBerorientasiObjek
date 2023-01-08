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

public class Latihan7 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int angka = 0;

        System.out.println("==Program Membaca Bilangan==\n");

        try {
            System.out.print("Masukkan Angka : ");
            angka = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error !");
        }

        switch (angka) {
            case 1:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 2:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 3:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 4:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 5:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 6:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 7:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 8:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 9:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            case 10:
                System.out.println("Angka yang anda masukkan adalah " + angka + " !");
                break;
            default:
                System.out.println("Invalid Number !");
        }
        System.out.print("\n");
    }
}
