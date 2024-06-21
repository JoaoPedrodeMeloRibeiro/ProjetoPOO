package org.example;

public class Humano {

    int aumentoForça;
    int aumentoDestreza;
    int aumentoConstituição;
    int aumentoInteligencia;
    int aumentoSabedoria;
    int aumentoCarisma;
    String tamanho;
    float deslocamento;

    public Humano() {
        this.aumentoForça = 1;
        this.aumentoDestreza = 1;
        this.aumentoConstituição = 1;
        this.aumentoInteligencia = 1;
        this.aumentoSabedoria = 1;
        this.aumentoCarisma = 1;
        this.tamanho = "Médio";
        this.deslocamento = 9;
    }

    public int getAumentoForça() {
        return aumentoForça;
    }

    public void setAumentoForça(int aumentoForça) {
        this.aumentoForça = aumentoForça;
    }

    public int getAumentoConstituição() {
        return aumentoConstituição;
    }

    public void setAumentoConstituição(int aumentoConstituição) {
        this.aumentoConstituição = aumentoConstituição;
    }

    public int getAumentoDestreza() {
        return aumentoDestreza;
    }

    public void setAumentoDestreza(int aumentoDestreza) {
        this.aumentoDestreza = aumentoDestreza;
    }

    public int getAumentoInteligencia() {
        return aumentoInteligencia;
    }

    public void setAumentoInteligencia(int aumentoInteligencia) {
        this.aumentoInteligencia = aumentoInteligencia;
    }

    public int getAumentoSabedoria() {
        return aumentoSabedoria;
    }

    public void setAumentoSabedoria(int aumentoSabedoria) {
        this.aumentoSabedoria = aumentoSabedoria;
    }

    public int getAumentoCarisma() {
        return aumentoCarisma;
    }

    public void setAumentoCarisma(int aumentoCarisma) {
        this.aumentoCarisma = aumentoCarisma;
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
