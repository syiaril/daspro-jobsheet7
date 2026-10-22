import java.util.Scanner;

public class Tugas1TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0, totalHarga = 0, totalHargaSat, jumlahPelanggan = 0, jumlahTiket, diskon;
        int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + (jumlahPelanggan + 1) + " (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, input ulang");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket > 10) {
                diskon = (hargaTiket * jumlahTiket * 15 / 100);
                totalHargaSat = hargaTiket * jumlahTiket - diskon;
            } else if (jumlahTiket > 4) {
                diskon = (hargaTiket * jumlahTiket * 10 / 100);
                totalHargaSat = hargaTiket * jumlahTiket - diskon;
            } else {
                totalHargaSat = hargaTiket * jumlahTiket;
            }

            jumlahPelanggan++;
            totalTiket += jumlahTiket;
            totalHarga += totalHargaSat;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total pelanggan hari ini: " + jumlahPelanggan);
        System.out.println("Total tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total harga penjualan tiket hari ini: Rp " + totalHarga);

        sc.close();
    }
}