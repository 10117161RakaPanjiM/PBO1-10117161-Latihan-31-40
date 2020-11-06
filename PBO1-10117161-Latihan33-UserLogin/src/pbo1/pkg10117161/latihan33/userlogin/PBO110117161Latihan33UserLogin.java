/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 * Deskripsi Program : Program ini berisi program untuk login
 */
public class PBO110117161Latihan33UserLogin {
  private String usName;
    private String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user1 = new User("RizkiAdam", "terbaikselalu");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        String usName = scanner.next();
        System.out.print("Masukkan Password = ");
        String passWord = scanner.next();
        user1.pengecekkanLogin(usName, passWord);
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}
