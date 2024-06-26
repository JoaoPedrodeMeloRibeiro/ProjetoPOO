package org.somdasseis;

import java.util.Objects;
import java.util.Scanner;

public class Habilidades {
    private final String letsdance = "2 tiros por acao com -1 nos testes" ;
    private final String fortunateson = "Ao chegar a ZERO, retorne com 3pvs" ;
    private final String dontstopbelieving = "+1 para testes com rifles ou arcos longos" ;
    private final String immigrantsong = "+1 ponto de Antecedente";
    private final String gimmeshelter = "Dano extra com ataques surpresa com facas";
    private final String anotheronebitesthedust = "Manobras de combate corpo a corpo";
    private final String ridersonthestorm = "+1d6 no dano para cada 3PVs perdidos";
    private final String borntobewild = "+1 para testes de furtividade ou percepcao";
    private final String smokeonthewater = "+1 para testes de furtividade ou percepcao";
    private final String underpressure = " +1 para testes de atributo";
    private final String heartbreaker = "-1 para acoes contra 1 alvo a escolha";
    private final String barracuda = " +1 para testes para obter afirmacoes";
    private final String sweetemotion = "Inspiracoes e bonus para outros personagens";
    private final String crazytrain = "+1d6 no dano da arma ate o fim do combate";
    private final String carryonmywaywardson = "A personagem pode refazer um teste falho";
    private final String warpigs = "+1 para testes que envolvem explosivos";
    private final String aceofspades = "+1 para testes em jogos e trapaças";
    private final String ahorsewithnoname = "+1 para testes com montaria";
    private final String iwanttoholdyourhand = "+1d6 PVs curados durante o descanso";
    private final String paranoid = "+1 nos testes de Iniciativa";
    private final String rambleon = "2 movimentos com 1 acao/ +1 em testes de fuga";
    private final String agualung = " +1 para testes atleticos";
    private final String morethanafeeling = "A personagem pode fazer duas perguntas a Juiza";
    private final String rasteira = "É feito um teste contra o oponente, que se derrotado, cai no chao e precisa usar uma ação para levantar";
    private final String kungfu = "Você faz 3 golpes em uma ação com -1 no dano";
    private final String suplex = "Faça um teste contra o oponente, que se perder é arremessado de cabeça no chão, tomando 2d6 de dano";
    private final String brigadebar = "Você pode usar qualquer coisa como arma. Obgetos pequenos causam 1d3 de dano; Médios causam 1d6; Grandes causam 1d6+3 de dano";
    private final String tapacomascostasdamao = "A bifa faz co que a dignidade do inimigo saia dele por alguns momentos. Ele precisa gastar uma ação para se recuperar desse tapa na dignidade";
    private String [] hab;
    private String combate;



    public void escolherHabilidades(int op, int i){

        String lightmyfire = "+1 para testes com revólver";
        switch (op)
        {
            case 1:
                hab[i] = lightmyfire;
                break;

            case 2:
                hab[i] = letsdance;
                break;

            case 3:
                hab[i] = fortunateson;
                break;

            case 4:
                hab[i] = dontstopbelieving;
                break;

            case 5:
                hab[i] = immigrantsong;
                break;

            case 6:
                hab[i] = gimmeshelter;
                break;

            case 7:
                hab[i] = anotheronebitesthedust;
                Scanner sc = new Scanner(System.in);
                int select = Integer.parseInt(sc.next());
                System.out.println("Digite um numero de um a cinco para escolher ");
                System.out.println(" [1] Rasteira: ");
                System.out.println("É feito um teste contra o oponente, que se derrotado, cai no chao e precisa usar uma ação para levantar");
                System.out.println(" [2] Kung-Fu: ");
                System.out.println("Você faz 3 golpes em uma ação com -1 no dano");
                System.out.println(" [3] Suplex: ");
                System.out.println("Faça um teste contra o oponente, que se perder é arremessado de cabeça no chão, tomando 2d6 de dano");
                System.out.println(" [4] Briga de Bar: ");
                System.out.println("Você pode usar qualquer coisa como arma. Obgetos pequenos causam 1d3 de dano; Médios causam 1d6; Grandes causam 1d6+3 de dano.");
                System.out.println(" [5] Tapa com as costas da mão: ");
                System.out.println("A bifa faz co que a dignidade do inimigo saia dele por alguns momentos. Ele precisa gastar uma ação para se recuperar desse tapa na dignidade ");
                switch (select)
                {
                    case 1:
                        combate = rasteira;
                        break;
                    case 2:
                        combate = kungfu;
                        break;
                    case 3:
                        combate = suplex;
                        break;
                    case 4:
                        combate = brigadebar;
                        break;
                    case 5:
                        combate = tapacomascostasdamao;
                        break;
                }
                break;

            case 8:
                hab[i] = ridersonthestorm;
                break;

            case 9:
                hab[i] = borntobewild;
                break;

            case 10:
                hab[i] = smokeonthewater;
                break;

            case 11:
                hab[i] = underpressure;
                break;

            case 12:
                hab[i] = heartbreaker;
                break;

            case 13:
                hab[i] = barracuda;
                break;

            case 14:
                hab[i] = sweetemotion;
                break;

            case 15:
                hab[i] = crazytrain;
                break;

            case 16:
                hab[i] = carryonmywaywardson;
                break;

            case 17:
                hab[i] = warpigs;
                break;

            case 18:
                hab[i] = aceofspades;
                break;

            case 19:
                hab[i] = ahorsewithnoname;
                break;

            case 20:
                hab[i] = iwanttoholdyourhand;
                break;

            case 21:
                hab[i] = paranoid;
                break;

            case 22:
                hab[i] = rambleon;
                break;


            case 23:
                hab[i] = agualung;
                break;

            case 24:
                hab[i] = morethanafeeling;
                break;

        }

    }

