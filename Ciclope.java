class Ciclope extends Monstro {
    public Ciclope(String nome, int pontosVida, int dano){
        super(nome, pontosVida, dano);
    }

    public int atacar(Humano alvo) {
        gritar();
        System.out.println("O Ciclope ataca " + alvo.getNome() + " causando " + dano + " pontos de dano.");
        return dano;
    }

    public void receberDano(int quantidade) {
        System.out.println("O Ciclope recebe " + quantidade + " pontos de dano.");
        setPontosVida(getPontosVida() - quantidade);
    }

    public void gritar(){
        System.out.println("PARE DE SE MEXER, TENHO APENAS UM OLHO!");
    }

    public void agir() {
        gritar();
        System.out.println("*O Ciclope age de forma descontrolada.*");
    }
}
