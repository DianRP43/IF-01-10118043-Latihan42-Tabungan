
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("judul");        
        System.out.println("saldo awal ");
        int s = scan.nextInt();
        Tabungan t = new Tabungan(s);
        System.out.println("saldo diambil");
        int u = scan.nextInt();
        t.ambilUang(u);
        System.out.println("jumlah saldo "+t.ambilUang(u));
        
    }
    
}
