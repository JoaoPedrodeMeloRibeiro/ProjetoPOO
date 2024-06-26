package org.somdasseis;

public class Personagem {

    Dados dados = new Dados();
    Habilidades habilidades = new Habilidades();
    Antecedentes antecedentes = new Antecedentes();
    Tormento tormento = new Tormento();

    public void mostrarPersonagem(){
        dados.mostrandoDados();
        antecedentes.mostrandoAntecedentes();
        habilidades.mostrarHabilidade();
        tormento.mostrarTormento();
    }

}
