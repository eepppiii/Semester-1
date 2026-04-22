import java.util.Scanner;

public class PersegiBolong23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {         
            for (int j = 1; j <= n; j++) {     
                if (n == 1) {
                    System.out.print("1"); 
                    break;
                } else if (n == 2) {
                    System.out.print(n + " ");
                } else if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " "); // tepi persegi
                } else {
                    System.out.print("  "); // tengah kosong
                }
            }
            if (n != 1) System.out.println();
        }
    }
}
