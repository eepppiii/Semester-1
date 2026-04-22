import java.util.Scanner;

public class kafe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Pesanan :");
        int Psn = sc.nextInt();
        sc.nextLine();

        String[] namaMenu = new String[Psn];
        double[] hargaMenu = new double[Psn];
        double total = 0;

        for (int i = 0; i < Psn; i++) {
            System.out.print("\nPesanan ke-" + (i + 1));
            System.out.print(" Masukkan nama makanan/minuman: ");
            namaMenu[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaMenu[i] = sc.nextDouble();
            sc.nextLine();

            total += hargaMenu[i];
        }

        System.out.println("\n=== DAFTAR PESANAN KAFE ===");
        for (int i = 0; i < Psn; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }

        System.out.println("\nTotal harga semua pesanan: Rp " + total);
    

    }
}
