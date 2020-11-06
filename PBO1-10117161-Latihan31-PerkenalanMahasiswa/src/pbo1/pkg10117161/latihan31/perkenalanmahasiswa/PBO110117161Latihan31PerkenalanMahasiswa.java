/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan31.perkenalanmahasiswa;

/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 * Deskripsi Program : Program ini berisi program untuk menampilkan perkenalan
 *                     Diri
 */
public class PBO110117161Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        mahasiswa1.nim = "10110269";
        mahasiswa1.perkenalkanDiri();
        System.out.println();
        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.nim = "10110270";
        mahasiswa2.perkenalkanDiri();
        System.out.println();
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.nim = "10110271";
        mahasiswa3.perkenalkanDiri();
        System.out.println();
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        mahasiswa4.nim = "10110269";
        mahasiswa4.perkenalkanDiri();
        System.out.println();
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}
