import java.util.Scanner;

public class kafe2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"nasi goreng", "mie goreng", "roti bakar", "kentang goreng", "teh tarik", 
                        "cappucino", "cholate ice"};

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        
        System.out.print("Makanan/Minuman yang ingin dicari : ");
        String cari = sc.nextLine().toLowerCase();

         boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu \"" + menu[i] + "\" tersedia di kafe");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu \"" + cari + "\" tidak tersedia di kafe");
        }

    }
}
