import java.util.Scanner;

public class ifCetakPresensi23 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("--- Cetak KRS ---"); 
       System.out.print("Apakah UKT sudah lunas? (true/false): ");
       boolean uktlunas = sc.nextBoolean();
       
       String ukt = uktlunas ? "UKT terverifikasi " : "Registrasi ditolak ";
       System.out.print(ukt);

    }
}
