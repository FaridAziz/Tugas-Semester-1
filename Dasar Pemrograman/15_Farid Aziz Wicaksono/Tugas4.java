package Tugas;

import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
     int s1,s2,s3;
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Ketentuan:");
     System.out.println("a. Total Ketiga Sudut harus sama dengan 180");
     System.out.println("b. Sudut yang dimasukkan tidak boleh bernilai negatif");
     System.out.println("c. setiap sudut yang dimasukkan nilainya harus lebih besar dari 0drajat dan kurang dari 180drajat");
     
     System.out.print("masukkan sudut 1:");
     s1 = sc.nextInt();
     System.out.print("masukkan sudut 2:");
     s2 = sc.nextInt();
     System.out.print("masukkan sudut 3:");
     s3 = sc.nextInt();
     
     if (s1 + s2 + s3 == 180){    
         if (s1 == s2)
             System.out.println("segitiga siku-siku");
         else if (s1 == s3)
             System.out.println("segitiga siku-siku");
         else if (s2 == s3)
             System.out.println("segitiga siku-siku");
         else 
             System.out.println("bukan segitiga siku-siku"); 
        }
     else  System.out.println("input tidak valid");
    }
}
