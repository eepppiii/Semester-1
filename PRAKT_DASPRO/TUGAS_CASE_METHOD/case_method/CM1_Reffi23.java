import java.util.Scanner;

public class CM1_Reffi23 {
    public static void main(String[] args) {
        String nama, nim;
        int Status;
        String statusAlgo = "";
        String statusData = "";
        Scanner sc = new Scanner(System.in);
        Double UTS,UAS,TUGAS,uts,uas,tugas,Total_algo,Total_Data,Rata_Rata;
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        
        System.out.println("--- MATA KULIAH 1 : ALGORITMA DAN PEMOGRAMAN ---");
        System.out.print("Nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        UAS = sc.nextDouble();
        System.out.print("Nilai TUGAS: ");
        TUGAS = sc.nextDouble();
        
        System.out.println("--- MATA KULIAH 2 : SRUKTUR DATA---");
        System.out.print("Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        uas = sc.nextDouble();
        System.out.print("Nilai TUGAS: ");
        tugas = sc.nextDouble();
        
        
        System.out.println("");
        System.out.println("===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);

            System.out.print("Mata Kuliah ");
            System.out.print("  UTS ");
            System.out.print("UAS ");
            System.out.print("Tugas ");
            System.out.print("Nilai Akhir ");
            System.out.print("Nilai Huruf ");
            System.out.println("Status");
            System.out.println("------------------------------------------------");

        Total_algo = (UTS*30/100)+(UAS*40/100)+(TUGAS*30/100);
        if (Total_algo >= 80 && Total_algo <= 100) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print(" A "); 
            System.out.println(" Lulus "); 
            statusAlgo = "Lulus";
            
        } else if (Total_algo >= 73 && Total_algo < 80) {
            System.out.print("Algoritma Pemograman   ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("B+");
            System.out.println("Lulus");
            statusAlgo = "Lulus";
        } else if (Total_algo >= 65 && Total_algo < 73) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("B");
            System.out.println("Lulus");
            statusAlgo = "Lulus";
        } else if (Total_algo >= 60 && Total_algo < 65) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("C+");
            System.out.println("Lulus");
            statusAlgo = "Lulus";
        } else if (Total_algo >= 50 && Total_algo < 60) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("C");
            System.out.println("Tidak Lulus");
            statusAlgo = "Tidak Lulus";
        } else if (Total_algo >= 39 && Total_algo < 50) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("D");
            System.out.println("Tidak Lulus");
            statusAlgo = "Tidak Lulus";
        } else if(Total_algo <= 39) {
            System.out.print("Algoritma Pemograman ");
            System.out.print("\t" + UTS + "\t" );
            System.out.print("\t" + UAS + "\t" );
            System.out.print("\t" + TUGAS + "\t" );
            System.out.print("\t" + Total_algo + "\t" );
            System.out.print("E");
            System.out.println("Tidak Lulus");
            statusAlgo = "Tidak Lulus";
        }


        Total_Data = (uts*0.3)+(uas*0.4)+(tugas*0.3);
        if (Total_Data >= 80 && Total_Data <= 100) {
            System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("A");
            System.out.println("Lulus");
            statusData = "Lulus";
            
        } else if (Total_Data >= 73 && Total_Data < 80) {
             System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("B+");
            System.out.println("Lulus");
            statusData = "Lulus";
        } else if (Total_Data >= 65 && Total_Data < 73) {
             System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("B");
            System.out.println("Lulus");
            statusData = "Lulus";
        } else if (Total_Data >= 60 && Total_Data < 65) {
             System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("C+");
            System.out.println("Lulus");
            statusData = "Lulus";
        } else if (Total_Data >= 50 && Total_Data < 60) {
            System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("C");
            System.out.println("Tidak Lulus");
            statusData = "Tidak Lulus";
        } else if (Total_Data >= 39 && Total_Data < 50) {
             System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("B+");
            System.out.println("Tidak Lulus");
            statusData = "Tidak Lulus";
        } else if(Total_Data <=39){
             System.out.print("Struktur Data ");
            System.out.print("\t" + uts + "\t" );
            System.out.print("\t" + uas + "\t" );
            System.out.print("\t" + tugas + "\t" );
            System.out.print("\t" + Total_Data + "\t" );
            System.out.print("E"+ "\t");
            System.out.println("Tidak Lulus");
            statusData = "Tidak Lulus";
        }

        
        Rata_Rata = (Total_Data+Total_algo)/2;
        System.out.println ("Rata-Rata Nilai Akhir : "+ Rata_Rata);

        if (statusAlgo.equals("Tidak Lulus") || statusData.equals("Tidak Lulus")) {
        System.out.println("Status Semester : Tidak Lulus");
        } else if (Rata_Rata >= 70) {
        System.out.println("Status Semester : Lulus");
        } else {
        System.out.println("Status Semester : Tidak Lulus (karena rata-rata di bawah 70)");
        }
    }
}