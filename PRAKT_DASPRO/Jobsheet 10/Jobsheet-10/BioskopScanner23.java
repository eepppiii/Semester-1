import java.util.Scanner;

public class BioskopScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("⚠️ Nomor baris atau kolom tidak tersedia! Silakan coba lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("⚠️ Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ".");
                            System.out.println("Silakan pilih kursi lain!");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("✅ Data penonton berhasil dimasukkan!");
                            break; 
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print("[" + isi + "] ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }

        } while (menu != 3);
    }
}
