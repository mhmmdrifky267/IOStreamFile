package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {
// ArrayList yang menampung objek bertipe Barang
private final ArrayList<Barang> daftar = new ArrayList<>();
private final String namaBerkas;

public Gudang(String namaBerkas) {
this.namaBerkas = namaBerkas;
}

// Menambah satu barang ke koleksi
public void tambahBarang(Barang barang) {
daftar.add(barang);
}

// Menampilkan seluruh koleksi beserta nomor urut
public void tampilkanSemua() {
System.out.println("== Daftar Barang ==");
for (int i = 0; i < daftar.size(); i++) {
Barang b = daftar.get(i);
System.out.println((i + 1) + ". " + b.info());
}
}

// Menjumlahkan harga dikali stok dari seluruh barang
public double totalNilai() {
double total = 0;
for (Barang b : daftar) {
total += b.getHarga() * b.getStok();
}
return total;
}

// Menyimpan seluruh barang ke berkas, satu barang per baris
public void simpanKeBerkas() {
try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
for (Barang b : daftar) {
penulis.println(b.keBaris());
}
System.out.println("Barang disimpan ke " + namaBerkas);
} catch (IOException e) {
System.out.println("Gagal menyimpan: " + e.getMessage());
}
}

// Membaca kembali barang dari berkas ke dalam ArrayList
public void muatDariBerkas() {
daftar.clear();
try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
String baris;
while ((baris = pembaca.readLine()) != null) {
String[] bagian = baris.split(";");
if (bagian.length == 3) {
String nama = bagian[0];
double harga = Double.parseDouble(bagian[1]);
int stok = Integer.parseInt(bagian[2]);
daftar.add(new Barang(nama, harga, stok));
}
}
System.out.println("Barang dimuat dari " + namaBerkas);
} catch (IOException e) {
System.out.println("Gagal memuat: " + e.getMessage());
} catch (NumberFormatException e) {
System.out.println("Gagal membaca angka pada berkas: " + e.getMessage());
}
}

public int jumlahBarang() {
return daftar.size();
}
}

//Perhatikan dua hal yang berbeda dari BukuKontak pada Bagian 3. Pertama, totalNilai()
//melakukan perhitungan terhadap seluruh isi ArrayList, bukan sekadar menampilkan—ini
//contoh method pengelola yang "mengolah" data, bukan hanya menyimpan/membaca.
//Kedua, karena harga bertipe double dan stok bertipe int (bukan String seperti pada
//Kontak), muatDariBerkas() wajib mengonversi teks hasil split() kembali ke angka dengan
//Double.parseDouble() dan Integer.parseInt(). Jika berkas berisi teks yang bukan angka,
//konversi ini bisa gagal, sehingga ditangkap lewat catch (NumberFormatException e).
