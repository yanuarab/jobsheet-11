import java.util.Scanner;

public class Percobaan625 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang ");
        p=input.nextInt();
        System.out.print("Masukkan lebar ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi ");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas persegi panjang adalah "+L);

        vol=p*l*L;
        System.out.println("Volume balok adalah "+vol);

    }
        static int hitungluas (int pjg, int lb) {
            int Luas=pjg*lb;
            return Luas;
        }
        static int hitungVolume (int tinggi, int a, int b) {
            int Volume = hitungluas(a,b)*tinggi;
            return Volume;
        }
    }