/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_menghitungsegitiga;
import java.util.Scanner;
/**
 *
 * @author Kadek Arlandi Mahesa Gautama Putra
 * NIM : 2201010241
 * Tanggal : 05-April-2024
 */
public class Tugas1_MenghitungSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        
        Number luas;
        int a = 0;
        int t = 0;
        String nilai = "";
        
        System.out.println("MENGHITUNG LUAS SEGITIGA");
        System.out.println("<======================>");
        
        System.out.println("Input Nilai Alas Segitiga   : ");
        nilai = dtain.nextLine();
        a = Integer.parseInt(nilai);
        System.out.println("Input Nilai Tinggi Segitiga : ");
        nilai = dtain.nextLine();
        t = Integer.parseInt(nilai);
        luas = a*t;
        
        System.out.println("Luas Segitiga : "+luas);
    }
    
}
