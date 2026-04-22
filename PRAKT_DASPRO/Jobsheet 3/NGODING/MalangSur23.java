package NGODING;

import java.util.Scanner;

public class MalangSur23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jarak, hargabensin=10000;
        double literBensin, biayaBensin;
        System.out.print("masukan jarak yang akan di tempuh/KM : ");
        jarak= sc.nextInt();
        literBensin= jarak / 2;
        biayaBensin= literBensin * hargabensin;
        System.out.println("biaya bensin yang di perlukan selama perjalanan anda adalah = "+ biayaBensin);
    }
}
