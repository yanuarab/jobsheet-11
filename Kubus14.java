import java.util.Scanner; 
 
public class Kubus14 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int sisi, L, vol; 
 
        System.out.print("Masukkan panjang sisi kubus: "); 
        sisi = input.nextInt(); 
 
        L = hitungLuasPermukaan(sisi); 
        vol = hitungVolume(sisi); 
 
        System.out.println("Luas permukaan kubus adalah " + L); 
        System.out.println("Volume kubus adalah " + vol); 
 
        input.close(); 
    } 
 
    static int hitungLuasPermukaan(int sisi) { 
        int luas = 6 * (sisi * sisi); 
        return luas; 
    } 
 
    static int hitungVolume(int sisi) { 
        int volume = sisi * sisi * sisi; 
        return volume; 
    } 
}