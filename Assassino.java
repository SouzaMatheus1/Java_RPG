class Assassino extends Humano {
    private int pontosStamina;

    public Assassino(String nome, int idade, int pontosStamina) {
        super(nome, idade);
        this.pontosStamina = pontosStamina;
    }

    public int getPontosStamina() {
        return pontosStamina;
    }

    public void setPontosStamina(int pontosStamina){
        this.pontosStamina = pontosStamina;
    }

    @Override
    public void falar() {
        System.out.println("O mestre das sombras retornou!");
    }

    @Override
    public void caminhar() {
        System.out.println("*O assassino se move silenciosamente.*");
    }

    @Override
    public void atacar(Monstro alvo, Item item) {
        falar();
        System.out.println("O assassino ataca " + alvo.getNome() + " com " + item.getNome() + " e causa: " + item.getDano());
        int danoTotal = item.getDano() + usarItem();
        alvo.setPontosVida(alvo.getPontosVida() - danoTotal);
        // Lógica de ataque específica do assassino
    }

    public void concentrar(){
        System.out.println("O assassino se concentra, aumentando seu foco!");    }

    @Override
    public void descansar() {
        System.out.println("O assassino se esconde nas sombras para descansar.");
        int pontosRec = pontosStamina + 10;
        this.pontosStamina = pontosRec;
        System.out.println("Recuperou: " + pontosRec + " pontos de stamina!");
        // Lógica de recuperação de energia específica do assassino
    }
}
