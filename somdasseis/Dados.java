package org.somdasseis;

import java.util.Random;

public class Dados {
    private String nome;
    private int vida;
    private int acao;
    private int iniciativa;
    private int defesa;
    private int antecedente;
    private int moedas;
    private int nivel;
    Random rand = new Random();

    //Inicializando Dados
    public Dados() {
        this.vida = 6;
        this.iniciativa = 1;
        this.acao = 1;
        this.defesa = -5;
        this.antecedente = 4;
        this.moedas = 150;
        this.nivel = 1;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAcao() {
        return acao;
    }

    public void setAcao(int acao) {
        this.acao = acao;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(int antecedente) {
        this.antecedente = antecedente;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Funções

    public void opçõesPontos(){
        System.out.println("Distribua 4 pontos entre: ");
        System.out.println("Digite 1 para [ 1D6 + 2 de vida ] " );
        System.out.println("Digite 2 para [ +  antecedente ] " );
        System.out.println("Digite 3 para [ + 1 Ação ] " );
        System.out.println("Digite 4 para [ + 1 Iniciativa ] ");
        System.out.println("Restam " + getAntecedente() + " pontos para distribuir" );

    }

    public void distribuirPontos(int j, int op){
        System.out.println("Distribua 4 pontos entre: ");
        System.out.println("Digite 1 para [ 1D6 + 2 de vida ] " );
        System.out.println("Digite 2 para [ +  antecedente ] " );
        System.out.println("Digite 3 para [ + 1 Ação ] " );
        System.out.println("Digite 4 para [ + 1 Iniciativa ] ");
        System.out.println("Restam " + (j - 1) + " pontos para distribuir" );

        switch(op)
        {

            case 1:
                setVida(getVida()+ rand.nextInt(6)+3);
                break;
            case 2:
                setAntecedente(getAntecedente()+1);
                break;
            case 3:
                setAcao(getAcao()+1);
                break;
            case 4:
                setIniciativa(getIniciativa()+1);
                break;

        }

    }

    public void mostrandoDados(){

        System.out.println("Nome da personagem" + getNome());
        System.out.println("Pontos de vida" + getVida());
        System.out.println("Pontos de ação" + getAcao());
        System.out.println("Pontos de iniciativa" + getIniciativa());
        System.out.println("Pontos de defesa" + getDefesa());
        System.out.println("Moedas" + getMoedas());
        System.out.println("Nivel" + getNivel());

    }
}
