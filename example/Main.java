package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Path arquivo = Paths.get("C:/Users/izabe/IdeaProjects/RPGDeD/src/main/java/org/example/arquivoficha.txt");
        Scanner sc = new Scanner(System.in);
        boolean aleatorio;
        String jogador = sc.next();
        String nome = sc.next();
        String raça = sc.next();
        String classe = sc.next();
        int gerar = sc.nextInt();
        if (gerar == 1)
            aleatorio = true;



        Ficha ficha = new Ficha(nome,jogador,raça,classe);
        ficha.defineRaça();
        ficha.defineClasse();

        if(aleatorio = true)
            ficha.gerarAleatoriamente();
        else {
            int f = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int i = sc.nextInt();
            int s = sc.nextInt();
            int car = sc.nextInt();

            ficha.inserirDados(car, c, d, i, s, car);
        }


        System.out.println(ficha.toString());

        try {
            //Java11
            Files.writeString(arquivo, ficha.toString());
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}