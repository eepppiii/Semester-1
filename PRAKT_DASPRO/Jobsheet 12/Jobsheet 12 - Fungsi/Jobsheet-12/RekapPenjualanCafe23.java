import java.util.Scanner;

public class RekapPenjualanCafe23 {
    static String[] menu;

    public static void inputPenjualan(int[][] data) {
        Scanner sc = new Scanner(System.in);

        for (int hari = 0; hari < data.length; hari++) {
            System.out.println("\n=== Hari ke-" + (hari + 1) + " ===");
            for (int m = 0; m < data[0].length; m++) {
                System.out.print("Penjualan " + menu[m] + ": ");
                data[hari][m] = sc.nextInt();
            }
        }   
    }

    public static void tampilkanTabel(int[][] data) {
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.printf("%-12s", "Hari");

        for (String m : menu) {
            System.out.printf("%-15s", m);
        }
        System.out.println();

        for (int hari = 0; hari < data.length; hari++) {
            System.out.printf("%-12s", "Hari " + (hari + 1));
            for (int m = 0; m < data[0].length; m++) {
                System.out.printf("%-15d", data[hari][m]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] data) {

        int jmlMenu = data[0].length;
        int jmlHari = data.length;

        int[] totalPerMenu = new int[jmlMenu];

        for (int m = 0; m < jmlMenu; m++) {
            for (int hari = 0; hari < jmlHari; hari++) {
                totalPerMenu[m] += data[hari][m];
            }
        }

        int max = totalPerMenu[0];
        int idx = 0;

        for (int i = 1; i < jmlMenu; i++) {
            if (totalPerMenu[i] > max) {
                max = totalPerMenu[i];
                idx = i;
            }
        }

        System.out.println("\n=== Menu Dengan Penjualan Tertinggi ===");
        System.out.println("Menu : " + menu[idx]);
        System.out.println("Total Penjualan : " + max);
    }

    public static void rataRataMenu(int[][] data) {

        int jmlMenu = data[0].length;
        int jmlHari = data.length;

        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");

        for (int m = 0; m < jmlMenu; m++) {
            int total = 0;
            for (int hari = 0; hari < jmlHari; hari++) {
                total += data[hari][m];
            }
            double rata = total / (double) jmlHari;
            System.out.println(menu[m] + " = " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine(); // buang newline

        menu = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        int[][] penjualan = new int[jmlHari][jmlMenu];

        inputPenjualan(penjualan);
        tampilkanTabel(penjualan);
        menuTertinggi(penjualan);
        rataRataMenu(penjualan);
    }
    
}
