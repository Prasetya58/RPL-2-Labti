package databarang2;

import databarang2.databarangbaru2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Databarang2 {
    public static void main(String[] args) {
        List<databarangbaru2> daftarBarang = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        
        while (true) {
            System.out.println("Tambah Data Barang Baru (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equals("n")){
                break;
            }
            System.out.print("Nama Produk: ");
            String namabarang = input.nextLine();
            
            System.out.print("Kategori Produk: ");
            String kategori = input.nextLine();
            
            System.out.print("Harga Produk: ");
            int harga = input.nextInt();
            
            System.out.print("Jumlah Stok: ");
            int jumlah = input.nextInt();
            input.nextLine();
            
            databarangbaru2 barang = new databarangbaru2(namabarang, kategori, harga, jumlah);
            daftarBarang.add(barang);
        }
        System.out.println("Daftar Barang:");
        for (databarangbaru2 barang : daftarBarang) {
            System.out.println(barang);
        }
    }
}