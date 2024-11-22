import java.util.Scanner; 
 
public class Nomer3 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
         
        System.out.print("Masukkan jumlah menu: "); 
        int jmlMenu = input.nextInt(); 
        System.out.print("Masukkan jumlah hari: "); 
        int jmlHari = input.nextInt(); 
        input.nextLine(); 
         
        String[] menu = new String[jmlMenu]; 
        int[][] penjualan = new int[jmlMenu][jmlHari]; 
         
        System.out.println("\nInput nama menu:"); 
        for(int i = 0; i < jmlMenu; i++) { 
            System.out.print("Menu " + (i+1) + ": "); 
            menu[i] = input.nextLine(); 
        } 
         
        System.out.println("\nInput data penjualan:"); 
        for(int i = 0; i < jmlMenu; i++) { 
            System.out.println("Penjualan " + menu[i] + ":"); 
            for(int j = 0; j < jmlHari; j++) { 
                System.out.print("Hari " + (j+1) + ": "); 
                penjualan[i][j] = input.nextInt(); 
            } 
        } 
         
        System.out.println("\nTabel Penjualan:"); 
        System.out.print("Menu\t"); 
        for(int i = 0; i < jmlHari; i++) { 
            System.out.print("Hari" + (i+1) + "\t"); 
        } 
        System.out.println(); 
         
        for(int i = 0; i < jmlMenu; i++) { 
            System.out.print(menu[i] + "\t"); 
            for(int j = 0; j < jmlHari; j++) { 
                System.out.print(penjualan[i][j] + "\t"); 
            } 
            System.out.println(); 
        } 
         
        int maxTotal = 0; 
        String menuTertinggi = ""; 
        for(int i = 0; i < jmlMenu; i++) { 
            int total = 0; 
            for(int j = 0; j < jmlHari; j++) { 
                total += penjualan[i][j]; 
            } 
            if(total > maxTotal) { 
                maxTotal = total; 
                menuTertinggi = menu[i]; 
            } 
        } 
        System.out.println("\nMenu terlaris: " + menuTertinggi); 
        System.out.println("Total penjualan: " + maxTotal); 
         
        System.out.println("\nRata-rata Penjualan:"); 
        for(int i = 0; i < jmlMenu; i++) { 
            int total = 0; 
            for(int j = 0; j < jmlHari; j++) { 
                total += penjualan[i][j]; 
            } 
            double rata = (double)total / jmlHari; 
            System.out.println(menu[i] + ": " + rata); 
        } 
         
        input.close(); 
    } 
} 
