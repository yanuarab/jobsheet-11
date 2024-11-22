public class modifikasi2percobaan4_25 {
    public static void cetakData(Object... data) {
        System.out.println("Data pengungjung: ");
        for (Object obj : data) {
            System.out.println("- " + obj);
        }
    }
    
    public static void main(String[] args) {
        cetakData( "Ali",25 , "Budi", 30, "Citra",27);
    }
    
}
