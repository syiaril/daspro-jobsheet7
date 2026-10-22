import java.util.Scanner;

public class SiakadForLoop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        double lulus=0, tdklulus=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tdklulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Jumlah mahasiswa yang lulus:  " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tdklulus);
        
        sc.close();
    }
}
