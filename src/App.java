import java.util.HashMap;
import java.util.Scanner;
 
public class App {
 
        // static Scanner escaneador;
 
        public static void main(String[] args) {
 
                Scanner escaneador = new Scanner(System.in);
                
                LeitorCarregador leitor = new LeitorCarregador();
                HashMap<String, Personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
                HashMap<String, Capitulo> capitulos = leitor.lerCapitulos("rsc/capitulos.txt", personagens, escaneador);

               
                Capitulo raiz = capitulos.get("O inicio de tudo");
                



                // Execução do livro (Lógica)

                raiz.mostrar();
                escaneador.close();
        }
 
}