/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy07122022;

/**
 *
 * @author USER
 */
public class Circle extends Shape {
     protected String nama;
    protected double luas;
    protected int r;
    
    public void setName(String nama){
        this.nama=nama;
    }
    
    public void setJari(int r){
        this.r=r;
    }
    
    public String getName(){
        return nama;
    }
    
    public double getArea(){
        luas=3.14*r*r;
        return luas;
    }
    
    public void print(String nama,int r,double luas){
        System.out.println("Nama Bentuk : "+nama);
        System.out.println("Jari-Jari : "+r);
        System.out.println("Luas : "+luas);
    }
}
