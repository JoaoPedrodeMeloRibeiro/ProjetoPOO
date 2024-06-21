package org.example;

public abstract class Raça {
    int aumentoForça;
    int aumentoDestreza;
    int aumentoConstituição;
    int aumentoInteligencia;
    int aumentoSabedoria;
    int aumentoCarisma;
    String tamanho;
    float deslocamento;

    public int getAumentoForça() {
        return aumentoForça;
    }

    public void setAumentoForça(int aumentoForça) {
        this.aumentoForça = aumentoForça;
    }

    public int getAumentoDestreza() {
        return aumentoDestreza;
    }

    public void setAumentoDestreza(int aumentoDestreza) {
        this.aumentoDestreza = aumentoDestreza;
    }

    public int getAumentoConstituição() {
        return aumentoConstituição;
    }

    public void setAumentoConstituição(int aumentoConstituição) {
        this.aumentoConstituição = aumentoConstituição;
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
