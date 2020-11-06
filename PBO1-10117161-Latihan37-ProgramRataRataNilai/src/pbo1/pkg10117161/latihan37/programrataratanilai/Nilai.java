/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan37.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 */
class Nilai {
  
   Scanner sc = Scanner baru (System.in);
    mahasiswa int swasta;
    private double ratarata, nilai;

    public void inputNilai () {
        System.out.print ("Masukkan Banyaknya Mahasiswa:");
        mahasiswa = sc.nextInt ();
        untuk (int i = 0; i <mahasiswa; i ++) {
            System.out.print ("Nilai Mahasiswa ke -" + (i + 1) + ":");
            nilai + = sc.nextDouble ();
        }

    }

    public void outputHasil () {
        ratarata = nilai / mahasiswa;
        System.out.println ("Maka, Rata-rata Nilainya adalah" + ratarata);
    }

}