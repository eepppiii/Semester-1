import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bnyk_nilai;
        int hasil = -1;

        System.out.print("Masukkan banyak nilai yang ingin di input : ");
        bnyk_nilai = sc.nextInt();

        int[] arrNilai = new int[bnyk_nilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
         if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa " + hasil);
        } else {
            System.out.println("Nilai tidak ditemukan");
        }
    }
}