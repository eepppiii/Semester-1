import java.util.Scanner;

public class ArrayNilai23 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke-" + i + ":");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus! ");
            } else if (nilaiAkhir[i] < 70) {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus! ");
            }
        }

    }
}
