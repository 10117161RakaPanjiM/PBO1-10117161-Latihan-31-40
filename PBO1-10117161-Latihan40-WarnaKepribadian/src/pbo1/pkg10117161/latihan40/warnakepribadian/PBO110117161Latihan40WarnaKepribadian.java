/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan40.warnakepribadian;
import java.util.Scanner;
import static pbo1.pkg10118033.latihan40.warna.ANSI_BLUE;
import static pbo1.pkg10118033.latihan40.warna.ANSI_BLUE_BACKGROUND;
import static pbo1.pkg10118033.latihan40.warna.ANSI_CYAN;
import static pbo1.pkg10118033.latihan40.warna.ANSI_GREEN;
import static pbo1.pkg10118033.latihan40.warna.ANSI_GREEN_BACKGROUND;
import static pbo1.pkg10118033.latihan40.warna.ANSI_PURPLE;
import static pbo1.pkg10118033.latihan40.warna.ANSI_PURPLE_BACKGROUND;
import static pbo1.pkg10118033.latihan40.warna.ANSI_RED;
import static pbo1.pkg10118033.latihan40.warna.ANSI_RED_BACKGROUND;
import static pbo1.pkg10118033.latihan40.warna.ANSI_RESET;
import static pbo1.pkg10118033.latihan40.warna.ANSI_WHITE;
import static pbo1.pkg10118033.latihan40.warna.ANSI_YELLOW;
import static pbo1.pkg10118033.latihan40.warna.ANSI_YELLOW_BACKGROUND;
/**
 *
 * @author GPS-2
 */
public class PBO110117161Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        warna warna1 = new warna();
        nama nama1 = new nama();
        Scanner scn = new Scanner(System.in);

        System.out.print(ANSI_RED + "YUK " + ANSI_RESET);
        System.out.print(ANSI_GREEN + "CEK " + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "KEPRIBADIANMU " + ANSI_RESET);
        System.out.print(ANSI_CYAN + "DARI " + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "WARNA " + ANSI_RESET);
        System.out.print(ANSI_BLUE + "FAVORITMU " + ANSI_RESET + "\n");

        System.out.print("\n" + ANSI_RED_BACKGROUND + ANSI_WHITE + "\t MERAH \t\t\n" + ANSI_RESET);
        System.out.print(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "\t HIJAU \t\t\n" + ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_WHITE + "\t KUNING \t\n" + ANSI_RESET);
        System.out.print(ANSI_BLUE_BACKGROUND + ANSI_WHITE + "\t BIRU \t\t\n" + ANSI_RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND + ANSI_WHITE + "\t UNGU \t\t\n\n" + ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warna1.warnamu = scn.next();
        System.out.print("NAMA KAMU : ");
        nama1.namaMu = scn.next();

        nama1.tampilNama(nama1.namaMu);
        warna1.hasilTest(warna1.warnamu);
    }
}