package NGODING;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;
        
        System.out.print("Masukkan Panjang : ");
        System.out.print("Masukkan Panjang : ");
        panjang=sc.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar=sc.nextInt();

        luas = panjang*lebar;
        System.out.println("Luas Persegi adalah : "+ luas);

    }
}
