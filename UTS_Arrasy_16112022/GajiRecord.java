/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Arrasy_16112022;

/**
 *
 * @author USER
 */
public class GajiRecord {
     private String kodeSlip;
    private String tgl;
    private String nama;
    private int gol;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
  
    public GajiRecord(){
        
    }
    
    public String getKode(){
        return kodeSlip;
    }
    
    public void setKode(String kode){
        this.kodeSlip=kode;
    }
    
    public String getTgl(){
        return tgl;
    }
    
    public void setTgl(String tgl){
        this.tgl=tgl;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public int getGol(){
        return gol;
    }
    
    public void setGol(int gol){
        this.gol=gol;
    }
    
    public double getGaji(){
        
        if(gol==1){
            gajiPokok=1000000;
        }
        else if(gol==2){
            gajiPokok=2000000;
        }
        else{
            System.out.println("-Golongan tidak terdaftar-");
        }
        
        return gajiPokok;
    }
    
    public double getTunjanganAnak(){
        return tunjanganAnak;
    }
    
    public void setTunjanganAnak(double tAnak ){
        tunjanganAnak=tAnak;
    }
    
    public double getTunjanganIstri(){
        return tunjanganIstri;
    }
    
    public void setTunjanganIstri(double tIstri ){
        tunjanganIstri=tIstri;
    }
    
    
    public double getTotal(){
        double total;
        
        total=gajiPokok+tunjanganAnak+tunjanganIstri;
        
        return total;
    }
}
