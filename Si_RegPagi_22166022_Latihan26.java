/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166022_latihan26;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *Nama      : Ilhan Ramadhanu
 *Nim       : 22166022
 *Prodi     : Sistem Informasi
 *Matkul    : PBO1
 */
public class Si_RegPagi_22166022_Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Date tanggalWaktuSaatIni = new Date();
        SimpleDateFormat formatTanggalWaktu = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String tanggalWaktuSaatIniString = formatTanggalWaktu.format(tanggalWaktuSaatIni);

        System.out.println("Tanggal dan waktu saat ini: " + tanggalWaktuSaatIniString);
}
}
    
    

