import java.util.Scanner;

public class SistemPerpus23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cek Akses Perpustakaan ---");

        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean bawaKartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean sudahRegistrasiOnline = sc.nextBoolean();

        System.out.println("\n--- Hasil Cek ---");
        System.out.println("Bawa Kartu: " + bawaKartuMahasiswa);
        System.out.println("Registrasi Online: " + sudahRegistrasiOnline);

        if (bawaKartuMahasiswa || sudahRegistrasiOnline) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Ditolak Masuk");
        }

        sc.close();
    }
}
