class Assassino extends Humano {
    private int pontosStamina;

    public Assassino(String nome, int idade, int pontosStamina) {
        super(nome, idade);
        this.pontosStamina = pontosStamina;
    }

    public int getPontosEnergia() {
        return pontosEnergia;
    }

    public void setPontosEnergia(int pontosEnergia) {
        this.pontosEnergia = pontosEnergia;
    }

    @Override
    public void falar() {
        System.out.println("O mestre das sombras retornou!.");
    }

    @Override
    public void caminhar() {
        System.out.println("*O assassino se move silenciosamente.*");
    }

    @Override
    public void atacar(Monstro alvo, Item item]) {
        System.out.println("O assassino ataca " + alvo.getNome() + " com " + item.getNome() + ".");
        // Lógica de ataque específica do assassino
    }

    @Override
    public void usarMagia(Monstro alvo) {
        System.out.println("O assassino não possui habilidades mágicas.");
    }

    @Override
    public void descansar() {
        System.out.println("O assassino se esconde nas sombras para descansar.");
        // Lógica de recuperação de energia específica do assassino
    }
}
