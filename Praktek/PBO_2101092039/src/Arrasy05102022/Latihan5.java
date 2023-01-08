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
import javax.swing.JOptionPane;
public class Latihan5 {
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String Word1 ;
    String Word2 ;
    String Word3 ;
 
    Word1 = JOptionPane.showInputDialog("Enter Word1"); 
    Word2 = JOptionPane.showInputDialog("Enter Word2"); 
    Word3 = JOptionPane.showInputDialog("Enter Word3"); 
 
    String msg = Word1 + " " + Word2 + " " + Word3; 
 
    JOptionPane.showMessageDialog(null, msg);      
    }
}
