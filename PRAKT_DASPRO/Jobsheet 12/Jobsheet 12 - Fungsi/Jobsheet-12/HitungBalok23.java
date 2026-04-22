import java.util.Scanner;

public class HitungBalok23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L, vol;

        System.out.println("Masukkan Panjang");
        p = sc.nextInt();
        System.out.println("Masukkan Lebar");
        l = sc.nextInt();
        System.out.println("Masukkan Tinggi");
        t = sc.nextInt();

        L = p*l;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = p*l*t;
        System.out.println("Volume balok adalah " + vol);
        sc.close();
    }
    static int hitungLuas (int pjg, int Ib){
        int luas = pjg * Ib;
        return luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b)* tinggi;
        return volume;
    }
    

}
