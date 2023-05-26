class Mago extends Humano {
    private double pontosMana;

    public Mago(String nome, int idade, double pontosMana) {
        super(nome, idade);
        this.pontosMana = pontosMana;
    }

    public double getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(double manaGasta) {
        this.pontosMana = this.pontosMana - manaGasta;
    }

    public void setPontosVida() {
        
    }

    @Override
    public void falar() {
        System.out.println("O mago fala palavras de poder.");
    }

    @Override
    public void caminhar() {
        System.out.println("*O mago flutua no ar enquanto caminha.*");
    }

    @Override
    public void atacar(Monstro alvo, Item item) {
        falar();
        System.out.println("O mago ataca " + alvo.getNome() + " com um feitiço e causa: " + item.getDano() + "!");
        int danoTotal = item.getDano() + usarItem();
        alvo.setPontosVida(alvo.getPontosVida() - danoTotal);
        // Lógica de ataque específica do mago
    }

    public void usarMagia() {
        System.out.println("O mago conjura uma poderosa magia em " + getNome() + ".");
        double manaGasta = getPontosMana() - (getPontosMana() * 0.3);
        setPontosMana(manaGasta);
        // Lógica de uso de magia específica do mago
    }

    @Override
    public void descansar() {
        System.out.println("O mago medita para recperar sua energia mágica.");
        double pontosRec = pontosMana + 10;
        this.pontosMana = pontosRec;
        System.out.println("Recuperou: " + pontosRec + " pontos de mana!");
        // Lógica de recuperação de mana específica do mago
    }
}
