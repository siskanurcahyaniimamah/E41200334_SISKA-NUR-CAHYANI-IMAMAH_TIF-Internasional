/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalno4array;

import java.util.Scanner;

/**
 *
 * @author siska nur cahyani
 */
public class Soalno4array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner belanja = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("          Kharisma Agung Plaza < KAP >");
        System.out.println("            Promo Belanja Berhadiah");
        System.out.println("        Khusus Pembelian 5 Barang Pertama");
        System.out.println("         Dengan harga minimum Rp 10000,00");
        System.out.println("---------------------------------------------");
        
        // Nama Pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = belanja.nextLine();
        System.out.println();
        // Harga Barang
        System.out.print("Masukkan harga barang ke-1  :");
            int harga1 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-2  :");
            int harga2 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-3  :");
            int harga3 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-4  :");
            int harga4 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-5  :");
            int harga5 = belanja.nextInt();
        // Total
        int total = harga1 + harga2 + harga3 + harga4 + harga5;
        
        System.out.print("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println();
        System.out.println("Selamat.....");
        System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("    Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
        
    }
    
}
    
    

