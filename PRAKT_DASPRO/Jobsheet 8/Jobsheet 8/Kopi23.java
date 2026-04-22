import java.util.Scanner;

public class Kopi23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = sc.nextInt();

        int totalSemuaPelanggan = 0;
        int totalSemuaItem = 0;

        // Loop untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\nCabang " + i);
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            // Loop untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            // Ringkasan per cabang
            System.out.println("Total pelanggan cabang " + i + ": " + jumlahPelanggan);
            System.out.println("Total item terjual cabang " + i + ": " + totalItemCabang);

            // Tambahkan ke total keseluruhan
            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
        }

        // Ringkasan akhir
        System.out.println("\n=== RINGKASAN SELURUH CABANG ===");
        System.out.println("Total seluruh pelanggan: " + totalSemuaPelanggan);
        System.out.println("Total seluruh item terjual: " + totalSemuaItem);
    }
}

