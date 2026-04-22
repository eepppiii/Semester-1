import java.util.Scanner;

public class Tugas2IFElse23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        if(angka % 2 == 0){
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
}
