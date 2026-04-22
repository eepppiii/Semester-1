import java.util.Scanner;

public class Nilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai Yang Ingin Di Masukan :");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ":");
            nilai[i] = sc.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("=== Daftar Nilai yang Dimasukkan ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai Tertinggi: " + max);
        System.out.println("Nilai Terendah : " + min);
    }
}