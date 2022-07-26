import java.util.HashMap;
import java.util.Scanner;
 
public class App {
 
        // static Scanner escaneador;
 
        public static void main(String[] args) {
 
                Scanner escaneador = new Scanner(System.in);
                
                LeitorCarregador leitor = new LeitorCarregador();
                HashMap<String, Personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
                
                Personagem neon = personagens.get("Neon");
                Personagem sova = personagens.get("Sova");

                //Personagem neon = new Personagem("Neon", 100);
                //Personagem sova = new Personagem("Sova", 100);
                // Conteudo do Livro
                // Capitulo1
                Capitulo capitulo1 = new Capitulo(
                                "O inicio de tudo", neon.nome + " e " + sova.nome
                                                + " Moram em Runeterra desde pequenos, sao amigos inseparáveis" +
                                                "ambos da mesma idade" + ","
                                                + "sempre estão juntos em alguma aventura pelo seu vilarejo." +
                                                "\n Certo dia ambos resolvem sair pela vila para brincar, nesse dia se afastaram muito da vila oque era pessimo"
                                                +
                                                " ja que ambos nao sabiam de cabeça o caminho de voltar para casa,"
                                                + neon.nome
                                                + " percebe que estão muito longe de casa e avisa ao " + sova.nome +
                                                " que fica assustado ao perceber, eles se separam para tentar achar o caminho, "
                                                + sova.nome + " grita falando que encontrou o caminho.",
                                               
                                neon,
                                0,
                                escaneador);
 
                // Capitulo 2
 
                Capitulo capitulo2 = new Capitulo(neon.nome + " Ignorando o Sova", neon.nome
                                + " prefere ficar onde estar e tenta achar algum sinal da trilha por onde eles vinheram, depois de muito procurar "
                                +
                                neon.nome + "encontra umas pegadas que pareciam muito com a do " + sova.nome
                                + " ela grita por ele" +
                                " que rapidamente chega perto dela," +
                                "\n" + sova.nome + ":" + " O que houve" +
                                "\n" + neon.nome + ":" + " encontrei a trilha veja, sao suas pegadas" +
                                " Eles seguem a trilha encontrada e conseguem chegar na Vila. FIm.",
                                
                                neon,
                                0,
                                escaneador);
 
                // Capitulo 3
 
                Capitulo capitulo3 = new Capitulo(neon.nome + " Vai ate o Sova", "\n" + neon.nome + " Chega onde o  "
                                + sova.nome
                                + " esta e ele lhe mostra uma trilha" +
                                "\n" + sova.nome + ":" + " Veja " + neon.nome
                                + " acho que essa trilhe pode nos levar de volta a vila, o que acha?" +
                                "\n" + neon.nome + ":" + " Hum pode ser, vamos seguir e ver onde vai dar." +
                                " depois de uma longa caminhada começa a chover, " + sova.nome + " e  "
                                + neon.nome
                                + "avistam uma caverna e logo correm para entrar nela e se proteger da chuva" +
                                "\n" + " A chuva da um tempo e eles ja podem sair da caverna mas o " + sova.nome
                                + " fala para a " + neon.nome + " \n" + sova.nome + ":" +
                                " o que acha de explorar essa caverna? ver o que tem no final dela." +
                                "\n",
                                
                                neon,
                                0,
                                escaneador);
 
                // Capitulo 4
                Capitulo capitulo4 = new Capitulo(" Explorando a caverna ", sova.nome + " e " + neon.nome
                                + " Exploram a Caverna, " + sova.nome
                                + " começa a gritar na caverna por causa do eco e acha divertido a " +
                                neon.nome
                                + "pede para ele parar, ele nao para e logo em seguida um monte de Morcegos vem na direção deles"
                                +
                                sova.nome + " se assusta e ao tentar correr escorrega e cai, o mesmo fica machucado",
                                sova, -35,
                                escaneador);
 
                // Capitulo 5
                Capitulo capitulo5 = new Capitulo(" Saindo em segurança", "Apos a chuva passar " + neon.nome + " e "
                                + sova.nome
                                + " saem da caverna, quando ja estão para ver a luz do dia " +
                                "o " + sova.nome + " grita alto, Cuidadooo " + neon.nome
                                + " uma pedra se desloca da caverna e iria atingir a " + neon.nome + " se nao fosse " +
                                "avisada a tempo" + neon.nome + " Toma um belo susto mas logo agradece ao " + sova.nome
                                + "por ter avisado",  sova, +35,
                                escaneador);
                

                //Escolhas
                capitulo1.escolhas.add(new Escolha( "continuar onde esta", capitulo2));
                capitulo1.escolhas.add(new Escolha( "ir ate o sova", capitulo3));
                capitulo3.escolhas.add(new Escolha( "explorar a caverna", capitulo4));
                capitulo3.escolhas.add(new Escolha( "sair da caverna", capitulo5));
               
                Capitulo raiz = capitulo1;
                



                // Execução do livro (Lógica)

                raiz.mostrar();
                escaneador.close();
        }
 
}