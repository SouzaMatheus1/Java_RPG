class Mago extends Humano {
    private int pontosMana;

    public Mago(String nome, int idade, int pontosVida, int pontosMana) {
        super(nome, idade, pontosVida, pontosMana);
        this.pontosMana = pontosMana;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }

    @Override
    public void falar() {
        System.out.println("O mago fala palavras de poder.");
    }

    @Override
    public void caminhar() {
        System.out.println("O mago flutua no ar enquanto caminha.");
    }

    @Override
    public void atacar(Humano alvo) {
        System.out.println("O mago ataca " + alvo.getNome() + " com um feitiço.");
        // Lógica de ataque específica do mago
    }

    @Override
    public void usarMagia(Humano alvo) {
        System.out.println("O mago conjura uma poderosa magia em " + alvo.getNome() + ".");
        // Lógica de uso de magia específica do mago
    }

    @Override
    public void descansar() {
        System.out.println("O mago medita para recuperar sua energia mágica.");
        // Lógica de recuperação de mana específica do mago
    }
}
