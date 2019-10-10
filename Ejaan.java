/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaan;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Menapilkan Ejaan Huruf Dari Sebuah Kalimat
 * @author LENOVO
 */
public class Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nama;
        System.out.print("Masukkan Nama Yang Akan dieja : ");
        nama =input.next();
        
        char ejaan [] =nama.toCharArray();
        for(int i =0; i < ejaan.length; i++){
            System.out.println("Huruf Ke-"+(i+1)+" : "+ejaan[i]);
        }
        System.out.println("(Develoved By : Moch Rizki Maulana N");
    }
    
}
