public class Nomer2 { 
    private static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"}; 
    private static int[][] dataPenjualan = { 
        {20, 20, 25, 20, 10, 60, 10},   
        {30, 80, 40, 10, 15, 20, 25},   
        {5, 9, 20, 25, 10, 5, 45},      
        {50, 8, 17, 18, 10, 30, 6},     
        {15, 10, 16, 15, 10, 10, 55}   
    }; 
 
    public static void tampilkanDataPenjualan() { 
        System.out.println("A. Data Penjualan Kafe:"); 
         
        for (int i = 0; i < menu.length; i++) { 
            System.out.printf("%-10s: ", menu[i]); 
            for (int j = 0; j < 7; j++) { 
                System.out.printf("%d ", dataPenjualan[i][j]); 
            } 
            System.out.println(); 
        } 
    } 
 
    public static void tampilkanSemuaPenjualan() { 
        System.out.println("\nB. Seluruh Data Penjualan hari pertama sd akhir:"); 
        System.out.println("------------------------------------------------"); 
         
        for (int i = 0; i < menu.length; i++) { 
            System.out.printf("%-10s: ", menu[i]); 
            for (int j = 0; j < 7; j++) { 
                System.out.printf("%d ", dataPenjualan[i][j]); 
            } 
            System.out.println(); 
        } 
    } 
 
    public static void tampilkanPenjualanTertinggi() { 
        int totalTertinggi = 0; 
        int indexMenuTertinggi = 0; 
         
        for (int i = 0; i < menu.length; i++) { 
            int total = 0; 
            for (int j = 0; j < 7; j++) { 
                total += dataPenjualan[i][j]; 
            } 
            if (total > totalTertinggi) { 
                totalTertinggi = total; 
                indexMenuTertinggi = i; 
            } 
        } 
 
        System.out.printf("\nC. Menu dengan penjualan tertinggi: '%s' dengan total %d\n",  
            menu[indexMenuTertinggi], totalTertinggi); 
    } 
 
    public static void tampilkanRataRataPenjualan() { 
        System.out.println("\nD. Rata-rata Penjualan Setiap Menu:"); 
        System.out.println("------------------------------------------------"); 
         
        for (int i = 0; i < menu.length; i++) { 
            int total = 0; 
            for (int j = 0; j < 7; j++) { 
                total += dataPenjualan[i][j]; 
            } 
            double rataRata = (double) total / 7; 
            System.out.printf("%s: %.2f\n", menu[i], rataRata); 
        } 
    } 
 
    public static void main(String[] args) { 
     
        tampilkanDataPenjualan(); 
        tampilkanSemuaPenjualan(); 
        tampilkanPenjualanTertinggi(); 
        tampilkanRataRataPenjualan(); 
    } 
}