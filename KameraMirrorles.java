/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penyewakamera;
public class KameraMirrorles extends Kamera {
    private int jumlahLensa;

    // Constructor subclass KameraMirrorless
    public KameraMirrorles(String merk, int hargaSewaPerHari, int jumlahLensa) {
        super(merk, hargaSewaPerHari);
        this.jumlahLensa = jumlahLensa;
    }

    // Accessor (getter) untuk jumlahLensa
    public int getJumlahLensa() {
        return jumlahLensa;
    }

    // Mutator (setter) untuk jumlahLensa
    public void setJumlahLensa(int jumlahLensa) {
        this.jumlahLensa = jumlahLensa;
    }

    // Override method showInfo dari kelas Kamera
    @Override
    public void showInfo() {
        System.out.println("Kamera Mirrorles " + getMerk() + " dengan harga sewa per hari Rp " + getHargaSewaPerHari()
                + " dan jumlah lensa " + jumlahLensa);
    }

    // Method khusus untuk kamera mirrorless
    public void fiturMirrorles() {
        System.out.println("Fitur kamera mirrorles: Sudah tidak menggunakan cermin refleksi sehingga lebih ringan dan lebih cepat dalam mengambil gambar.");
    }
}
