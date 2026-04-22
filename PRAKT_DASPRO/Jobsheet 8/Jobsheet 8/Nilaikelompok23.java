import java.util.Scanner;

public class Nilaikelompok23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nilai;
        float totalNilai, rataNilai;

        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari penilai " + j + " : ");
                Nilai = sc.nextInt();
                totalNilai += Nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " adalah: " + rataNilai);
            System.out.println();

            // Cek apakah rata-rata ini tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("=====================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " 
                           + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
        sc.close();
    }
}
