package fr.abp.cours;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double F = 0.0;
        double E = 0.0;
        double T = 6.55957;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Nombre en francs : ");
        F = lectureClavier.nextDouble();
        E = F / T;
        System.out.println("Conversion francs euros : " + T);
        System.out.println("Nombre en euros : " + String.format("%.2f", E));
    }
}
