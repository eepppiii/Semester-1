import java.util.Scanner;

public class Tugas1 {
    static int totalRekursif(int n) {
        if (n == 0) {
            return 0;   
        } else {
            return n + totalRekursif(n - 1);
        }
    }

    static int totalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

         for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int dummy = sc.nextInt();  
        }

        int hasilRekursif = totalRekursif(N);
        int hasilIteratif = totalIteratif(N);

        System.out.println("Total dari 1 sampai " + N + " (rekursif)  : " + hasilRekursif);
        System.out.println("Total dari 1 sampai " + N + " (iteratif)  : " + hasilIteratif);
  
    }
}
