/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy30112022;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class InterfaceExample {
    public static void main(String[] args){
        JajarGenjang jajargenjang[]=new JajarGenjang[100];
        Relation myInteger= new MyInteger();
        Relation myDouble= new MyDouble();
        Relation perbandingan= new JajarGenjang();
        Scanner in=new Scanner(System.in);
        
        int alas,tinggi,sisiMiring;
       
        for(int i=0;i<2;i++){
            JajarGenjang isi=new JajarGenjang();
            
            System.out.println("Jajar Genjang No. "+(i+1));
            System.out.print("Masukkan Alas : ");
            alas=in.nextInt();
            System.out.print("Masukkan Tinggi : ");
            tinggi=in.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            sisiMiring=in.nextInt();
            System.out.println();
            
            isi.setJajargenjang(alas, tinggi, sisiMiring);

            jajargenjang[i]=isi;
        }
        
        System.out.println("Jajar Genjang 1");
        System.out.println("Luas : "+jajargenjang[0].luas());
        System.out.println("Keliling : "+jajargenjang[0].kll());
        System.out.println("Jajar Genjang 2");
        System.out.println("Luas : "+jajargenjang[1].luas());
        System.out.println("Keliling : "+jajargenjang[1].kll());
        
        boolean hasilLuas1=perbandingan.isGreater(jajargenjang[0].luas(), jajargenjang[1].luas());
        boolean hasilLuas2=perbandingan.isLess(jajargenjang[0].luas(), jajargenjang[1].luas());
        boolean hasilLuas3=perbandingan.isEqual(jajargenjang[0].luas(), jajargenjang[1].luas());
        boolean hasilKeliling1=perbandingan.isGreater(jajargenjang[0].kll(), jajargenjang[1].kll());
        boolean hasilKeliling2=perbandingan.isLess(jajargenjang[0].kll(), jajargenjang[1].kll());
        boolean hasilKeliling3=perbandingan.isEqual(jajargenjang[0].kll(), jajargenjang[1].kll());
        
        boolean hasilInt = myInteger.isGreater(5,7);
        boolean hasilDouble = myDouble.isGreater( 5.1, 6.2);
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Luas Jajar Genjang 1 > Luas Jajar Genjang 2 :"+hasilLuas1);
        System.out.println("Luas Jajar Genjang 1 < Luas Jajar Genjang 2 :"+hasilLuas2);
        System.out.println("Luas Jajar Genjang 1 = Luas Jajar Genjang 2 :"+hasilLuas3);
        System.out.println("Keliling Jajar Genjang 1 > Keliling Jajar Genjang 2 :"+hasilKeliling1);
        System.out.println("Keliling Jajar Genjang 1 < Keliling Jajar Genjang 2 :"+hasilKeliling2);
        System.out.println("Keliling Jajar Genjang 1 = Keliling Jajar Genjang 2 :"+hasilKeliling3);
        System.out.println("------------------------------------------------------------");        
    }
}
