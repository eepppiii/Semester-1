package NGODING;

import java.util.Scanner;

public class PakAli23 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

        int hargaMotor, uangMuka, cicilan, LamaCicilan;
        double bunga = 0.01,CicilanPerbulan,TotalBayar,TotolBunga,SisaBayar; 

        System.out.print("masukan harga motor : Rp.");
        hargaMotor= sc.nextInt();
        System.out.print("masukan uang muka : Rp.");
        uangMuka= sc.nextInt();
        System.out.print("masukn lama cicilan/bulan : ");
        LamaCicilan= sc.nextInt();
        SisaBayar = hargaMotor- uangMuka; 
        TotolBunga = SisaBayar * bunga * LamaCicilan;
        TotalBayar = SisaBayar + TotolBunga;
        CicilanPerbulan  =TotalBayar/LamaCicilan;
        System.out.println("jumlah cicilan perbulan anda adalah Rp."+ CicilanPerbulan);

    
}
}
