abstract class Monstro {
    protected String nome;
    private int pontosVida;

    public Monstro(String nome, int pontosVida) {
        this.nome = nome;
        this.pontosVida = pontosVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida){
        this.pontosVida = pontosVida;
    }

    public abstract int atacar(Humano alvo);
    public abstract void receberDano(int quantidade);
    public abstract void agir();
    public abstract String gritar();
}
