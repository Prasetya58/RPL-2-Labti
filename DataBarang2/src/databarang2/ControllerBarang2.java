package databarang2;
import databarang2.databarangbaru2;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerBarang2 {
 ArrayList<databarangbaru2> ArrayData;
 DefaultTableModel tablelist;
 
 public ControllerBarang2(){
     ArrayData = new ArrayList<>();
}
 public void InsertData (String namabarang, String kategori, int harga, int jumlah){
     databarangbaru2 mhs = new databarangbaru2(namabarang, kategori, harga, jumlah);
     ArrayData.add(mhs);    
 }
public DefaultTableModel showData(){
    String[] kolom = {"Nama Barang", "Kategori", "Jumlah barang", "Harga"};
    Object[][] objData = new Object [ArrayData.size()][3];
    int i = 0;
    
    for (databarangbaru2 n : ArrayData){
        String[] arrData = {n.getNamaBarang(), n.getKategori(), String.valueOf(n.getHarga()), String.valueOf(n.getJumlah())};
        objData[i] = arrData;
        i++;
    }
    tablelist = new DefaultTableModel (objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;   
    }       
};
    return tablelist;
}
}
