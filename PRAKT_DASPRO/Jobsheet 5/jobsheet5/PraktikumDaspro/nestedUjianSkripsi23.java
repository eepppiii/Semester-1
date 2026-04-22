import java.util.Scanner;

public class nestedUjianSkripsi23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print(" Apakah Mahasiswa sudah bebas kompen ? (ya/tidak) : ");
        String bebaskompen = sc.nextLine().trim();
        System.out.print(" Masukkan jumlah log bimbingan pembimbingan 1 : ");
        int bimbinganP1 = sc.nextInt();
        System.out.print(" Masukkan jumlah log bimbingan pembimbingan 1 : ");
        int bimbinganP2 = sc.nextInt();
        
        
        if (bebaskompen.equalsIgnoreCase("ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "Mahasiswa boleh mengikuti ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan pembimbing P1 kurang dari 8 kali dan pembimbing P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan pembimbing P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan pembimbing P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";     
        }
        System.out.println(pesan);
    }
}
