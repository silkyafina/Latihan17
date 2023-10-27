 import java.util.Scanner;/*

package si_regpagi.pkg22166017.latihan17.programtunjangan;

/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan tunjangan
 */
public class SI_RegPagi22166017Latihan17ProgramTunjangan {
     public static void main(String[]args){
         // fungsi scanner untuk memasukkan inputan
             Scanner input = new Scanner(System.in);
  
  System.out.println("========== Program Tunjangan ==========");
  
  // deklarasi variabel gaji pokok dan menginputkan gaji pokok 
  System.out.print("Berapa Gaji Pokok Anda Perbulan? : ");
  double gaji_pokok = input.nextDouble();
 
  
  // deklarasi variabel status dan menginputkan status
  System.out.print("Status Anda? (Menikah/Belum) : ");
  String status = input.next();
  
  // deklarasi variabel tunjangan dan mengitung tunjangan
  double tunjangan=0;
  if (status.equalsIgnoreCase("Menikah")){
      tunjangan = 0.35*gaji_pokok; // tunjangan sebesar 35% dari gaji pokok
  
  System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
  
  //output gaji pokok
  System.out.println("Gaji Pokok : "+gaji_pokok);
  
  // output tunjangan 
  System.out.println("Tunjangan : "+tunjangan);
  
  // deklarasi dan output total gaji
  double total_gaji= gaji_pokok+tunjangan;
  System.out.println("Total Gaji : "+total_gaji);
  
      System.out.println("(Developed by: Silky Afina Saly)");
    }
    
}
}
    
