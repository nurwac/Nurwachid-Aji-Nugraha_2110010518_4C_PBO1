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
import java.util.Scanner;
public class PenyewaanKameraApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kamera[] daftarKamera = new Kamera[3];
        daftarKamera[0] = new Kamera("Canon EOS 5D Mark IV", 250000);
        daftarKamera[1] = new KameraMirrorles("Sony Alpha A7III", 220000, 3);
        daftarKamera[2] = new KameraMirrorles("Fujifilm X-T4", 200000, 2);

        System.out.println("Selamat datang di Layanan Penyewaan Kamera");

        for (int i = 0; i < daftarKamera.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarKamera[i].showInfo();
        }

        int pilihan = 0;
        int jumlahHari = 0;

        do {
            try {
                System.out.print("Pilih kamera yang akan disewa (1/2/3, 0 untuk keluar): ");
                pilihan = input.nextInt();

                if (pilihan < 0 || pilihan > daftarKamera.length) {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }

                if (pilihan == 0) {
                    System.out.println("Terima kasih telah menggunakan layanan kami. Program berakhir.");
                    break;
                }

                Kamera kameraDipilih = daftarKamera[pilihan - 1];

                System.out.print("Masukkan jumlah hari penyewaan: ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= 0) {
                    System.out.println("Jumlah hari penyewaan harus lebih dari 0.");
                    continue;
                }

                int totalBiaya = kameraDipilih.hitungBiayaSewa(jumlahHari);

                System.out.println("\nRincian Penyewaan:");
                kameraDipilih.showInfo();
                System.out.println("Jumlah Hari: " + jumlahHari);
                System.out.println("Total Biaya: Rp " + totalBiaya);
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine(); // Clear the input buffer
            }
        } while (true);

        input.close();
    }
}
