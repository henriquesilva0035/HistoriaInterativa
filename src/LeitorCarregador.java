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
        personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));
        

        escaneadorArquivoPersonagens.close();

        }
         catch (FileNotFoundException exception) {
           
            exception.printStackTrace();
        }


        return personagens;
    }

    HashMap<String, Capitulo> lerCapitulos(String caminhoArquivoCapitulos, HashMap<String, Personagem> personagens, Scanner escaneadorConsole)
    {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
        Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

    
        String linhaEscaneada = "";
        
        while(escaneadorArquivoCapitulos.hasNextLine())
        {
            while(!linhaEscaneada.equals("CAPITULO") && !linhaEscaneada.equals("ESCOLHA"))
            {
                linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
            
            }
                if(linhaEscaneada.equals("CAPITULO"))
                {
                 
                 lerCapitulo(personagens, escaneadorConsole, capitulos, escaneadorArquivoCapitulos);
                    
                    linhaEscaneada = "";
                }
                    else if(linhaEscaneada.equals("ESCOLHA"))
                        {
                            lerEscolha(capitulos, escaneadorArquivoCapitulos);
                            linhaEscaneada = "";
                        }     
             
        
        }
        escaneadorArquivoCapitulos.close();

        }
         catch (FileNotFoundException exception) {
           
            exception.printStackTrace();
        }


        return capitulos;
    }

    

    private void lerCapitulo(HashMap<String, Personagem> personagens, Scanner escaneadorConsole,
            HashMap<String, Capitulo> capitulos, Scanner escaneadorArquivoCapitulos) {
                
            String nomeCapitulo;
            String textoCapitulo;
            String nomePersonagem;
            String linhaEscaneada;
            int variacaoEnergia;
                
            linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //nome
            nomeCapitulo = escaneadorArquivoCapitulos.nextLine();
            linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //texto
            textoCapitulo = escaneadorArquivoCapitulos.nextLine();
            linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //personagem
            nomePersonagem = escaneadorArquivoCapitulos.nextLine();
            linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //variação energia
            variacaoEnergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
            capitulos.put(nomeCapitulo, new Capitulo(nomeCapitulo, textoCapitulo, personagens.get(nomePersonagem), variacaoEnergia, escaneadorConsole));


    }

    private Void lerEscolha(HashMap<String, Capitulo> capitulos, Scanner escaneadorArquivoCapitulos){
        String nomeCapituloOrigem;
        String textoEscolha;
        String nomeCapituloDestino;
        String linhaEscaneada;
        
        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //CAPITULO DE ORIGEM
        nomeCapituloOrigem = escaneadorArquivoCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //texto
        textoEscolha = escaneadorArquivoCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); //CAPITULO DESTINO
        nomeCapituloDestino = escaneadorArquivoCapitulos.nextLine();
        
        Capitulo capituloOrigem = capitulos.get(nomeCapituloOrigem);
        Capitulo capituloDestino = capitulos.get(nomeCapituloDestino);
        capituloOrigem.escolhas.add(new Escolha( textoEscolha, capituloDestino));

    }



}
