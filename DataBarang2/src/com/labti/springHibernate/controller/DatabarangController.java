/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.controller;

import com.labti.springHibernate.app;
import com.labti.springHibernate.config.DatabarangTableModel;
import com.labti.springHibernate.model.Databarang;
import com.labti.springHibernate.view.DatabarangView;
import java.util.List;
import javax.swing.JOptionPane;

public class DatabarangController {
    private final DatabarangView databarangView;
    private DatabarangTableModel databarangTableModel;
    private List<Databarang> databarangs;
    
    public DatabarangController (DatabarangView databarangView){
        this.databarangView = databarangView;
    }
    
    public void tampilData(){
        databarangs = app.getDatabarangService().getMahasiswas();
        databarangTableModel = new DatabarangTableModel(databarangs);
        this.databarangView.getTabel().setModel(databarangTableModel);
    }
    
    public void show(){
        int index = this.databarangView.getTabel().getSelectedRow();
        this.databarangView.getNpm().setText(String.valueOf(
        this.databarangView.getTabel().getValueAt(index, 0)));
        this.databarangView.getNama().setText(String.valueOf(
        this.databarangView.getTabel().getValueAt(index, 1)));
        this.databarangView.getHarga().setText(String.valueOf(
        this.databarangView.getTabel().getValueAt(index, 2)));
        this.databarangView.getDeskripsi().setText(String.valueOf(
        this.databarangView.getTabel().getValueAt(index, 3)));
    }
    
    public void clear(){
        this.databarangView.getNpm().setText("");
        this.databarangView.getNama().setText("");
        this.databarangView.getHarga().setText("");
        this.databarangView.getDeskripsi().setText("");
    }
    
    public void saveDatabarang(){
        Databarang databarang = new Databarang();
        databarang.setId(this.databarangView.getNpm().getText());
        databarang.setNama(this.databarangView.getNama().getText());
        databarang.setHarga(this.databarangView.getHarga().getText());
        databarang.setDeskripsi(this.databarangView.getDeskripsi().getText());
        app.getDatabarangService().save(databarang);
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateDatabarang(){
        Databarang databarang = new Databarang();
        databarang.setId(this.databarangView.getNpm().getText());
        databarang.setNama(this.databarangView.getNama().getText());
        databarang.setHarga(this.databarangView.getHarga().getText());
        databarang.setDeskripsi(this.databarangView.getDeskripsi().getText());
        app.getDatabarangService().update(databarang);
        JOptionPane.showMessageDialog(null, "Data berhasil di Edit", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteDatabarang(){
        if(this.databarangView.getNpm().getText() == null){
            JOptionPane.showMessageDialog(null, "mahasiswa belum dipilih","error",JOptionPane.ERROR_MESSAGE);
        }else{
            Databarang databarang = new Databarang();
            databarang.setId(this.databarangView.getNpm().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pilih == JOptionPane.YES_OPTION){
                app.getDatabarangService().delete(databarang);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus","info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
