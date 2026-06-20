package bagian3.kontak.tugasMandiri;


public class Kontak {
// Atribut: data yang dimiliki setiap kontak
private final String nama;
private final String nomor;
private final String email;
// Constructor: dipanggil saat objek dibuat
public Kontak(String nama, String nomor, String email) {
this.nama = nama;
this.nomor = nomor;
this.email = email;
}
// Getter: cara membaca atribut dari luar class
public String getNama() {
return nama;
}
public String getNomor() {
return nomor;
}
public String getEmail() {
return email;
}
// Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
public String keBaris() {
return nama + ";" + nomor + ";" + email;
}
// Mengembalikan keterangan kontak dalam bentuk teks
public String info() {
return nama + " - " + nomor + " - " + email;
}
}

//Perhatikan ArrayList<Kontak>: isinya bukan teks biasa, melainkan objek Kontak.
//Saat menyimpan, method memanggil k.keBaris() milik class Kontak. Saat memuat, baris
//dipecah dengan split(";") lalu dipakai untuk membuat objek Kontak baru. Di sinilah class,
//ArrayList, dan berkas saling terhubung.