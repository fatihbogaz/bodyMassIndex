package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height;
        double weight;
        double bodyMassIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();
        bodyMassIndex = weight/(height * height);
        System.out.println("Vücut Kitle Endeksiniz : " + bodyMassIndex);
    }
}