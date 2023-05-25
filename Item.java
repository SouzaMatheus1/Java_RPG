abstract class Item{
    private String nome;
    private double peso;
    private int dano;

    public Item(String nome, double peso, int dano){
        this.nome = nome;
        this.peso = peso;
        this.dano = dano;
    }

    public String getNome(){
        return nome;
    }

    public String anunciarItem(){
        return "Você conseguiu o  item: " + nome + "!!";
    }

    public abstract double getPeso();
    public abstract int getDano();
    public abstract void usar();
}