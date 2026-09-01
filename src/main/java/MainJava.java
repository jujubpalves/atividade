package org.example;
import java.util.Scanner;

// Exercício 1:
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();


        if (idade >=18 ){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
