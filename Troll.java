class Troll extends Monstro{
    public Troll(String nome, int pontosVida, int dano){
        super(nome, pontosVida, dano);
    }

    public int atacar(Humano alvo) {
        gritar();
        System.out.println("O troll ataca " + alvo.getNome() + " causando " + dano + " pontos de dano.");
        return dano;
    }

    public void receberDano(int quantidade) {
        System.out.println("O troll recebe " + quantidade + " pontos de dano.");
        setPontosVida(getPontosVida() - quantidade);
    }

    public void gritar(){
        System.out.println("É HORA DE TROLLAR!");
    }

    public void agir() {
        gritar();
        System.out.println("*O troll age de forma agressiva.*");
    }

    @Override
    public String ultimaFrase(){
        return "me matarão";
    }
}
