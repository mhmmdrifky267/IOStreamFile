
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan3 {
    
public static void main(String[] args) {
// try-with-resources: stream otomatis ditutup setelah blok selesai
try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))) {
penulis.println("Andi");
penulis.println("Budi");
penulis.println("Citra");
System.out.println("Data berhasil ditulis ke mahasiswa.txt");
} catch (IOException e) {
System.out.println("Gagal menulis: " + e.getMessage());
}
}
}

//Bentuk try (...) { } disebut try-with-resources. Stream yang dibuat di dalam tanda
//kurung akan ditutup secara otomatis ketika blok selesai, sehingga data benar-benar
//tersimpan dan sumber daya dilepas. Jika stream tidak ditutup, isi berkas bisa kosong
//meskipun program berjalan tanpa error.