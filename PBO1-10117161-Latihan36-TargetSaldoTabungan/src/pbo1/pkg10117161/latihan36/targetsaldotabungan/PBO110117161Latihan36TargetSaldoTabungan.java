/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan36.targetsaldotabungan;

/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 * Deskripsi Program : Program ini berisi program untuk menampilkan Saldo Target
 *                     Tabungan
 */
public class PBO110117161Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(3500000, 6000000, 0.08);
        tabungan.hitung();
    }
}