package org.somdasseis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();

        String nome = sc.next();
        personagem.dados.setNome(nome);
        for( int j = 4 ; j > 0; j-- ) {
            int op = sc.nextInt();
            personagem.dados.distribuirPontos(j, op);
        }

        System.out.println("Distribua "+ personagem.dados.getAntecedente() + " pontos entre os antecentes" );
        System.out.println("[1] Combate: ");
        System.out.println("[2] Labuta: ");
        System.out.println("[3] Negocios: ");
        System.out.println("[4] Exploracao: ");
        System.out.println("[5] Montaria: ");
        System.out.println("[6] Medicina: ");
        System.out.println("[7] Tradicao: ");
        System.out.println("[8] Roubo: " );

        for(int j = 0; j < personagem.dados.getAntecedente() ; j++) {
            int op = sc.nextInt();
            personagem.antecedentes.distribuirAntecedentes(personagem.dados.getAntecedente(), op);
        }

        personagem.habilidades.mostrarMusicas();




    }
}