package org.example;

public class Draconato extends Raça{

    int aumentoForça;
    int aumentoDestreza;
    int aumentoConstituição;
    int aumentoInteligencia;
    int aumentoSabedoria;
    int aumentoCarisma;
    String tamanho = "Médio";
    float deslocamento = 9;

    public Draconato() {
        this.aumentoForça = 1;
        this.aumentoDestreza = 0;
        this.aumentoConstituição = 0;
        this.aumentoInteligencia = 0;
        this.aumentoSabedoria = 0;
        this.aumentoCarisma = 2;
        this.tamanho = "Médio";
        this.deslocamento = 9;
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
    public int getAumentoCarisma() {
        return aumentoCarisma;
    }

    @Override
    public void setAumentoCarisma(int aumentoCarisma) {
        this.aumentoCarisma = aumentoCarisma;
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
    public int getAumentoConstituição() {
        return aumentoConstituição;
    }

    @Override
    public void setAumentoConstituição(int aumentoConstituição) {
        this.aumentoConstituição = aumentoConstituição;
    }

    @Override
    public int getAumentoDestreza() {
        return aumentoDestreza;
    }

    @Override
    public void setAumentoDestreza(int aumentoDestreza) {
        this.aumentoDestreza = aumentoDestreza;
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
