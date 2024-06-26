package org.example;

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

public class Ficha {
    String nome;
    String jogador;
    String raça;
    String classe;
    String tamanho;
    float deslocamento;
    int vida;
    int força;
    int constituição;
    int destreza;
    int inteligencia;
    int sabedoria;
    int carisma;
    int nivel;
    int xp;
    int iniciativa;
    Random dado = new Random();

    public Ficha(String nome, String jogador, String raça, String classe) {
        this.nome = nome;
        this.jogador = jogador;
        this.raça = raça;
        this.classe = classe;
        this.força = 0;
        this.constituição = 0;
        this.destreza = 0;
        this.inteligencia = 0;
        this.sabedoria = 0;
        this.carisma = 0;
        this.nivel = 0;
        this.xp = 0;
    }


    void defineRaça(){
        switch (getRaça()){

            case "Humano":
                Humano humano = new Humano();
                setForça(getForça()+humano.getAumentoForça());
                setConstituição(getConstituição()+humano.getAumentoConstituição());
                setDestreza(getDestreza()+humano.getAumentoDestreza());
                setInteligencia(getInteligencia()+humano.getAumentoInteligencia());
                setSabedoria(getSabedoria()+humano.getAumentoSabedoria());
                setCarisma(getCarisma()+humano.getAumentoCarisma());
                setTamanho(humano.getTamanho());
                setDeslocamento(humano.getDeslocamento());
                break;
            case "Elfo":
                Elfo elfo = new Elfo();
                setForça(getForça() + elfo.getAumentoForça());
                setConstituição(getConstituição() + elfo.getAumentoConstituição());
                setDestreza(getDestreza() + elfo.getAumentoDestreza());
                setInteligencia(getInteligencia() + elfo.getAumentoInteligencia());
                setSabedoria(getSabedoria() + elfo.getAumentoSabedoria());
                setCarisma(getCarisma() + elfo.getAumentoCarisma());
                setTamanho(elfo.getTamanho());
                setDeslocamento(elfo.getDeslocamento());
                break;
            case "MeioElfo":
                MeioElfo meioElfo = new MeioElfo();
                setForça(getForça()+meioElfo.getAumentoForça());
                setConstituição(getConstituição()+meioElfo.getAumentoConstituição());
                setDestreza(getDestreza()+meioElfo.getAumentoDestreza());
                setInteligencia(getInteligencia()+meioElfo.getAumentoInteligencia());
                setSabedoria(getSabedoria()+meioElfo.getAumentoSabedoria());
                setCarisma(getCarisma()+meioElfo.getAumentoCarisma());
                setTamanho(meioElfo.getTamanho());
                setDeslocamento(meioElfo.getDeslocamento());
                break;
            case "Halfling":
                Halfling halfling = new Halfling();
                setForça(getForça()+halfling.getAumentoForça());
                setConstituição(getConstituição()+halfling.getAumentoConstituição());
                setDestreza(getDestreza()+halfling.getAumentoDestreza());
                setInteligencia(getInteligencia()+halfling.getAumentoInteligencia());
                setSabedoria(getSabedoria()+halfling.getAumentoSabedoria());
                setCarisma(getCarisma()+halfling.getAumentoCarisma());
                setTamanho(halfling.getTamanho());
                setDeslocamento(halfling.getDeslocamento());
                break;
            case "Draconato":
                Draconato draconato = new Draconato();
                setForça(getForça()+draconato.getAumentoForça());
                setConstituição(getConstituição()+draconato.getAumentoConstituição());
                setDestreza(getDestreza()+draconato.getAumentoDestreza());
                setInteligencia(getInteligencia()+draconato.getAumentoInteligencia());
                setSabedoria(getSabedoria()+draconato.getAumentoSabedoria());
                setCarisma(getCarisma()+draconato.getAumentoCarisma());
                setTamanho(draconato.getTamanho());
                setDeslocamento(draconato.getDeslocamento());
                break;
            case "Anão":
                Anão anão = new Anão();
                setForça(getForça()+anão.getAumentoForça());
                setConstituição(getConstituição()+anão.getAumentoConstituição());
                setDestreza(getDestreza()+anão.getAumentoDestreza());
                setInteligencia(getInteligencia()+anão.getAumentoInteligencia());
                setSabedoria(getSabedoria()+anão.getAumentoSabedoria());
                setCarisma(getCarisma()+anão.getAumentoCarisma());
                setTamanho(anão.getTamanho());
                setDeslocamento(anão.getDeslocamento());
                break;
            case "Tiefling":
                Tiefling tiefling = new Tiefling();
                setForça(getForça()+tiefling.getAumentoForça());
                setConstituição(getConstituição()+tiefling.getAumentoConstituição());
                setDestreza(getDestreza()+tiefling.getAumentoDestreza());
                setInteligencia(getInteligencia()+tiefling.getAumentoInteligencia());
                setSabedoria(getSabedoria()+tiefling.getAumentoSabedoria());
                setCarisma(getCarisma()+tiefling.getAumentoCarisma());
                setTamanho(tiefling.getTamanho());
                setDeslocamento(tiefling.getDeslocamento());
                break;
            case "MeioOrc":
                MeioOrc meioOrc = new MeioOrc();
                setForça(getForça()+meioOrc.getAumentoForça());
                setConstituição(getConstituição()+meioOrc.getAumentoConstituição());
                setDestreza(getDestreza()+meioOrc.getAumentoDestreza());
                setInteligencia(getInteligencia()+meioOrc.getAumentoInteligencia());
                setSabedoria(getSabedoria()+meioOrc.getAumentoSabedoria());
                setCarisma(getCarisma()+meioOrc.getAumentoCarisma());
                setTamanho(meioOrc.getTamanho());
                setDeslocamento(meioOrc.getDeslocamento());
                break;
            case "Gnomo":
                Gnomo gnomo = new Gnomo();
                setForça(getForça()+gnomo.getAumentoForça());
                setConstituição(getConstituição()+gnomo.getAumentoConstituição());
                setDestreza(getDestreza()+gnomo.getAumentoDestreza());
                setInteligencia(getInteligencia()+gnomo.getAumentoInteligencia());
                setSabedoria(getSabedoria()+gnomo.getAumentoSabedoria());
                setCarisma(getCarisma()+gnomo.getAumentoCarisma());
                setTamanho(gnomo.getTamanho());
                setDeslocamento(gnomo.getDeslocamento());
                break;
        }

    }

