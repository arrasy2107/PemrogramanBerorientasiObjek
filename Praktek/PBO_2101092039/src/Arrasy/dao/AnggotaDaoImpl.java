/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy.dao;
import Arrasy.model.Anggota;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class AnggotaDaoImpl implements AnggotaDao {
    List<Anggota> data = new ArrayList <>();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("1111","Arrasy","Padang"));
        data.add(new Anggota("1112","Rizqi","Padang"));
        data.add(new Anggota("1113","Taher","Padang"));
    }
    
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public  Anggota update(int index,Anggota anggota){
        data.set(index , anggota);
        return anggota;
    }
    
    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota(int index){
         return data.get(index);
    }
    
    public  List<Anggota> getAllAnggota(){
        return data;
    }
}
