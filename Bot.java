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

    public void jogar() {
        // Implemente a lógica de jogo do Bot aqui
        // Com base em algum critério, o Bot pode decidir jogar como humano ou como monstro
        // Você pode usar algoritmos, regras ou condições específicas para fazer essa escolha

        if (humano != null) {
            // O Bot joga como humano
            // Chame os métodos específicos do objeto humano controlado pelo Bot
            humano.falar();
            humano.caminhar();
            humano.descansar();
            humano.atacar(monstro);
        } else if (monstro != null) {
            // O Bot joga como monstro
            // Chame os métodos específicos do objeto monstro controlado pelo Bot
            monstro.andar();
            monstro.atacar(humano);
        }
    }
}
