import java.util.ArrayList;

abstract class Humano {
    private String nome;
    private int idade;
    private int pontosVida;
    private int pontosEnergia;
    private Item ArrayList<Item>
    
    public Humano(String nome, int idade, int pontosVida, int pontosEnergia) {
        this.nome = nome;
        this.idade = idade;
        this.pontosVida = pontosVida;
        this.pontosEnergia = pontosEnergia;
        this.ArrayList = new ArrayList<Item>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public int getPontosVida() {
        return pontosVida;
    }
    
    public int getPontosMagia() {
        return pontosMagia;
    }
    
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    
    public void setPontosMagia(int pontosMagia) {
        this.pontosMagia = pontosMagia;
    }

    public void addItem(Item item) {
        listaItens.add(item);
        System.out.println("Item '" + item.getNome() + "' adicionado à lista de itens de " + nome + ".");
    }
    
    public abstract void falar();
    public abstract void caminhar();
    public abstract void atacar(Humano alvo);
    public abstract void usarMagia(Humano alvo);
    public abstract void descansar();
}
