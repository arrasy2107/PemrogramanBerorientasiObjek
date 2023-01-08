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
import javax.swing.JOptionPane;
public class Latihan6 {
    public static void main(String[] args) {       
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        double avg = 0;
        String msg1 = "";
        String msg2 = "";
        
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama Anda")) ;
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Kedua Anda")) ;
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga Anda")) ;
        
        avg = (nilai1 + nilai2 + nilai3)/3;
        
        if (avg >= 60){
             msg1 = "Rata-rata anda adalah "+avg;
            msg2= "Anda Berhasil !";
        }
        else{
            msg1 = "Rata-rata anda adalah "+avg;
            msg2 = "Maaf, Anda Gagal !";
        }
        JOptionPane.showMessageDialog(null, msg1+"\n"+msg2);
    }
}

