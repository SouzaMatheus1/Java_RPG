import java.util.UUID;

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

    public int atacar(Monstro alvo, UUID id) {
        falar();
        Item item = selectItem(id);
        System.out.println("O assassino ataca " + alvo.getNome() + " com " + item.getNome() + " e causa: " + item.getDano());
        
        alvo.setPontosVida(alvo.getPontosVida() - item.getDano());
        return item.getDano();
    }

    public void concentrar(){
        System.out.printf("%S se concentra, aumentando seu foco!", getNome());
    }

    @Override
    public void descansar() {
        System.out.println("O assassino se esconde nas sombras para descansar.");
        int pontosRec = pontosStamina + 10;
        this.pontosStamina = pontosRec;
        System.out.println("Recuperou: " + pontosRec + " pontos de stamina!");
        // Lógica de recuperação de energia específica do assassino
    }
}
