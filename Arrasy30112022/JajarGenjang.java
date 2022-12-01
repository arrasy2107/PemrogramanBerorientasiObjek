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
public class JajarGenjang implements Relation {
    
    private int alas;
    private int tinggi;
    private int luas;
    private int kll;
    private int sisiMiring;
    
    public void setJajargenjang(int alas,int tinggi,int sisiMiring){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisiMiring=sisiMiring;
    }
    
    public int getAlas(){
        return alas;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public int getSisi(){
        return sisiMiring;
    }
    
    public int luas(){
        luas=alas*tinggi;
        return luas;
    }
    
    public int kll(){
        kll=2*(sisiMiring+alas);
        return kll;
    }
    
    public boolean isGreater( Object a, Object b){
        return (int)a>(int)b;
    }
    
    public boolean isLess( Object a, Object b){
        return (int)a<(int)b;
    }
    
    public boolean isEqual( Object a, Object b){
        return (int)a==(int)b;
    }
}
