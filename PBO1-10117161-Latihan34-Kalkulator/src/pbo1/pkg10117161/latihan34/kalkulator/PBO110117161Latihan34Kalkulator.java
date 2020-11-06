/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 * Deskripsi Program : Program ini berisi program kalkulator
 */
public class PBO110117161Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulator kalkulator1 = new Kalkulator();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan angka ke-1 : ");
        kalkulator1.value1 = sc.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        kalkulator1.value2 = sc.nextDouble();
        System.out.println();
        System.out.println("Hasil pertambahan : "+kalkulator1.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkulator1.kurangBilangan());
        System.out.println("Hasil Perkalian   : "+kalkulator1.kaliBilangan());
        System.out.println("Hasil Pembagian   : "+kalkulator1.bagiBilangan());
        System.out.println("Hasil Sisa        : "+kalkulator1.sisaBilangan());
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}