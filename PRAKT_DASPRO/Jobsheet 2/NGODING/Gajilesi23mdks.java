import java.util.Scanner;
public class Gajilesi23mdks {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gajipokok , tunjanganPerAnak, jumlahAnak;
        double persenPotongan = 0.05;

        System.out.print("Masukkan Gaji Pokok : Rp. ");
        gajipokok = sc.nextInt();
        System.out.print("Masukkan Tunjangan Per Anak : Rp. ");
        tunjanganPerAnak = sc.nextInt();
        System.out.print("Masukkan JumlahAnak : RP.");
        jumlahAnak = sc.nextInt();
        System.out.println("Persen Potongan : " + persenPotongan);


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