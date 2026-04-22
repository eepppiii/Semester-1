import java.util.Scanner;
public class SOAL2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km,hrg_bensin,tol,konsum_bbm,hari,total_supir,total_biaya,konsum_bbm_liter;
        int supir = 300000;

        System.out.print("Masukkan harga BBM : Rp.");
        hrg_bensin = sc.nextInt();
        System.out.print("Masukkan jarak yang di tempuh /km :");
        km = sc.nextInt();
        System.out.print("Masukkan Biaya Tol :");
        tol = sc.nextInt();
        System.out.print("Masukkan berapa hari perjalanan :");
        hari = sc.nextInt();
        System.out.println("======================");


        konsum_bbm = hrg_bensin * km;
        konsum_bbm_liter = konsum_bbm / hrg_bensin;
        total_supir = hari * supir;
        total_biaya = konsum_bbm + tol + total_supir;

        System.out.println("Total jarak yang di tempuh : "+ km + "km");
        System.out.println("Harga BBM : Rp. "+ hrg_bensin + ("/liter"));
        System.out.println("Total Konsum BBM : "+ konsum_bbm_liter + ("/liter") );
        System.out.println("Total harga tol : Rp. "+ tol);
        System.out.println("Total perjalanan : " + hari +"hari");
        System.out.println("Total harga supir : Rp. " + total_supir);
        System.out.println("======================");
        System.out.println("Total biaya perjalanan : Rp. " + total_biaya);

    }
}
