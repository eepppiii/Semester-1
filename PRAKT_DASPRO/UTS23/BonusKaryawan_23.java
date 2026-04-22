import java.util.Scanner;

public class BonusKaryawan_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kerja, lama_kerja, Total_Sementara = 0, gaji, Total_Gaji;
        String serti;

        System.out.print("Masukkan Kinerja :");
        kerja = sc.nextInt();
        System.out.print("Masukkan Lama Kerja /Tahun : ");
        lama_kerja = sc.nextInt();
        System.out.print("Masukkan Gaji : Rp.");
        gaji = sc.nextInt();
        System.out.print("Apakah Memliki Setif? (ya/tidak) : ");
        serti = sc.next();

        // Menentukan bonus berdasarkan nilai kerja dan lama kerja
        if (kerja >= 70 && kerja <= 89) {
            if (lama_kerja < 2) {
                System.out.println("Mendapatkan Bonus 1%");
                Total_Sementara = gaji + (gaji * 1 / 100);
            } else if (lama_kerja >= 2 && lama_kerja <= 5) {
                System.out.println("Mendapatkan Bonus 3%");
                Total_Sementara = gaji + (gaji * 3 / 100);
            } else if (lama_kerja >= 5) {
                System.out.println("Mendapatkan Bonus 5%");
                Total_Sementara = gaji + (gaji * 5 / 100);
            }
        } else {
            // Jika nilai kerja < 70 tidak dapat bonus
            Total_Sementara = gaji;
            System.out.println("Tidak mendapatkan bonus karena nilai kerja < 70.");
        }
        
        if (kerja >= 90 && kerja <= 100) {
            if (lama_kerja < 2) {
                System.out.println("Mendapatkan Bonus 2%");
                Total_Sementara = gaji + (gaji * 2 / 100);
            } else if (lama_kerja >= 2 && lama_kerja <= 5) {
                System.out.println("Mendapatkan Bonus 4%");
                Total_Sementara = gaji + (gaji * 4 / 100);
            } else if (lama_kerja > 5) {
                System.out.println("Mendapatkan Bonus 7%");
                Total_Sementara = gaji + (gaji * 7 / 100);
            }
        } else {
            // Jika nilai kerja < 90, tidak dapat bonus
            Total_Sementara = gaji;
            System.out.println("Tidak mendapatkan bonus karena nilai kerja < 90.");
        }

        

        // Menentukan tambahan bonus sertifikat
        if (serti.equalsIgnoreCase("ya")) {
            System.out.println("Mendapat tambahan Rp 500.000 karena memiliki sertifikat.");
            Total_Gaji = Total_Sementara + 500000;
        } else {
            Total_Gaji = Total_Sementara;
        }

        System.out.println("Total Gaji Karyawan : " + Total_Gaji);

    }
}
