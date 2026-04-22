import java.util.Scanner;

public class Toko23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = { "pensil", "pulpen", "buku", "penghapus", "penggaris" };
        int[] harga = { 2000, 3000, 5000, 1500, 2500 };

        for (String Nama : nama) {
            System.out.println(Nama);
        }

        while (true) {  
            System.out.print("\nMasukkan barang yang dicari (atau ketik 'keluar' untuk keluar) :");
            String cari = sc.nextLine();

            if (cari.equalsIgnoreCase("keluar")) {
                System.out.println("Program selesai.");
                break;
            }

            boolean ditemukan = false;

            for (int i = 0; i < nama.length; i++) {
                if (cari.equalsIgnoreCase(nama[i])) {
                    System.out.println("\nBarang ditemukan!");
                    System.out.println("Nama Barang : " + nama[i]);
                    System.out.println("Harga       : " + harga[i]);
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Barang tidak ditemukan. Coba lagi!");
            }

        }
}
}