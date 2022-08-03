public class Personagem {

    String nome;
    int energia;

    Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = 100;

    }

    void alterarEnergia(int alteracao) {
        this.energia = this.energia + alteracao;

        if (alteracao > 0) {
            System.out.println(
                    "Como decorrência dessa ação," + this.nome + " Ganha" + alteracao + " pontos de energia");
        } else {
            System.out
                    .println("Como decorrência dessa ação," + this.nome + " Perdeu" + alteracao + " pontos de energia");
        }

        if (this.energia > 100) {
            this.energia = 100;
        } else if (this.energia < 0) {
            this.energia = 0;
            System.out.println("Sua energia esgotou" + this.nome + " foi ferido não consegue  seguir viagem ");
        }
    }

}