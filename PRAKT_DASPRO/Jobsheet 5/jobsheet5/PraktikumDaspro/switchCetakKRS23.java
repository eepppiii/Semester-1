import java.util.Scanner;

public class switchCetakKRS23 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester){
            case 1:
            System.out.println("KRS semester 1 ditampillkan");
            break;
            case 2:
            System.out.println("KRS semester 2 ditampillkan");
            break;
            case 3:
            System.out.println("KRS semester 3 ditampillkan");
            break;
            case 4:
            System.out.println("KRS semester 4 ditampillkan");
            break;
            case 5:
            System.out.println("KRS semester 5 ditampillkan");
            break;
            case 6:
            System.out.println("KRS semester 6 ditampillkan");
            break;
            case 7:
            System.out.println("KRS semester 7 ditampillkan");
            break;
            case 8:
            System.out.println("KRS semester 8 ditampillkan");
            break;
            default:
            System.out.println("Semester tidak valid");
        }
     }
}