import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    Capitulo(String nome,
            String texto,
            String escolha1,
            String escolha2,
            Personagem personagem,
            int alteracaoEnergia,
            Scanner escaneador)

    {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;

    }

    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.alterarEnergia(this.alteracaoEnergia);
        if (this.escolha1 != null) {
            System.out.println("--" + this.escolha1);
        }
        if (this.escolha2 != null) {
            System.out.println("--" + this.escolha2);
        }

    }

    int escolher() {

        int escolha = -1;
        if (escolha1 != null && escolha2 != null) {

            while (escolha == -1) {
                System.out.println("Digite sua Escolha: ");
                String escolhaDigitada = escaneador.nextLine();
                if (escolhaDigitada.equals(escolha1)) {

                    escolha = 1;
                } else if (escolhaDigitada.equals(escolha2)) {
                    escolha = 2;
                }
            }
            System.out.println();
        }
        return escolha;
    }

}
