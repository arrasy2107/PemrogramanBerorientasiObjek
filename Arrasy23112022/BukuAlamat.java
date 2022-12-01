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
public class BukuAlamat {
    
    private String nama;
    private String alamat;
    private String telp;
    private String email;
    
    public BukuAlamat(){
        
    }
    
    public BukuAlamat(String nama,String alamat,String telp,String email){
        this.nama=nama;
        this.alamat=alamat;
        this.telp=telp;
        this.email=email;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public void setTelp(String telp){
        this.telp=telp;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelp(){
        return telp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void print(String nama,String alamat,String telp,String email){
        System.out.println("Nama : "+nama);
        System.out.println("Almat : "+alamat);
        System.out.println("Nomor Telepon : "+telp);
        System.out.println("Email : "+email);
    }
}
