import java.util.Scanner;

public class Square23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) { 
            for (int j = 0; j <= N; j++) { // loop kolom (gunakan j, bukan i)
                System.out.print("*");
            }
            System.out.println(); // pindah ke baris berikutnya
        }
    }
}
