class Troll extends Monstro{
    private int dano;
    
    public Troll(String nome, int pontosVida, int dano){
        super(nome, pontosVida);
        this.dano = dano;
    }

    public int atacar(Humano alvo) {
        System.out.println("O troll ataca " + alvo.getNome() + " causando " + dano + " pontos de dano.");
        return dano;
    }

    public void receberDano(int quantidade) {
        System.out.println("O troll recebe " + quantidade + " pontos de dano.");
        setPontosVida(getPontosVida() - quantidade);
    }

    public String gritar(){
        return "É HORA DE TROLLAR!";
    }

    public void agir() {
        gritar();
        System.out.println("*O troll age de forma agressiva.*");
    }
}
