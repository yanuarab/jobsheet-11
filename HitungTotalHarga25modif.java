import java.util.Scanner;

public class HitungTotalHarga25modif {
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte – Rp 22,000");
        System.out.println("4. Teh Tarik – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) totalHarga *= 0.5;
        else if (kodePromo.equals("DISKON30")) totalHarga *= 0.7;
        else if (!kodePromo.equals("NONE")) System.out.println("Kode promo invalid.");
        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        int totalKeseluruhan = 0;
        boolean lanjutPesan = true;

        while (lanjutPesan) {
            System.out.print("\nPilih menu (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Kode promo (NONE jika tidak ada): ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
            System.out.println("Total untuk pesanan ini: Rp " + totalHarga);

            System.out.print("Pesan lagi? (ya/tidak): ");
            if (sc.nextLine().equalsIgnoreCase("tidak")) lanjutPesan = false;
        }

        System.out.println("\nTotal keseluruhan: Rp " + totalKeseluruhan);
        System.out.println("Terima kasih atas pesanan Anda!");
        sc.close();
    }
}

