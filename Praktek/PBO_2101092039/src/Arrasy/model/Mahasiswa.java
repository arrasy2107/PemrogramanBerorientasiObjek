/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy.model;

/**
 *
 */
public class Mahasiswa {
    private String nobp;
    private String nama;
    private String alamat;
    private String jekel;
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp (String nobp){
        this.nobp = nobp;
    }
    
    public String getNama (){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama=nama;
    }
    
     public String getAlamat (){
        return alamat;
    }
    
    public void setAlamat (String alamat){
        this.alamat=alamat;
    }
    
     public String getJekel (){
        return jekel;
    }
    
    public void setJekel (String jekel){
        this.jekel=jekel;
    }
}
