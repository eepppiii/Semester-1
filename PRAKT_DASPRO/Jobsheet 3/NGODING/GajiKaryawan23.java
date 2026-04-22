    package NGODING;

    import java.util.Scanner;

    public class GajiKaryawan23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int gajipokok;
            double bonus, totgaji;
            double tunjTrans=600000;
            double tunjMkn=400000;
             
            System.out.print("Masukkan gaji pokok : Rp.");
            gajipokok=sc.nextInt();
            
            bonus=0.05*gajipokok;
            totgaji=gajipokok+tunjTrans+tunjMkn+bonus-(0.01*gajipokok);
            System.out.println("bonus bulanan Anda adalah Rp. "+bonus);
            System.out.println("gaji yang diterima adalah Rp. "+totgaji);

        }
    }
