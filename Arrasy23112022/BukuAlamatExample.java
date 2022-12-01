/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy23112022;


/**
 *
 * @author USER
 */
import java.util.Scanner;
public class BukuAlamatExample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        int a;
        String nama;
        String alamat; 
        String notelp;
        String email;
        
        System.out.print("Masukkan jumlah data : ");
        n = in.nextInt();
        
        BukuAlamat bukuAlamat[] =  new BukuAlamat[100]; 
        
        in.nextLine();
        
        for (int i=0;i<n;i++){
            System.out.println("\nData ke-"+(i+1));
            BukuAlamat bukuAlamat1 = new BukuAlamat();
            
            System.out.print("Masukkan Nama : ");
            nama = in.nextLine();
            bukuAlamat1.setNama(nama);

            System.out.print("Masukkan Alamat : ");
            alamat = in.nextLine();
            bukuAlamat1.setAlamat(alamat);

            System.out.print("Masukkan Telepon : ");
            notelp = in.nextLine();
            bukuAlamat1.setNotelp(notelp);

            System.out.print("Masukkan Email : ");
            email = in.nextLine();
            bukuAlamat1.setEmail(email);
            
            bukuAlamat[i] = bukuAlamat1;
        }
        
        
        for (int i=0;i<n;i++){
            System.out.println("\nData ke-"+(i+1));
            System.out.println("Nama : "+bukuAlamat[i].getNama());
            System.out.println("Alamat : "+bukuAlamat[i].getAlamat());
            System.out.println("Telepon : "+bukuAlamat[i].getNotelp());
            System.out.println("Email : "+bukuAlamat[i].getEmail());
        }
    }
}