    public void mostrarHabilidade(){

        System.out.println("Habilidades: ");
        for (String s : hab) {
            System.out.println(s);
            if (Objects.equals(s, "Manobras de combate corpo a corpo")) {
                System.out.println(combate);
            }
        }


    }


    public void mostrarMusicas(){
        System.out.println("Digite 1 para: ");
        System.out.println("Light My Fire");
        System.out.println("+1 para testes com revólver");


        System.out.println("Digite 2 para: ");
        System.out.println("Lets Dance");
        System.out.println("2 tiros por acao com -1 nos testes");

        System.out.println("Digite 3 para: ");
        System.out.println("Fortunate Son");
        System.out.println("Ao chegar a ZERO, retorne com 3pvs");

        System.out.println("Digite 4 para: ");
        System.out.println("Dont Stop Believing");
        System.out.println("+1 para testes com rifles ou arcos longos");

        System.out.println("Digite 5 para : ");
        System.out.println("Immigrant Song");
        System.out.println("+1 ponto de Antecedente");

        System.out.println("Digite 6 para: ");
        System.out.println("Gimme Shelter");
        System.out.println("Dano extra com ataques surpresa com facas");

        System.out.println("Digite 7 para: ");
        System.out.println("Another one Bites the Dust");
        System.out.println("Manobras de combate corpo a corpo");

        System.out.println("Digite 8 para: ");
        System.out.println("Riders on the Storm");
        System.out.println("+1d6 no dano para cada 3PVs perdidos");

        System.out.println("Digite 9 para: ");
        System.out.println("Born to be Wild");
        System.out.println("+1 para testes de furtividade ou percepcao");

        System.out.println("Digite 10 para: ");
        System.out.println("Smoke on the Water");
        System.out.println("+1 para testes de furtividade ou percepcao");

        System.out.println("Digite 11 para: ");
        System.out.println("Under Pressure");
        System.out.println(" +1 para testes de atributo");

        System.out.println("Digite 12 para: ");
        System.out.println("Heartbreaker");
        System.out.println("-1 para acoes contra 1 alvo a escolha");

        System.out.println("Digite 13 para: ");
        System.out.println("Barracuda");
        System.out.println(" +1 para testes para obter afirmacoes");

        System.out.println("digite 14 para: ");
        System.out.println("Sweet Emotion");
        System.out.println("Inspiracoes e bonus para outros personagens");

        System.out.println("Digite 15 para : ");
        System.out.println("Crazy Train");
        System.out.println("+1d6 no dano da arma ate o fim do combate");

        System.out.println("Digite 16 para: ");
        System.out.println("Carry on my Wayward Son");
        System.out.println("A personagem pode refazer um teste falho");

        System.out.println("Digite 17 para: ");
        System.out.println("War Pigs");
        System.out.println("+1 para testes que envolvem explosivos");

        System.out.println("Digite 18 para: ");
        System.out.println("Ace of Spades");
        System.out.println("+1 para testes em jogos e trapaças");

        System.out.println("Digite 19 para: ");
        System.out.println("A Horse with no Name");
        System.out.println("+1 para testes com montaria");

        System.out.println("Digite 20 para: ");
        System.out.println("I want to hold yout hand");
        System.out.println("+1d6 PVs curados durante o descanso");

        System.out.println("Digite 21 para: ");
        System.out.println("Paranoid");
        System.out.println("+1 nos testes de Iniciativa");

        System.out.println("Digite 22 para:");
        System.out.println("Ramble on");
        System.out.println("2 movimentos com 1 acao/ +1 em testes de fuga");

        System.out.println("Digite 23 para:");
        System.out.println("Aqualung");
        System.out.println(" +1 para testes atleticos");

        System.out.println("Digite 24 para:");
        System.out.println("More than a Feeling");
        System.out.println("A personagem pode fazer duas perguntas a Juiza"); }
}
