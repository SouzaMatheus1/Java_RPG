abstract class Monstro {
    protected String nome;
    protected int dano;
    private int pontosVida;

    public Monstro(String nome, int pontosVida, int dano) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.dano = dano;
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

    public int atacar(Humano alvo) {
        int dano = this.dano; // Usar o valor de dano do monstro
        alvo.receberDano(dano);
        return dano;
    }

    public abstract void receberDano(int quantidade);
    public abstract void agir();
    public abstract void gritar();
    public String ultimaFrase(){
        return "Ah! :(";
    }
}
