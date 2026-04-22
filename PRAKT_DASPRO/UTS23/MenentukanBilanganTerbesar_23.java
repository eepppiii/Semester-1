import java.util.Scanner;

public class MenentukanBilanganTerbesar_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip1, ip2, ip3;

        // Menginputkan Tiga Angka
        System.out.print("Masukkan Inputan 1: ");
        ip1 = sc.nextInt();
        System.out.print("Masukkan Inputan 2: ");
        ip2 = sc.nextInt();
        System.out.print("Masukkan Inputan 3: ");
        ip3 = sc.nextInt();

        // Menentukan angka terbesar
        int terbesar = Math.max(ip1, Math.max(ip2, ip3));

        if (ip1 == terbesar && ip2 == terbesar && ip3 == terbesar) {
            System.out.println("Semua angka sama besar: " + terbesar);
        } else if ((ip1 == terbesar && ip2 == terbesar) ||
                   (ip2 == terbesar && ip3 == terbesar) ||
                   (ip1 == terbesar && ip3 == terbesar)) {
            System.out.print("Ada beberapa angka terbesar: ");
            if (ip1 == terbesar) System.out.print(ip1 + " ");
            if (ip2 == terbesar) System.out.print(ip2 + " ");
            if (ip3 == terbesar) System.out.print(ip3 + " ");
            System.out.println();
        } else {
            System.out.println("Angka terbesar adalah: " + terbesar);
        }

        sc.close();
    }
}
