import java.util.Scanner;
 
public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
 
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
 
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
 
        }
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
