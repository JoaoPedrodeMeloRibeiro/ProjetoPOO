package org.example;

public class Gnomo extends Raça {

    int aumentoForça;
    int aumentoDestreza;
    int aumentoConstituição;
    int aumentoInteligencia;
    int aumentoSabedoria;
    int aumentoCarisma;
    String tamanho;
    float deslocamento;

    public Gnomo() {
        this.aumentoForça = 0;
        this.aumentoDestreza = 0;
        this.aumentoConstituição = 1;
        this.aumentoInteligencia = 0;
        this.aumentoSabedoria = 0;
        this.aumentoCarisma = 0;
        this.tamanho = "Pequeno";
        this.deslocamento = 7.5f;
    }

    @Override
    public int getAumentoDestreza() {
        return aumentoDestreza;
    }

    @Override
    public void setAumentoDestreza(int aumentoDestreza) {
        this.aumentoDestreza = aumentoDestreza;
    }

    @Override
    public int getAumentoForça() {
        return aumentoForça;
    }

    @Override
    public void setAumentoForça(int aumentoForça) {
        this.aumentoForça = aumentoForça;
    }

    @Override
    public int getAumentoConstituição() {
        return aumentoConstituição;
    }

    @Override
    public void setAumentoConstituição(int aumentoConstituição) {
        this.aumentoConstituição = aumentoConstituição;
    }

    @Override
    public int getAumentoInteligencia() {
        return aumentoInteligencia;
    }

    @Override
    public void setAumentoInteligencia(int aumentoInteligencia) {
        this.aumentoInteligencia = aumentoInteligencia;
    }

    @Override
    public int getAumentoSabedoria() {
        return aumentoSabedoria;
    }

    @Override
    public void setAumentoSabedoria(int aumentoSabedoria) {
        this.aumentoSabedoria = aumentoSabedoria;
    }

    @Override
    public int getAumentoCarisma() {
        return aumentoCarisma;
    }

    @Override
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
