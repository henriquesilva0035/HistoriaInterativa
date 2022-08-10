import java.util.Scanner;
 
public class Capitulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;
 
    Capitulo(String nome,
            String texto,
            String[] escolhas,
            Personagem personagem,
            int alteracaoEnergia,
            Scanner escaneador)
 
    {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
 
    }
 
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.alterarEnergia(this.alteracaoEnergia);
 
        if(this.escolhas != null){
 
            for (String escolha : escolhas) {
 
                System.out.println("--" + escolha);
            }
        }
 
 
    }
 
    int escolher() {
 
        int idEscolha = -1;
        if (escolhas != null) {
 
            while (idEscolha == -1) {
                System.out.println("Digite sua Escolha: ");
                String escolhaDigitada = escaneador.nextLine();
 
                for (int i = 0; i < escolhas.length; i++) {
                    if (escolhaDigitada.equals(escolhas[i]))
                    {
 
                        idEscolha = i;
   
                    }
                   
                }
 
               
            }
            System.out.println();
        }
        return idEscolha;
    }
 
}