    void defineClasse(){
        switch (getClasse()){

            case "Barbaro":
                Barbaro barbaro = new Barbaro();
                setVida(barbaro.getVida()+getConstituição());

                break;
            case "Bardo":
                Bardo bardo = new Bardo();
                setVida(bardo.getVida()+getConstituição());

                break;
            case "Bruxo":
                Bruxo bruxo = new Bruxo();
                setVida(bruxo.getVida()+getConstituição());

                break;
            case "Clérigo":
                Clérigo clérigo = new Clérigo();
                setVida(clérigo.getVida()+getConstituição());

                break;
            case "Druida":
                Druida druida = new Druida();
                setVida(druida.getVida()+getConstituição());

                break;
            case "Feiticeiro":
                Feiticeiro feiticeiro = new Feiticeiro();
                setVida(feiticeiro.getVida()+getConstituição());

                break;
            case "Guerreiro":
                Guerreiro guerreiro = new Guerreiro();
                setVida(guerreiro.getVida()+getConstituição());

                break;
            case "Ladino":
                Ladino ladino = new Ladino();
                setVida(ladino.getVida()+getConstituição());

                break;
            case "Mago":
                Mago mago = new Mago();
                setVida(mago.getVida()+getConstituição());

                break;

            case "Monge":
                Monge monge = new Monge();
                setVida(monge.getVida()+getConstituição());

                break;
            case "Paladino":
                Paladino paladino = new Paladino();
                setVida(paladino.getVida()+getConstituição());

                break;
            case "Patrulheiro":
                Patrulheiro patrulheiro = new Patrulheiro();
                setVida(patrulheiro.getVida()+getConstituição());

                break;
        }

    }

    public void gerarAleatoriamente(){

        setForça(getForça()+dado.nextInt(20));
        setConstituição(getConstituição()+dado.nextInt(20));
        setDestreza(getDestreza()+dado.nextInt(20));
        setInteligencia(getInteligencia()+dado.nextInt(20));
        setSabedoria(getSabedoria()+dado.nextInt(20));
        setCarisma(getCarisma()+dado.nextInt(20));
        setNivel(1);
        setIniciativa((getDestreza()-10)/2);

    }

    public void inserirDados(int f,int c, int d, int i, int s, int car){

        setForça(getForça()+f);
        setConstituição(getConstituição()+c);
        setDestreza(getDestreza()+d);
        setInteligencia(getInteligencia()+i);
        setSabedoria(getSabedoria()+s);
        setCarisma(getCarisma()+car);
        setNivel(1);
        setIniciativa((getDestreza()-10)/2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituição() {
        return constituição;
    }

    public void setConstituição(int constituição) {
        this.constituição = constituição;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public float getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(float deslocamento) {
        this.deslocamento = deslocamento;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "Nome='" + nome + '\'' +
                ", Jogador='" + jogador + '\'' +
                ", Raça='" + raça + '\'' +
                ", Classe='" + classe + '\'' +
                ", Tamanho='" + tamanho + '\'' +
                ", Deslocamento=" + deslocamento +
                ", Força=" + força +
                ", Modificador" + (força - 10)/2 +
                ", Constituição=" + constituição +
                ", Modificador" + (constituição - 10)/2 +
                ", Destreza=" + destreza +
                ", Modificador" + (destreza - 10)/2 +
                ", Inteligencia=" + inteligencia +
                ", Modificador" + (inteligencia - 10)/2 +
                ", Sabedoria=" + sabedoria +
                ", Modificador" + (sabedoria - 10)/2 +
                ", Carisma=" + carisma +
                ", Modificador" + (carisma - 10)/2 +
                ", Nivel=" + nivel +
                ", Xp=" + xp +
                '}';
    }
}
