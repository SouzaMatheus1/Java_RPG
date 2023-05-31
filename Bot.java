import java.util.Random;

public class Bot {
    private String nome;
    private Humano humano; // Referência para o objeto humano controlado pelo Bot
    private Monstro monstro; // Referência para o objeto monstro controlado pelo Bot

    public Bot(String nome) {
        this.nome = nome;
    }

    public void escolherHumano(Humano humano) {
        this.humano = humano;
    }

    public void escolherMonstro(Monstro monstro) {
        this.monstro = monstro;
    }

    public void escolher(){
        Random random = new Random();
        int acao = random.nextInt(1);

        switch(acao){
            case 0:
                escolherHumano(humano);
                break;
            case 1:
                escolherMonstro(monstro);
                break;
            default:
                break;
        }
    }

    public void jogar() {
        Random random = new Random();
        int acao = random.nextInt(3); // Número aleatório entre 0 e 2

        switch (acao) {
            case 0:
                atacar();
                break;
            case 1:
                defender();
                break;
            case 2:
                usarItem();
                break;
            default:
                System.out.println("Ação inválida.");
        }
    }
}
