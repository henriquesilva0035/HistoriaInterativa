import java.util.ArrayList;
import java.util.Scanner;
 
public class Capitulo {
    String nome;
    String texto;
    ArrayList<Escolha> escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;
 
    Capitulo(String nome,
            String texto,
            
            Personagem personagem,
            int alteracaoEnergia,
            Scanner escaneador)
 
    {
        this.nome = nome;
        this.texto = texto;
       
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
 
        this.escolhas = new ArrayList<Escolha>();
    }
 
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.alterarEnergia(this.alteracaoEnergia);
 
        if(this.escolhas.size() > 0){
 
            for (Escolha escolha : escolhas) 
            {
 
                System.out.println("--" + escolha.texto);
            }
        
            int idEscolha = escolher();
            this.escolhas.get(idEscolha).proximo.mostrar();
        }
        
        

        
    }
 
    int escolher() {
 
        int idEscolha = -1;
        if (escolhas != null) {
 
            while (idEscolha == -1) {
                System.out.println("Digite sua Escolha:  ");
                String escolhaDigitada = escaneador.nextLine();
 
                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolhaDigitada.equals(escolhas.get(i).texto))
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
