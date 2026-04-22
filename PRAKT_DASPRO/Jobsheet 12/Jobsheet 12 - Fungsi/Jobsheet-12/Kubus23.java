import java.util.Scanner;

public class Kubus23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        System.out.println("Volume Kubus = " + KubusNoAbsen.hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus = " + KubusNoAbsen.hitungLuasPermukaan(sisi));
    }
}

class KubusNoAbsen {

    public static int hitungVolume(int s) {
        return s * s * s;
    }

    public static int hitungLuasPermukaan(int s) {
        return 6 * s * s;
    }
}
