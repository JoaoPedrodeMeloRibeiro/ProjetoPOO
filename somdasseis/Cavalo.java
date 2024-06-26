package org.somdasseis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cavalo {
    private String nome;
    private int potencia;
    private int resistencia;
    private int fidelidade;
    private final String[] efeitos = {"Seu cavalo tem um nome","Seu cavalo ganha +1 em Potência e tem bônus para saltar obstaculos","Com um assovio, seu cavalo vai até você se estiver nas redondezas","Seu cavalo não tem medo de fogo, rios ou perigos"};
    private int vida;

    public Cavalo() {
        this.nome = null;
        this.vida = 0;
        this.fidelidade = 0;
        this.resistencia = 0;
        this.potencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(int fidelidade) {
        this.fidelidade = fidelidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public void melhorarCavalo(int pontos, int op){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite 1 para aumentar a potencia do cavalo");
         System.out.println("Digite 2 para aumentar a resistencia do cavalo");
         System.out.println("Digite 3 para aumentar a fidelidade");

         switch (op){
             case 1:
                 setPotencia(getPotencia()+1);
                 break;
             case 2:
                 setResistencia(getResistencia()+1);
                 setVida(getVida()+ rand.nextInt(6)+7);
                 break;
             case 3:
                 setFidelidade(getFidelidade()+1);

                 if(getFidelidade() == 1)
             {
                  System.out.println("Digite um nome para seu cavalo: ");
                  String nome = sc.next();
                  setNome(nome);

             }
             else if(getFidelidade() == 2)
             {
                  System.out.println(efeitos[2]);
                  setPotencia(getPotencia()+1);

             }
             else if(getFidelidade() == 3)
             {
                  System.out.println(efeitos[3]);

             }
             else if(getFidelidade() == 4)
             {
                  System.out.println(efeitos[4]);
                  setResistencia(getResistencia()+1);
             }
                 break;
         }

    }

    public void dadosCavalo(){

        if(getFidelidade()>0){
            System.out.println("Nome do cavalo: " + getNome());
        }

        System.out.println("Vida: " + getVida());
        System.out.println("Potencia: " + getPotencia());
        System.out.println("Resistencia: " + getResistencia());
        System.out.println("Fidelidade: " + getFidelidade());
        for(int i = 0; i < fidelidade;i++){
            System.out.println(efeitos[i]);
        }

    }

}
