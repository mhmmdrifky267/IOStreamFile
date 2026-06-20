package bagian3.kontak.tugasMandiri;


public class MainKontak {
public static void main(String[] args) {
    
// Membuat objek pengelola dan mengisinya
BukuKontak buku = new BukuKontak("kontak.txt");
buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));
buku.tampilkanSemua();
buku.simpanKeBerkas();
System.out.println();

// Menguji pencarian kontak
System.out.println("== Uji cariKontak ==");
buku.cariKontak("Budi");      // diharapkan ditemukan
buku.cariKontak("Doni");      // diharapkan tidak ditemukan
System.out.println();

// Menguji penghapusan kontak
System.out.println("== Uji hapusKontak ==");
buku.hapusKontak("Andi");     // diharapkan terhapus dan tersimpan ulang
buku.tampilkanSemua();
System.out.println();

// Objek baru yang kosong, lalu memuat dari berkas
BukuKontak bukuLain = new BukuKontak("kontak.txt");
bukuLain.muatDariBerkas();
bukuLain.tampilkanSemua();
System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
}
}
