package Percobaan;

import java.util.Scanner;
public class TrafficLight {
    
    public static void main(String[] args) {
    String Lampu;
    Scanner sc  = new Scanner(System.in);
    
    System.out.println("input warna lampu : ");
    Lampu = sc.nextLine();
    
    if ("hijau".equals(Lampu))
        System.out.println("Silahkan Jalan !");
    else if ("kuning".equals(Lampu))
        System.out.println("Hati-Hati");
    else if ("merah".equals(Lampu))
        System.out.println("Berhenti !");
    else
        System.out.println("Input salah");
    }    
}