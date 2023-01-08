/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrasy.controller;
import Arrasy.view.FormAnggota;
import Arrasy.dao.AnggotaDao;
import Arrasy.dao.AnggotaDaoImpl;
import Arrasy.model.Anggota;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm() {
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");       
    }
    
        public void save(){
        anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Entri Data Ok");
    }
    
    public void getAnggota() {
        int index = formAnggota.getTblAnggota ().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null) {
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
        }
    }
    
    public void updateAnggota() {
        int index = formAnggota.getTblAnggota ().getSelectedRow();
        anggota.setNobp(formAnggota.getTxtNobp ().getText());
        anggota.setNama(formAnggota.getTxtNama ().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat ().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Update's OK");
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete Ok");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> listAnggota = anggotaDao.getAllAnggota();
        for(Anggota anggota : listAnggota) {
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}
