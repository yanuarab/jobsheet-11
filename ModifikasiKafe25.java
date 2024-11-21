public class ModifikasiKafe25 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Terima kasih telah menjadi member kami.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");

        double totalHarga = 15_000 + 20_000 + 22_000 + 12_000 + 10_000 + 18_000; 
        double diskon = 0.0;

        if ("DISKON50".equals(kodePromo)) {
            diskon = totalHarga * 0.50;
        } else if ("DISKON30".equals(kodePromo)) {
            diskon = totalHarga * 0.30;
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        if (diskon > 0) {
            System.out.printf("Anda mendapatkan diskon sebesar Rp %.0f%n", diskon);
            System.out.printf("Total harga setelah diskon: Rp %.0f%n", totalHarga - diskon);
        }

        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        String namaPelanggan = "Andi";
        boolean isMember = true;
        String kodePromo = "DISKON50";
        Menu(namaPelanggan, isMember, kodePromo);
    }
}
