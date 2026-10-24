import java.util.Scanner;

public class TugasBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int Harga_Tiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("Penjualan tiket bioskop (masukkan 0 untuk mengakhiri)");

        while (true) {
            System.out.print("Jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("input tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }
            if (jumlahTiket == 0){
                break;
            }

            double diskon = 0;
            if ( jumlahTiket > 10 ) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                }
                double total = jumlahTiket * Harga_Tiket * (1-diskon);
                System.out.println("Diskon: " + (int) (diskon * 100) + "%");
                System.out.println ("Total bayar pelanggan: Rp " + (long) total);

                totalTiket += jumlahTiket;
                totalPenjualan += total;
            
            
            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total penjualan hari ini: Rp " + (long) totalPenjualan);

            sc.close();
        }
    }
}
