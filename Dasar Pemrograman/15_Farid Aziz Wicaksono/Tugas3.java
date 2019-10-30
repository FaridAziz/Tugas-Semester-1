package Tugas;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args){
        double jml, harga, total, diskon = 0, hsd, nm;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nomor member: ");
        nm = sc.nextInt();
        System.out.print("Masukkan jml barang yang dibeli: ");
        jml = sc.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga = sc.nextInt();
        total = jml * harga;
       
        if (nm == 1841720094){
            if (jml < 10){
                diskon = 0;
            }
            else if (jml > 10 && jml <=30){
                diskon = total * 0.15;
            }
            else if (jml > 30){
                diskon = total * 0.3;
            }
        }
        else{
            diskon = 0;
        }
        hsd = total - diskon;
        System.out.println("Total Harga Sebelum Diskon= " + total + "\nDiskon= " + diskon + "\nTotal Harga Setelah Diskon= " + hsd);
    }
}
