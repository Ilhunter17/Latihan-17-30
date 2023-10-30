/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166022_latihan25;

import java.util.Scanner;

/**
 *
 * @author d a n u
 */
public class Si_RegPagi_22166022_Latihan25 {

    /**
 *
 *Nama      : Ilhan Ramadhanu
 *Nim       : 22166022
 *Prodi     : Sistem Informasi
 *Matkul    : PBO1
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Ejaan Nama");

        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
 }
}
}
    
    

