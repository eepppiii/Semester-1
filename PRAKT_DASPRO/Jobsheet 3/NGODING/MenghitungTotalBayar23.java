package NGODING;

import java.util.Scanner;

public class MenghitungTotalBayar23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.print("Masukkan Harga adalah Rp. ");
        harga=sc.nextInt();
        potongan = diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
        
    }
}
