package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String jogador = sc.next();
        String nome = sc.next();
        String raça = sc.next();
        String classe = sc.next();


        Ficha ficha = new Ficha(nome,jogador,raça,classe);
        ficha.defineRaça();
        ficha.defineClasse();



        System.out.println(ficha.toString());

    }
}