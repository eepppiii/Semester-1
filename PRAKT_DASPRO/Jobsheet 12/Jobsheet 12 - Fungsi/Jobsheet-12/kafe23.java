import java.util.Scanner;

public class kafe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        String kodePromo = "DISKON30";
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("Masukkan nomor menu (1-6) atau 0 untuk selesai: ");
            int pilihaMenu = sc.nextInt();

            if (pilihaMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int subtotal = hitungTotalHarga(pilihaMenu, banyakItem, kodePromo);

            System.out.println("Subtotal pesanan ini: Rp " + subtotal);
            System.out.println("-----------------------------------");

            totalKeseluruhan += subtotal;
        }

        System.out.println("===================================");
        System.out.println("TOTAL KESELURUHAN PESANAN : Rp " + totalKeseluruhan);
    }

    public static void Menu(String namaPelangan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelangan);

        if (isMember) {
            System.out.println("Anda adalah member, Dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("===== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");
        System.out.println("==========================");
    }

    public static int hitungTotalHarga(int pilihaMenu, int banyakItem, String kodePromo) {
        int[] HargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = HargaItems[pilihaMenu - 1] * banyakItem;

        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = totalHarga * 50 / 100;
            System.out.println("Diskon 50% = Rp " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = totalHarga * 30 / 100;
            System.out.println("Diskon 30% = Rp " + diskon);
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        return totalHarga - diskon;
    }
}
