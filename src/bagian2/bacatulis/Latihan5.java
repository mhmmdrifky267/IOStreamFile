package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Latihan5 {
    
public static void main(String[] args) {
// Parameter true berarti menambah (append), bukan menimpa
try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true)))
{
    penulis.println("Dewi");
    penulis.println("Eka");
    System.out.println("Dua nama baru ditambahkan tanpa menghapus data lama.");
} catch (IOException e) {
    System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }
}

//Kapan pakai yang mana? Gunakan new FileWriter(nama) bila ingin membuat ulang berkas
//dari awal. Gunakan new FileWriter(nama, true) bila ingin menambah catatan baru pada
//berkas yang sudah ada, misalnya log atau riwayat.
