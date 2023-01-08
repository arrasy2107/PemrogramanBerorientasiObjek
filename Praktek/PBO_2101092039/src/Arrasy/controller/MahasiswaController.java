/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy.controller;
import Arrasy.view.FormMahasiswa;
import Arrasy.dao.MahasiswaDao;
import Arrasy.dao.MahasiswaDaoImpl;
import Arrasy.model.Mahasiswa;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class MahasiswaController {
    private FormMahasiswa formMahasiswa;
    private MahasiswaDao mahasiswaDao;
    private Mahasiswa mahasiswa;
    
    public MahasiswaController(FormMahasiswa formMahasiswa){
        this.formMahasiswa = formMahasiswa;
        mahasiswaDao = new MahasiswaDaoImpl();
    }
    
    public void bersihForm(){
        formMahasiswa.getTxtNobp().setText("");
        formMahasiswa.getTxtNama().setText("");
        formMahasiswa.getTxtAlamat().setText("");
        formMahasiswa.getTxtJekel().setText("");
    }
    
    public void save(){
        mahasiswa = new Mahasiswa();
        mahasiswa.setNobp(formMahasiswa.getTxtNobp().getText());
        mahasiswa.setNama(formMahasiswa.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa.getTxtAlamat().getText());
        mahasiswa.setJekel(formMahasiswa.getTxtJekel().getText());
        mahasiswaDao.save(mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa, "Entri Data OK");
    }
    
    public void tampilData(){
       DefaultTableModel tabelModel = 
               (DefaultTableModel) formMahasiswa.getTblMahasiswa().getModel();
       tabelModel.setRowCount(0);
       java.util.List<Mahasiswa> listMahasiswa = mahasiswaDao.getAllMahasiswa();
       for (Mahasiswa mahasiswa : listMahasiswa){
           Object[] data = {
               mahasiswa.getNobp(),
               mahasiswa.getNama(),
               mahasiswa.getAlamat(),
               mahasiswa.getJekel()
           };
           tabelModel.addRow(data);
       }
    }
}
