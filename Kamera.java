/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penyewakamera;

/**
 *
 * @author User
 */
public class Kamera {
    private String merk;
    private int hargaSewaPerHari;

    // Constructor
    public Kamera(String merk, int hargaSewaPerHari) {
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Accessor (getter) untuk merk
    public String getMerk() {
        return merk;
    }

    // Mutator (setter) untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Accessor (getter) untuk hargaSewaPerHari
    public int getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    // Mutator (setter) untuk hargaSewaPerHari
    public void setHargaSewaPerHari(int hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Method untuk menampilkan informasi kamera
    public void showInfo() {
        System.out.println("Kamera " + merk + " dengan harga sewa per hari Rp " + hargaSewaPerHari);
    }

    // Method untuk menghitung biaya sewa berdasarkan jumlah hari
    public int hitungBiayaSewa(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari;
    }
}
