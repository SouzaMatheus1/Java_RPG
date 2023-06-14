import java.util.UUID;

class Assassino extends Humano {
    private int pontosStamina;
    
  /*  
    private int codigo;
 
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
/*/
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
    public String falar() {
        return "O mestre das sombras retornou!";
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
    public String descansar() {
        System.out.println("O assassino se esconde nas sombras para descansar.");
        int pontosRec = pontosStamina + 10;
        String texto = "O assassino se esconde nas sombras para descansar." + "\n" + this.getNome() + " recuperou: " + pontosRec + " pontos de stamina!";
        this.pontosStamina = pontosRec;
        return texto;
    }
}
