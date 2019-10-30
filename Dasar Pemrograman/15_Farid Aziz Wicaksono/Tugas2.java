package Tugas;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args){
        int bidang, segitiga, persegipanjang, jajargenjang, lingkaran;
        double PHI=3.14;
        double jj, alas, tinggi, panjang, lebar, luli, luse, luperpa, luja;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. segitiga");
        System.out.println("2. persegi panjang");
        System.out.println("3. jajar genjang");
        System.out.println("4. bidang lingkaran");
        System.out.print("bidang [ 1 - 4 ]: ");
        bidang = sc.nextInt();
        
         if (bidang == 1){
            System.out.println("bidang SEGITIGA");
            System.out.print("alas: ");
            alas = sc.nextDouble();
            System.out.print("tinggi: ");
            tinggi = sc.nextDouble();
            luse = alas * tinggi / 2;
            System.out.println("Luas segitiga= " + luse);
        }
         else if (bidang == 2){
            System.out.println("bidang PERSEGI PANJANG");
            System.out.print("panjang: ");
            panjang = sc.nextDouble();
            System.out.print("lebar: ");
            lebar = sc.nextDouble();
            luperpa = panjang * lebar;
            System.out.println("Luas persegi panjang= " + luperpa);
        }
         else if (bidang == 3){
            System.out.println("bidang JAJAR GENJANG");
            System.out.print("alas: ");
            alas = sc.nextDouble();
            System.out.print("tinggi: ");
            tinggi = sc.nextDouble();
            luja = alas * tinggi;
            System.out.println("Luas jajar genjang= " + luja);
        }
         else if (bidang == 4){
            System.out.println("bidang LINGKARAN");
            System.out.print("jarijari: ");
            jj = sc.nextDouble();
            luli = PHI * jj * jj;
            System.out.println("Luas lingkaran= " + luli);
        }
        else{
            System.out.println("Input salah !");
        }
    }
}
