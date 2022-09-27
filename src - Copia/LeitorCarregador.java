import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorCarregador {
    
    HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonagens)
    {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);

        try {
        Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

    
        String nomePersonagem = "";
        String linhaEscaneada = "";
        int energiaPersonagem = 0;
        while(!linhaEscaneada.equals("PERSONAGEM"))
        {
            linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
        }

        linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); //nome:
        nomePersonagem = escaneadorArquivoPersonagens.nextLine(); 
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); //energia:
        energiaPersonagem = Integer.parseInt(escaneadorArquivoPersonagens.nextLine());
        Personagem personagem = new Personagem(nomePersonagem, energiaPersonagem);
        

        escaneadorArquivoPersonagens.close();

        }
         catch (FileNotFoundException exception) {
           
            exception.printStackTrace();
        }


        return personagens;
    }
}
