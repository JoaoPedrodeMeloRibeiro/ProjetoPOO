package org.somdasseis;

public class Tormento {
    private final String[] vingança = {"pelo amor da minha vida", "pelos meus filhos", "por minha terra roubada", "pela morte de um parceiro", "pela minha tribo", "pelo fim da minha gangue"};
    private final String[] fugindo = {"da lei", "da gangue inimida", "de um mercenario", "de uma familia poderosa", "de um culto religioso", "de um casamento"};
    private final String[] vicio = {"em alcool", "em drogas", "em brigas", "em apostas", "em adrenalina", "em algo bizarro"};
    private final String[] segredo = {"sou um infiltrado da lei", "sou de uma familia rica", "tenho algo contagioso", "matei alguem importante", "uma grande divida", "tenho um tesouro comigo"};
    private final String[] doença = {"na pele do rosto", "na mente", "no intestino", "nas pernas", "nos olhos", "nas maos"};
    private final String[] dever = {"com a minha familia", "com a lei", "com a gangue", "com deus", "com meu cavalo", "com minha divida"};
    private String tormento;

    public void setTormento(String tormento) {
        this.tormento = tormento;
    }

    public void opçõesTormento(){
        System.out.println("Coluna [1] Vingança:");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+vingança[i]);
        }
        System.out.println("Coluna [2] Fugindo:");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+fugindo[i]);
        }
        System.out.println("Coluna [3] Vicio:");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+vicio[i]);
        }
        System.out.println("Coluna [4] Segredo");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+segredo[i]);
        }
        System.out.println("Coluna [5] Doença:");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+doença[i]);
        }
        System.out.println("Coluna [6] Dever:");
        for(int i = 0; i < 6; i++){
            System.out.println("Linha["+i+"]: "+dever[i]);
        }

    }

    public void escolherTormento(int coluna, int linha){
        switch(coluna)
        {
            case 1:
                setTormento("Vingança"+vingança[linha]);
                break;
            case 2:
                setTormento("Fugindo"+fugindo[linha]);
                break;
            case 3:
                setTormento("Vicio"+vicio[linha]);
                break;
            case 4:
                setTormento("Segredo"+segredo[linha]);
                break;
            case 5:
                setTormento("Doença"+doença[linha]);
                break;
            case 6:
                setTormento("Dever"+dever[linha]);
                break;


        }

    }

    public void mostrarTormento(){
        System.out.println("Tormento: " + tormento);
    }


}
