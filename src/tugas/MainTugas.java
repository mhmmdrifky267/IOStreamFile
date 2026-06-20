package tugas;

public class MainTugas {
public static void main(String[] args) {

// 1. Array String berukuran tetap untuk daftar kategori
String[] kategori = {"Sembako", "Elektronik", "Alat Tulis"};
System.out.println("== Daftar Kategori ==");
for (int i = 0; i < kategori.length; i++) {
System.out.println((i + 1) + ". " + kategori[i]);
}
System.out.println();

// Membuat objek pengelola dan mengisinya dengan minimal 5 barang
Gudang gudang = new Gudang("barang.txt");
gudang.tambahBarang(new Barang("Beras 5kg", 65000.0, 40));
gudang.tambahBarang(new Barang("Minyak Goreng 1L", 18000.0, 60));
gudang.tambahBarang(new Barang("Kabel HDMI", 35000.0, 15));
gudang.tambahBarang(new Barang("Pulpen Pilot", 5000.0, 100));
gudang.tambahBarang(new Barang("Buku Tulis 38 Lembar", 4000.0, 80));

gudang.tampilkanSemua();
System.out.println("Total nilai persediaan: Rp" + gudang.totalNilai());
System.out.println();

// 2. Menyimpan seluruh data barang ke berkas teks
gudang.simpanKeBerkas();
System.out.println();

// 3. Objek Gudang baru, lalu memuat kembali dari berkas untuk membuktikan
// data benar-benar tersimpan (bukan hanya ada di memori objek lama)
Gudang gudangLain = new Gudang("barang.txt");
gudangLain.muatDariBerkas();
gudangLain.tampilkanSemua();
System.out.println("Jumlah barang: " + gudangLain.jumlahBarang());
System.out.println("Total nilai persediaan (dari berkas): Rp" + gudangLain.totalNilai());
}
}

//Perhatikan tiga hal yang dibuktikan program ini. Pertama, array kategori bersifat tetap
//ukurannya (berbeda dari ArrayList yang bisa bertambah/berkurang) karena memang
//jumlah kategori pada kasus ini sudah ditentukan di awal dan tidak diubah selama program
//berjalan. Kedua, gudang diisi lewat tambahBarang() lalu disimpan ke barang.txt. Ketiga,
//gudangLain dibuat sebagai objek yang benar-benar baru dan kosong (bukan referensi ke
//gudang), lalu setelah muatDariBerkas() isinya identik dengan data sebelumnya—termasuk
//totalNilai() yang nilainya sama. Itulah bukti bahwa berkas, bukan memori program, yang
//menjadi tempat penyimpanan data yang sesungguhnya.
