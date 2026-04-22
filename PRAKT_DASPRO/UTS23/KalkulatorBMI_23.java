import java.util.Scanner;

public class KalkulatorBMI_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tinggi,berat,BMI;

        //Pengimputan BB Dan TB
        System.out.print("Masukan Berat Badan /KG :");
        berat = sc.nextDouble();
        System.out.print("Masukan Tinggi Badan /M :");
        tinggi = sc.nextDouble();

        //Menghitung BMI
        BMI = berat/(tinggi*tinggi);
        //Membagikan BMI Masuk ke bagian mana
        if (BMI < 18.5) {
            System.out.println("===============================");
            System.out.println("BMI :" + BMI);
            System.out.println("Kurang Berat Badan (UnderWeight)");
            System.out.println("Resiko : " + "Kekurangan Gizi,osteoporosis,Penurunan Sistem Kekebalan tubuh");
            System.out.println("===============================");
        }else if (BMI >= 18.5 && BMI < 25){
            System.out.println("===============================");
            System.out.println("BMI :" + BMI);
            System.out.println("Berat Badan Normal (NormalWeight)");
            System.out.println("Resiko : " + "Relatif Rendah");
            System.out.println("===============================");
        }else if (BMI >= 25 && BMI < 30){
            System.out.println("===============================");
            System.out.println("BMI :" + BMI);
            System.out.println("Kelebihan Berat Badan (OverWeight)");
            System.out.println("Resiko : " + "Meningkatkannya risiko penyakit jantung, Diabetes, Tekanan Darah Tinggi");        
            System.out.println("===============================");
        }else if (BMI >= 30){
            System.out.println("===============================");
            System.out.println("BMI :" + BMI);
            System.out.println("Obesistas (Obese)");
            System.out.println("Resiko : " + "Risiko tinggi penyakit jantung, Diabetes, Tekanan Darah Tinggi, Masalah Pernahpasan, dan beberapa jenis kanker");        
            System.out.println("===============================");
        }

        
    }
}
