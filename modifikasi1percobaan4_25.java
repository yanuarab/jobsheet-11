public class modifikasi1percobaan4_25 {
    public static void cetakData(String judul, String... namaPengunjung) {
        System.out.println("Judul: " + judul);
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
    
    public static void main(String[] args) {
        cetakData("Pengunjung Hari Ini", "Ali", "Budi", "Citra");
    }
    
}
