import java.util.Scanner;

public class TUGAS23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];
        double totalKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Input jawaban responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    hasilSurvey[i][j] = sc.nextInt();
                    if (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5) {
                        System.out.println("  Nilai harus antara 1-5!");
                    }
                } while (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5);
            }
        }

        System.out.println("\n=== HASIL SURVEI ===");

        System.out.println("\nRata-rata tiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
            double rata = total / 6;
            totalKeseluruhan += total;
            System.out.println("  Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvey[i][j];
            }
            double rata = total / 10;
            System.out.println("  Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        double rataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);
    }
}
