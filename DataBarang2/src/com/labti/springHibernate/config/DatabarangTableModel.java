/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.config;

import com.labti.springHibernate.model.Databarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DatabarangTableModel extends AbstractTableModel {
    
    private List<Databarang> databarangs = new ArrayList<>();
    private final String HEADER[] = {"ID","Nama","HARGA","DESKRIPSI"};
    
    public DatabarangTableModel(List<Databarang> mahasiswas){
        this.databarangs = mahasiswas;
    }
    
    @Override
    public int getRowCount(){
        return databarangs.size();
    }
    
    @Override
    public int getColumnCount(){
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Databarang databarang = databarangs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return databarang.getId();
            case 1:
                return databarang.getNama();
            case 2:
                return databarang.getHarga();
            case 3:
                return databarang.getDeskripsi();
            default:
                return null;
        }
    }
}
