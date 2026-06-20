package bagian3.kontak;

public class MainKontak {
public static void main(String[] args) {
    
// Membuat objek pengelola dan mengisinya
BukuKontak buku = new BukuKontak("kontak.txt");
buku.tambahKontak(new Kontak("Andi", "0811111"));
buku.tambahKontak(new Kontak("Budi", "0822222"));
buku.tambahKontak(new Kontak("Citra", "0833333"));
buku.tampilkanSemua();
buku.simpanKeBerkas();
System.out.println();
// Objek baru yang kosong, lalu memuat dari berkas
BukuKontak bukuLain = new BukuKontak("kontak.txt");
bukuLain.muatDariBerkas();
bukuLain.tampilkanSemua();
System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
}
}

//Cara menjalankan banyak class. Yang dijalankan hanyalah class yang memiliki method
//main, yaitu MainKontak. Dua class lain (Kontak dan BukuKontak) tidak dijalankan sendiri,
//melainkan dipakai oleh class main. Pastikan ketiga file berada di package yang sama, yaitu
//bagian3.kontak, agar dapat saling mengenali tanpa import tambahan. Amati bahwa bukuLain
//bermula kosong, namun setelah muatDariBerkas isinya sama dengan data yang disimpan
//sebelumnya. Itu bukti data tersimpan di berkas.