/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan38.oolingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini tentang menghitung diameter lingkaran dengan
 * OO.
 */
public class PBO210117048Latihan38OOLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String d;
        double diameter; //operand
        Scanner circle = new Scanner(System.in);
        Lingkaran bulat = new Lingkaran();

        System.out.println("===Perhitungan Lingkaran===");

        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = circle.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");

        } while (!d.matches("[0-9]*"));

        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d);

        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                bulat.jari2Lingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n", bulat.luasLingkaran(
                bulat.jari2Lingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n", bulat.
                kelilingLingkaran(bulat.jari2Lingkaran(diameter)));

    }

}
