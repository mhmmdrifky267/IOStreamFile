package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        File berkas = new File("data.txt");
    try{
     if(berkas.createNewFile()){
         System.out.println("Berkas baru di buat");
     }else{
         System.out.println("Berkas sudah ada sebelumnya");
     }
    }catch(IOException e){
        System.out.println("terjadi kesalahan:"+ e.getMessage());
    }
   }
}

//
//Blok try berisi kode yang mungkin gagal. Bila gagal, program tidak berhenti
//mendadak, melainkan melompat ke blok catch dan menampilkan pesan yang ramah. Objek
//e menyimpan keterangan kesalahan yang dapat dibaca melalui e.getMessage().
