import java.util.ArrayList;

abstract class Humano {
    private String nome;
    private int idade;
    private int pontosVida;
    private int pontosEnergia;
    private ArrayList<Item> itens;
    
    public Humano(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pontosVida = 100;
        this.pontosEnergia = 100;
        this.itens = new ArrayList<Item>();
    }

    public String getNome() {
        return nome;
    }
    
    public int getPontosVida() {
        return pontosVida;
    }

    public int getIdade(){
        return idade;
    }
    
    public int getPontosEnergia() {
        return pontosEnergia;
    }

    public int usarItem() {
        int danoTotal = 0;
        for (Item item : itens) {
            danoTotal += item.getDano();
            item.usar();
        }
        return danoTotal;
    }

    public void addItem(Item item) {
        itens.add(item);
        System.out.println("Item '" + item.getNome() + "' adicionado à lista de itens de " + nome + ".");
    }

    public abstract void falar();
    public abstract void caminhar();
    public abstract void atacar(Monstro alvo, Item item);
    public abstract void descansar();
}
