/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy02122022;

/**
 *
 * @author USER
 */
public class ContohStatic {
    public static int tambah(int x, int y) {
        return (x+y);
    }
    
    public static void main(String[] args) {
        ContohStatic c = new ContohStatic();
        int hasil = c.tambah (5, 8);
    }
}
