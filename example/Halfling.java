package org.example;

public class Halfling extends Raça {

    int aumentoForça;
    int aumentoDestreza;
    int aumentoConstituição;
    int aumentoInteligencia;
    int aumentoSabedoria;
    int aumentoCarisma;
    String tamanho;
    float deslocamento;

    public Halfling() {
        this.aumentoForça = 0;
        this.aumentoDestreza = 0;
        this.aumentoConstituição = 0;
        this.aumentoInteligencia = 0;
        this.aumentoSabedoria = 0;
        this.aumentoCarisma = 0;
        this.tamanho = "Pequeno";
        this.deslocamento = 7.5f;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(float deslocamento) {
        this.deslocamento = deslocamento;
    }

}
