import java.util.Scanner;

public class NilaiMhsiswa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;

        System.out.print("Masukkan banyak nilai mahasiswa yang ingin diinput : ");
        int bnyk_mhsiswa = sc.nextInt();

        int[] nilaiMhs = new int[bnyk_mhsiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("\n=== HASIL DATA NILAI MAHASISWA ===");
        System.out.print("Semua nilai yang telah dimasukkan: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i] + " ");
        }

        System.out.println("\nRata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}
