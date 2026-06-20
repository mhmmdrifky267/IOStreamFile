package tugas;

public class Barang {
// Atribut: data yang dimiliki setiap barang
private final String nama;
private final double harga;
private final int stok;

// Constructor: dipanggil saat objek dibuat
public Barang(String nama, double harga, int stok) {
this.nama = nama;
this.harga = harga;
this.stok = stok;
}

// Getter: cara membaca atribut dari luar class
public String getNama() {
return nama;
}
public double getHarga() {
return harga;
}
public int getStok() {
return stok;
}

// Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
public String keBaris() {
return nama + ";" + harga + ";" + stok;
}

// Mengembalikan keterangan barang dalam bentuk teks
public String info() {
return nama + " - Rp" + harga + " - stok: " + stok;
}
}

//Sama seperti class Kontak pada Bagian 3, class Barang murni berisi data dan cara
//membacanya. Method keBaris() mengubah objek jadi teks "nama;harga;stok" agar mudah
//ditulis ke berkas, sedangkan info() dipakai untuk ditampilkan ke layar dengan format yang
//lebih mudah dibaca manusia. Class ini tidak tahu apa-apa soal ArrayList atau berkas; itu
//adalah tanggung jawab class Gudang.
