/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166022_latihan27;

import java.util.Scanner;

/**
 *
 * @author d a n u
 */
public class Si_RegPagi_22166022_Latihan27 {

/**
 *
 *Nama      : Ilhan Ramadhanu
 *Nim       : 22166022
 *Prodi     : Sistem Informasi
 *Matkul    : PBO1
 */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Program Formatting Kalimat");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        String kalimatHurufBesar = kalimat.toUpperCase();
        String kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
}
}

    
