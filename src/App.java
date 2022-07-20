import java.util.Scanner;

public class App {

    static Scanner escaneador;

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo ao Chapeu Seletor");
        System.out.println("\n Voce está preparado para descobrir a sua casa?");
        System.out.println("\n\n Antes de Começar, como você se chama?");
        // inicio do sistema onde vai ter perguntas para o user
        escaneador = new Scanner(System.in);
        String nomejogadordigitado = escaneador.nextLine();

        // aqui o escaneador está pegando oque foi digitado e armazenando na variavel,
        // vou usar ela a seguir.

        System.out.println("\n\n Humm " + nomejogadordigitado + " Seja bem vindo");

        System.out.println(
                "\n Lar dos bravos e cavalheiros, A Casa valoriza feitos de coragem e superação pessoal que costumam ser realizados por altruísmo");
        System.out.println(
                "\n Seus estudantes tendem a ser bastante aventureiros, mas se destacam, sobretudo, pela lealdade.");

        System.out.println("\n Qual dessas principais caracteristicas você considera ter");
        System.out.println(
                "\n\n Opção 1: uma pessoa imprudente nos atos de bravura, bastante aventureiro, \n\n Opção 2: Voce considera ser uma pessoa honesta e paciente ");

        escaneador = new Scanner(System.in);
        int escolha = escaneador.nextInt();

        if (escolha == 1) {

            System.out.println("Humm vejo que a casa que mais se encaixa com você é ifinória!");
            // essa if 1 e ja é o final 1

        } else if (escolha == 2) {
            System.out.println("Bom ainda nao consigo te encaixar em uma casa, vamos tentar mais uma vez");

            // daqui pra baixo começa a 2 parte junto com os 2 finais
            System.out.println(
                    "\n são dedicados, pacientes e honestos. Suas admiráveis características os tornam trabalhadores árduos e modestos, sendo receptivos a todos os demais tipos de bruxos.");
            System.out.println("\n por outro lado, o excesso dessas qualidades pode se tornar um ponto negativo");

            System.out.println("\n Qual dessas principais caracteristicas você considera ter");

            System.out.println(
                    "\n\n Opção 1: Pessoa honesta, paciente e dedicada, \n\n Opção 2: Uma pessoa ambiciosa, um senso de competição muito aflorado ");

            escaneador = new Scanner(System.in);
            int escolha1 = escaneador.nextInt();

            if (escolha1 == 1) {

                System.out.println("Lufa-Lufa é a sua casa!");
                // essa if

            } else if (escolha1 == 2) {
                System.out.println("Sonserina é a sua casa!");
            }

        } // chave final do else if

    }

}
