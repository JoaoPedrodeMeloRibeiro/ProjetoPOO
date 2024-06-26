package org.somdasseis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();

        System.out.println("Escolha um nome para o seu personagem");
        String nome = sc.next();
        personagem.dados.setNome(nome);

        personagem.dados.opçõesPontos();


        for( int j = 4 ; j > 0; j-- ) {
            int op = sc.nextInt();
            personagem.dados.distribuirPontos(j, op);
        }

        System.out.println("Distribua "+ personagem.dados.getAntecedente() + " pontos entre os antecendentes" );

        personagem.antecedentes.opcoesAntecedentes();

        for(int j = 0; j <= personagem.dados.getAntecedente() ; j++) {
            int op = sc.nextInt();
            personagem.antecedentes.distribuirAntecedentes(personagem.dados.getAntecedente(), op);
        }


        personagem.habilidades.mostrarMusicas();


        for( int i = 1 ; i <= 2; i++ ) {
            int op = sc.nextInt();
            personagem.habilidades.escolherHabilidades(op,i);
        }

        personagem.tormento.opçõesTormento();
        int coluna = sc.nextInt();
        int linha = sc.nextInt();
        personagem.tormento.escolherTormento(coluna,linha);


        personagem.mostrarPersonagem();

    }
}