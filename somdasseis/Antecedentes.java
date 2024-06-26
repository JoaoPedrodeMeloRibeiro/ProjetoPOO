package org.somdasseis;

public class Antecedentes {
    private int combate;
    private int labuta;
    private int negocios;
    private int exploracao;
    private int montaria;
    private int medicina;
    private int tradicao;
    private int roubo;

    //Inicializando Antecedentes
    public Antecedentes() {
        this.combate = 0;
        this.roubo = 0;
        this.tradicao = 0;
        this.medicina = 0;
        this.montaria = 0;
        this.exploracao = 0;
        this.negocios = 0;
        this.labuta = 0;
    }

    //Getters e Setters


    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
    }

    public int getNegocios() {
        return negocios;
    }

    public void setNegocios(int negocios) {
        this.negocios = negocios;
    }

    public int getLabuta() {
        return labuta;
    }

    public void setLabuta(int labuta) {
        this.labuta = labuta;
    }

    public int getExploracao() {
        return exploracao;
    }

    public void setExploracao(int exploracao) {
        this.exploracao = exploracao;
    }

    public int getMontaria() {
        return montaria;
    }

    public void setMontaria(int montaria) {
        this.montaria = montaria;
    }

    public int getMedicina() {
        return medicina;
    }

    public void setMedicina(int medicina) {
        this.medicina = medicina;
    }

    public int getTradicao() {
        return tradicao;
    }

    public void setTradicao(int tradicao) {
        this.tradicao = tradicao;
    }

    public int getRoubo() {
        return roubo;
    }

    public void setRoubo(int roubo) {
        this.roubo = roubo;
    }

    public void opcoesAntecedentes(){
        System.out.println("Digite");
        System.out.println("[1] para Combate");
        System.out.println("[2] para Labuta");
        System.out.println("[3] para Negocios");
        System.out.println("[4] para Exploracao");
        System.out.println("[5] para Montaria");
        System.out.println("[6] para Medicina");
        System.out.println("[7] para Tradicao");
        System.out.println("[8] para Roubo" );
    }


    //Funções
    public void distribuirAntecedentes(int antecedentes, int op){


        for(int j = 0; j < antecedentes; j++) {


            switch (op) {
                case 1:
                    setCombate(getCombate() + 1);
                    break;
                case 2:
                    setLabuta(getLabuta() + 1);
                    break;
                case 3:
                    setNegocios(getNegocios() + 1);
                    break;
                case 4:
                    setExploracao(getExploracao() + 1);
                    break;
                case 5:
                    setMontaria(getMontaria() + 1);
                    break;
                case 6:
                    setMedicina(getMedicina() + 1);
                    break;
                case 7:
                    setTradicao(getTradicao()+1);
                    break;
                case 8:
                    setRoubo(getRoubo()+1);
                    break;
                default:
                    break;
            }

        }

    }

    public void mostrandoAntecedentes(){

        System.out.println("Antecedentes: ");
        System.out.println("Combate: " + getCombate());
        System.out.println("Exploração: " + getExploracao());
        System.out.println("Labuta: " + getLabuta());
        System.out.println("Medicina: " + getMedicina());
        System.out.println("Montaria: " + getMontaria());
        System.out.println("Roubo: " + getRoubo());
        System.out.println("Tradição: " + getTradicao());

    }

}
