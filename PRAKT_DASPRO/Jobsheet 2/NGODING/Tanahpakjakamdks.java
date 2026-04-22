import java.util.Scanner;
public class Tanahpakjakamdks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjangTanah,lebarTanah,jumlahKolamLingkaran, diameterLingkaran, sisiPersegi;
        
        System.out.print("Masukkan Panjang Tanah : ");
        panjangTanah =  sc.nextInt();
        System.out.print("Masukkan Lebar Tanah : ");
        lebarTanah =  sc.nextInt();
        System.out.print("Jumlah Kolam Yang Lingkaran : ");
        jumlahKolamLingkaran =  sc.nextInt();
        System.out.print("Masukkan Diameter Lingkarang : ");
        diameterLingkaran =  sc.nextInt();
        System.out.print("Massukan Sisi Persegi : ");
        sisiPersegi =  sc.nextInt();

        int luasTanah = panjangTanah * lebarTanah;
        double jariJari = diameterLingkaran / 2.0;
        double luasKolamLingkaran = Math.PI * Math.pow(jariJari, 2);
        double totalLuasKolamLingkaran = jumlahKolamLingkaran * luasKolamLingkaran;

        double luasKolamPersegi = sisiPersegi * sisiPersegi;
        double totalKolam = totalLuasKolamLingkaran + luasKolamPersegi;
        double luasRumput = luasTanah - totalKolam;

        System.out.println("===== Perhitungan Luas Tanah Pak Jaka =====");
        System.out.println("Luas Tanah              : " + luasTanah + " m2");
        System.out.println("Total Luas Kolam Lingkaran : " + totalLuasKolamLingkaran + " m2");
        System.out.println("Luas Kolam Persegi      : " + luasKolamPersegi + " m2");
        System.out.println("Total Luas Kolam        : " + totalKolam + " m2");
        System.out.println("Luas Tanah untuk Rumput : " + luasRumput + " m2");
         
    }
}
