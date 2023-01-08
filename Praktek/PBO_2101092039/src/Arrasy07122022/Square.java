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
public class Square extends Shape {
    protected String nama;
    protected double luas;
    protected int s;
    
    public void setName(String nama){
        this.nama=nama;
    }
    
    public void setSisi(int s){
        this.s=s;
    }
    
    public String getName(){
        return nama;
    }
    
    public double getArea(){
        luas=s*s;
        return luas;
    }
    
    public void print(String nama,int s,double luas){
        System.out.println("Nama Bentuk : "+nama);
        System.out.println("Sisi : "+s);
        System.out.println("Luas : "+luas);
    }
}
