public class GajiJesi23 {

    public static void main(String[] args){
        int gajipokok = 3000000;
        int tunjanganPerAnak = 150000;
        int jumlahAnak = 3;
        double persenPotongan = 0.05;
        
        int totaltunjangan = tunjanganPerAnak * jumlahAnak;
        int gajiKotor = gajipokok + totaltunjangan;
        double potongan = persenPotongan * gajipokok;
        double gajiBersih = gajiKotor - potongan;

        System.out.println("==== Gaji Bu jesi ====");
        System.out.println("Gaji Pokok      : Rp " +gajipokok);
        System.out.println("Tunjangan Anak  : Rp " +totaltunjangan);
        System.out.println("Gaji Kotor      : Rp " +gajiKotor);
        System.out.println("Potongan (5%)   : Rp " +potongan);
        System.out.println("Gaji Bersih     : Rp " +gajiBersih);

    }
}