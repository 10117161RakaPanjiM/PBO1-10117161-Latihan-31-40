/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan39.nilaiterbesardanterkecil;
import  java.util.Scanner ;
/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 */
public class PBO110117161Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 =  Mahasiswa baru  ();
        Scanner scn =  Scanner baru  ( System . In );

        int bykMah;
        Nama string ;
        Sistem . keluar . println ( " ======== Nilai Program dan Nilai Terkecil Mahasiswa ======== " );
        Sistem . keluar . cetak ( " Masukkan Nama Petugas: " );
        nama = scn . nextLine ();
        Sistem . keluar . print ( " Masukkan Banyaknya Mahasiswa: " );
        bykMah = scn . nextInt ();
        mhs1 . inputNilai (mhs1 . nilai, bykMah);
        mhs1 . tampilBesarKecil (mhs1 . nilai, bykMah);

        Sistem . keluar . println ( " \ n "  +  " Petugas: "  + nama);

    }

}
