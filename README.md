# Nurwachid-Aji-Nugraha_2110010518_4C_PBO1
Proyek ini adalah contoh sederhana aplikasi Penyewaan Kamera menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menampilkan informasi tentang penyewaan kamera. contoh jumlah hari menyewa, tipe kamera, biaya sewa
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kamera`, `KameraMirrorles`, dan `PenyewaanKameraApp` adalah contoh dari class.

```bash
public class Kamera {
    private String merk;
    private int hargaSewaPerHari;
}

public class KameraMirrorles extends Kamera {
    private int jumlahLensa;
}

public class PenyewaanKameraApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
int i = 0; i < daftarKamera.length;
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `hargasewaperhari` adalah contoh atribut.

```bash
String merk;
String hargasewaperhari;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kamera` dan `KameraMirrorles`.

```bash
 public KameraMirrorles(String merk, int hargaSewaPerHari, int jumlahLensa) {
        super(merk, hargaSewaPerHari);
        this.jumlahLensa = jumlahLensa;
    }

public MahasiswaDetail(String nama, String npm) {
    super(nama, npm);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setJumlahLensa(int jumlahLensa) {
        this.jumlahLensa = jumlahLensa;
    }

public void setMerk(String merk) {
        this.merk = merk;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getHargaSewaPerHari`, `getJumlahLensa` adalah contoh method accessor.

```bash
public String getMerk() {
        return merk;
    }

public int getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
public int getJumlahLensa() {
        return jumlahLensa;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `jumlahLensa` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private int jumlahLensa;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KameraMirrorles` mewarisi `Kamera` dengan sintaks `extends`.

```bash
public class KameraMirrorles extends Kamera {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
 public String getMerk() {
        return merk;
    }
@Override
    public void showInfo() {
        System.out.println("Kamera Mirrorles " + getMerk() + " dengan harga sewa per hari Rp " + getHargaSewaPerHari()
                + " dan jumlah lensa " + jumlahLensa);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `getmerk` dan seleksi `switch` dalam method `gethargasewaperhari`.

```bash
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

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarKamera.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarKamera[i].showInfo();
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 System.out.println("\nRincian Penyewaan:");
                kameraDipilih.showInfo();
                System.out.println("Jumlah Hari: " + jumlahHari);
                System.out.println("Total Biaya: Rp " + totalBiaya);
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine(); // Clear the input buffer
            }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `daftarKamera[i].showInfo();` adalah contoh penggunaan array.

```bash
daftarKamera[i].showInfo();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
                System.out.print("Pilih kamera yang akan disewa (1/2/3, 0 untuk keluar): ");
                pilihan = input.nextInt();
} catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine(); // Clear the input buffer
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nurwachid Aji Nugraha
NPM: 2110010518
