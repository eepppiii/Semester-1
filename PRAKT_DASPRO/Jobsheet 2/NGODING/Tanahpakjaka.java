public class Tanahpakjaka {
    public static void main(String[] args) {
      int panjangTanah = 100;
        int lebarTanah = 50;
        int jumlahKolamLingkaran = 2;
        int diameterLingkaran = 2;
        int sisiPersegi = 2;

        int luasTanah = panjangTanah * lebarTanah;

        double jariJari = diameterLingkaran / 2.0;
        double luasKolamLingkaran = Math.PI * Math.pow(jariJari, 2);
        double totalLuasKolamLingkaran = jumlahKolamLingkaran * luasKolamLingkaran;

        int luasKolamPersegi = sisiPersegi * sisiPersegi;

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
