import java.util.Scanner;

public class Tugas1TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket=0, totalHarga=0, totalHargaSat, jumlahPelanggan, jumlahTiket, diskon;
        int hargaTiket = 50000, i =0;

        System.out.print("Masukkan jumlah pelanggan dalam sehari: ");
        jumlahPelanggan = sc.nextInt();

        while (i < jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-"+(i+1)+": ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket > 10) {
                diskon = (hargaTiket * jumlahTiket *15/100);
                totalHargaSat = hargaTiket * jumlahTiket - diskon; 
            } else if (jumlahTiket > 4) {
                diskon = (hargaTiket * jumlahTiket *10/100);
                totalHargaSat = hargaTiket * jumlahTiket - diskon;
            } else if (jumlahTiket >= 0) {
                totalHargaSat = hargaTiket * jumlahTiket;
            } else {
                System.out.println("Input tidak valid, input ulang");
                continue;
            }
            
            i++;
            totalTiket += jumlahTiket;
            totalHarga += totalHargaSat;   
        } 
        System.out.println("---------------------------------------------");
        System.out.println("Total tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total harga penjualan tiket hari ini: Rp " + totalHarga);

        sc.close();
    }
}
