package bagian1.berkas;
import java.io.File;
import java.io.IOException;

 
public class LatihanMandiri2 {
    public static void main(String[] args) {
 
        File folder = new File("arsip");
        boolean berhasil = folder.mkdir();
 
        if (berhasil) {
            System.out.println("✓ Berhasil membuat folder: " + folder.getName());
        } else {
            System.out.println("✗ Gagal membuat folder '" + folder.getName() + 
                               "' (mungkin sudah ada atau tidak ada izin)");
        }
 
        System.out.println("Folder ada: " + folder.exists());
 
    
    // ============================================================
        // SOAL 3: Membuat & menghapus file "sementara.txt"
        // ============================================================
        System.out.println();
        System.out.println("========================================");
        System.out.println("    MEMBUAT & MENGHAPUS sementara.txt");
        System.out.println("========================================");
 
        File berkas = new File("sementara.txt");
 
        // Cek sebelum dibuat
        System.out.println("Status SEBELUM dibuat : " + 
                           (berkas.exists() ? "Ada" : "Tidak ada"));
 
        // Buat berkasnya
        try {
            boolean dibuatBaru = berkas.createNewFile();
            if (dibuatBaru) {
                System.out.println("✓ Berkas '" + berkas.getName() + "' berhasil dibuat.");
            } else {
                System.out.println("! Berkas sudah ada sebelumnya, tidak dibuat ulang.");
            }
        } catch (IOException e) {
            System.out.println("✗ Gagal membuat berkas: " + e.getMessage());
        }
 
        // Cek sesudah dibuat
        System.out.println("Status SETELAH dibuat  : " + 
                           (berkas.exists() ? "Ada" : "Tidak ada"));
 
        // Hapus berkasnya
        boolean terhapus = berkas.delete();
        if (terhapus) {
            System.out.println("✓ Berkas berhasil dihapus.");
        } else {
            System.out.println("✗ Berkas gagal dihapus.");
        }
 
        // Cek sesudah dihapus
        System.out.println("Status SETELAH dihapus : " + 
                           (berkas.exists() ? "Ada" : "Tidak ada"));
 
        System.out.println("========================================");
    }
}

