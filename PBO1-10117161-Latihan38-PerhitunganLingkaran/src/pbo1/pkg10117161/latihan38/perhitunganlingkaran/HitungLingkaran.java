/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 */
class HitungLingkaran {
    Input pemindai = Pemindai baru (System.in);
        String Validasi;
        boolean Valid = true;
        
        public void Hitung () {
            melakukan{
            System.out.println ("===== Perhitungan Lingkaran =====");
            System.out.print ("Masukkan Diameter:");
            Validasi = input.next ();
            if (Validasi.matches ("[0-9] *")) {
                int Diameter = input.nextInt ();
                ganda phi = 3,14;
                int Jari2 = Diameter / 2;
                double Luas = phi * (Jari2 * Jari2);
                double Keliling = 2 * phi * Jari2;
                System.out.println ("===== Hasil Perhitungan Lingkaran =====");
                System.out.println ("Diameter Lingkaran =" + Diameter);
                System.out.println ("Jari-Jari Lingkaran =" + Jari2);
                System.out.println ("Luas Lingkaran =" + Luas);
                System.out.println ("Keliling Lingkaran =" + Keliling);
                Valid = false;
                istirahat;
            }lain{
                System.out.println ("Nilai Diameter Tidak Sesuai");
                System.out.println ("");
        }
            
        } sementara (Valid = true);
        }
        
}