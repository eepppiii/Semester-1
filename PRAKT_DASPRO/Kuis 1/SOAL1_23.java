import java.util.Scanner;
public class SOAL1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double kuis,uts,uas,total_kuis,total_uts,total_uas,nilai_akhir;

        System.out.print("Masukkan Nilai kuis :");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai uts :");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai uas :");
        uas = sc.nextDouble();

        total_kuis = kuis * 30/100;
        System.out.println("Hasil Dari Nilai Kuis :" + total_kuis);
        total_uts = uts * 30/100;
        System.out.println("Hasil Dari Nilai Kuis :"+ total_uts);
        total_uas = uas * 40/100;
        System.out.println("Hasil Dari Nilai Kuis :"+ total_uas);
        
        nilai_akhir = total_kuis + total_uts + total_uas;
        System.out.println("Hasil Nilai Akhir :" +nilai_akhir);
    }
    
}