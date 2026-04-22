import java.util.Scanner;

public class Mahasiswa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlh = sc.nextInt();

        int[][] nilai = new int[jmlh][3];
        double[] rataRata = new double[jmlh];
        String[] grade = new String[jmlh];

        for (int i = 0; i < jmlh; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            double total = 0.0;

            for (int j = 0; j < 3; j++) {
                if (j == 0) System.out.print("Nilai Matematika: ");
                else if (j == 1) System.out.print("Nilai Bahasa Inggris: ");
                else System.out.print("Nilai Daspro: ");

                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];
            }

            double rata = total / 3.0;
            rataRata[i] = rata;

            if (rata >= 85) grade[i] = "A";
            else if (rata >= 70) grade[i] = "B";
            else if (rata >= 55) grade[i] = "C";
            else if (rata >= 40) grade[i] = "D";
            else grade[i] = "E";
        }

        System.out.println("\n=== TABEL NILAI MAHASISWA ===");
        System.out.printf("%-15s %-15s %-15s %-15s %-10s\n", "Mahasiswa", "Matematika", "Bahasa Inggris", "Daspro", "Rata-Rata", "Grade");
        for (int i = 0; i < jmlh; i++) {
            System.out.printf("%-15s %-15d %-15d %-15d %-10.2f %-10s\n",
                    "Mahasiswa " + (i + 1),
                    nilai[i][0],
                    nilai[i][1],
                    nilai[i][2],
                    rataRata[i],
                    grade[i]);
        }

        double maxRata = rataRata[0];
        int indexMax = 0;
        for (int i = 1; i < jmlh; i++) {
            if (rataRata[i] > maxRata) {
                maxRata = rataRata[i];
                indexMax = i;
            }
        }

        System.out.println("\nMahasiswa dengan rata-rata tertinggi:");
        System.out.println("Mahasiswa ke-" + (indexMax + 1));
        System.out.println("Rata-Rata = " + maxRata);
        System.out.println("Grade = " + grade[indexMax]);
    }
}
