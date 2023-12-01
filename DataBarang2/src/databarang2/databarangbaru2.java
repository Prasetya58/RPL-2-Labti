package databarang2;

public class databarangbaru2 {
    private final String namabarang;
    private final String kategori;
    private final int harga;
    private final int jumlah;
    
    public databarangbaru2(String namabarang, String kategori, int harga, int jumlah){
        this.namabarang = namabarang;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public String getNamaBarang() {
        return namabarang;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    @Override
    public String toString(){
        return "Nama Barang: " + namabarang + "Kategori Barang: " + kategori + ", Harga : " + harga + ", Jumlah Stok: " + jumlah;
    }
}


