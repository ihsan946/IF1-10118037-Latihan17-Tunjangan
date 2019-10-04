/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan17tunjangan;

import java.util.Scanner;

/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program Tunjangan
 */
public class IF110118037Latihan17Tunjangan {
  
    double gaji;
    String status;
    
    public void tunjangan(){
        System.out.println("+++++++++++Program Tunjangan++++++++++");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner tampung1 = new Scanner(System.in);
        
        gaji = tampung1.nextDouble();
        
        System.out.print("Status anda ? (Menikah/Belum)\t: ");
        Scanner tampung2 = new Scanner(System.in);
        
        status = tampung2.nextLine();   
    } 
    public void hitung(){
        //variabel lokal
        double tunjangan;
        double total;
        
        tunjangan = status.equals("Menikah")?0.35*gaji:0;
        total = gaji + tunjangan;
        
        System.out.println();
        System.out.println("+++++++++++Hasil Perhitungan++++++++++");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " + total);
        System.out.println("(Developed by : Muhammad Ihsan)");
        
        
    }
            
    public static void main(String[] args) {
       IF110118037Latihan17Tunjangan Tunjangan = new IF110118037Latihan17Tunjangan();
       Tunjangan.tunjangan();
       Tunjangan.hitung();
        
        
        
        
    }

}
    
    

