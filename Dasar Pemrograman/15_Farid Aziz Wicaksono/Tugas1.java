package Tugas;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args){
    int angka1, angka2, angka3;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan nilai a :");
        angka1 = sc.nextInt();
        System.out.print("Masukkan nilai b :");
        angka2 = sc.nextInt();
        System.out.print("Masukkan nilai c :");
        angka3 = sc.nextInt();
       
            if (angka1>angka2 && angka3>angka1){
                System.out.println("Nilai terbesar adalah " + angka3);
                System.out.println("Nilai terkecil adalah " + angka2);
            }
            else if (angka2>angka3 && angka1>angka2){
                System.out.println("Nilai terbesar adalah " + angka1);
                System.out.println("Nilai terkecil adalah " + angka3);
            }
            else if (angka3>angka1 && angka2>angka3){  
                System.out.println("Nilai terbesar adalah " + angka2);
                System.out.println("Nilai terkecil adalah " + angka1);
            }
            else if (angka3>angka2 && angka1>angka3){
                System.out.println("Nilai terbesar adalah " + angka1);
                System.out.println("Nilai terkecil adalah " + angka2);
            }
            else if (angka2>angka1 && angka3>angka2){
                System.out.println("Nilai terbesar adalah " + angka3);
                System.out.println("Nilai terkecil adalah " + angka1);
            }
            else if (angka1>angka3 && angka2>angka1){
                System.out.println("Nilai terbesar adalah " + angka2);
                System.out.println("Nilai terkecil adalah " + angka3);
            }
    }    
}

