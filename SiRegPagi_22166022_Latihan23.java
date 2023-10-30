/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi_22166022_latihan23;
import java.util.Scanner;
/**
 *
 *Nama      : Ilhan Ramadhanu
 *Nim       : 22166022
 *Prodi     : Sistem Informasi
 *Matkul    : PBO1
 */
public class SiRegPagi_22166022_Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("==Program Nilai Terbesar dan Terkecil Nilai Mahasiswa==");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int banyakMahasiswa = scanner.nextInt();
        System.out.println("\n");

        double nilaiTotal = 0;
        double nilaiTerbesar = Double.MIN_VALUE; // Inisialisasi dengan nilai terkecil mungkin
        double nilaiTerkecil = Double.MAX_VALUE; // Inisialisasi dengan nilai terbesar mungkin

        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            nilaiTotal += nilai;

            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }

            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }

        double rataRataNilai = nilaiTotal / banyakMahasiswa;
        System.out.println("\nMaka, rata-rata nilainya adalah " + rataRataNilai);
        System.out.println("Nilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);
 }
}
