import java.util.UUID;

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
        this.pontosMana -= manaGasta;
    }

    @Override
    public String falar() {
        return "O mago fala palavras de poder.";
    }

    @Override
    public void caminhar() {
        System.out.println("*O mago flutua no ar enquanto caminha.*");
    }

    @Override
    public int atacar(Monstro alvo, UUID id) {
        falar();
        Item item = selectItem(id);
        System.out.println("O mago ataca " + alvo.getNome() + " com um feitiço e causa: " + item.getDano() + "!");
        int danoTotal = item.getDano() + usarItem();
        alvo.setPontosVida(alvo.getPontosVida() - danoTotal);
        return danoTotal;
    }

    public void usarMagia() {
        System.out.println("O mago conjura uma poderosa magia em " + getNome() + ".");
        double manaGasta = getPontosMana() - (getPontosMana() * 0.3);
        setPontosMana(manaGasta);
        // Lógica de uso de magia específica do mago
    }

    @Override
    public String descansar() {
        System.out.println("O mago medita para recperar sua energia mágica.");
        double pontosRec = pontosMana + 10;
        this.pontosMana = pontosRec;
        return "Recuperou: " + pontosRec + " pontos de mana!";
        // Lógica de recuperação de mana específica do mago
    }
}
