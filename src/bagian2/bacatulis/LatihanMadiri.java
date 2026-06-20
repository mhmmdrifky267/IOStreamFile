package bagian2.bacatulis;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

///**
// * Program latihan operasi file teks (hari.txt)
// * 1. Menulis 5 nama hari ke file, lalu membacanya kembali
// * 2. Menambahkan (append) 2 nama hari lagi tanpa menghapus isi lama
// * 3. Menghitung jumlah baris dalam file
// *
// * Cara menjalankan di NetBeans:
// * - Buat New Project > Java with Ant > Java Application
// * - Beri nama project, misalnya "LatihanFile"
// * - Ganti isi file Main.java (kelas utama bawaan NetBeans) dengan kode di bawah ini
// *   (jika nama kelas bawaan NetBeans bukan "Main", sesuaikan nama class di baris
// *   "public class Main" agar SAMA dengan nama file .java-nya)
// * - Klik kanan project > Run (atau tekan F6)
// * - File hari.txt akan otomatis dibuat di dalam folder project (folder root NetBeans,
// *   sejajar dengan folder src dan build)

public class LatihanMadiri {

    // Nama file yang dipakai di semua operasi, dijadikan konstanta supaya mudah diubah
    static final String NAMA_FILE = "hari.txt";

    public static void main(String[] args) {
        System.out.println("===== TUGAS 1: Menulis dan Membaca File =====");
        tulisHariAwal();
        bacaDanTampilkan("Isi file setelah ditulis pertama kali:");

        System.out.println("\n===== TUGAS 2: Menambahkan (Append) Data =====");
        tambahHari();
        bacaDanTampilkan("Isi file setelah ditambahkan (append):");

        System.out.println("\n===== TUGAS 3: Menghitung Jumlah Baris =====");
        hitungBaris();
    }

//    /**
//     * TUGAS 1
//     * Menulis 5 nama hari ke dalam file hari.txt, satu nama per baris.
//     * FileWriter(NAMA_FILE) tanpa parameter kedua berarti mode TIMPA (overwrite):
//     * jika file sudah ada, isinya akan dibuat ulang dari kosong.
//     */
    static void tulisHariAwal() {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // try-with-resources: writer otomatis ditutup (close) walau terjadi error di tengah jalan
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NAMA_FILE))) {
            for (String h : hari) {
                writer.write(h);       // tulis satu nama hari
                writer.newLine();      // pindah ke baris baru
            }
            System.out.println("Berhasil menulis 5 nama hari ke " + NAMA_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }

//    /**
//     * TUGAS 2
//     * Menambahkan 2 nama hari baru ke file hari.txt TANPA menghapus isi sebelumnya.
//     * Kuncinya ada pada parameter kedua: FileWriter(NAMA_FILE, true).
//     * Nilai true berarti mode APPEND, sehingga penulisan dilanjutkan dari akhir
//     * file yang sudah ada, bukan menimpa dari awal lagi.
//     */
    static void tambahHari() {
        String[] tambahan = {"Sabtu", "Minggu"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NAMA_FILE, true))) {
            for (String h : tambahan) {
                writer.write(h);
                writer.newLine();
            }
            System.out.println("Berhasil menambahkan 2 nama hari (append) ke " + NAMA_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menambah isi file: " + e.getMessage());
        }
    }

//    /**
//     * Fungsi bantu untuk membaca seluruh isi file lalu menampilkannya ke layar.
//     * Dipakai ulang di Tugas 1 dan Tugas 2 supaya kode tidak ditulis berulang-ulang.
//     */
    static void bacaDanTampilkan(String judul) {
        System.out.println(judul);
        try (BufferedReader reader = new BufferedReader(new FileReader(NAMA_FILE))) {
            String baris;
            int nomor = 1;
            while ((baris = reader.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

//    /**
//     * TUGAS 3
//     * Membaca file hari.txt lalu menghitung jumlah baris yang ada di dalamnya.
//     * Caranya: baca baris demi baris dengan readLine() sampai hasilnya null
//     * (artinya sudah sampai akhir file). Setiap berhasil membaca satu baris,
//     * tambahkan counter jumlahBaris sebanyak satu.
//     */
    static void hitungBaris() {
        int jumlahBaris = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(NAMA_FILE))) {
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris dalam " + NAMA_FILE + " adalah: " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menghitung baris: " + e.getMessage());
        }
    }
}