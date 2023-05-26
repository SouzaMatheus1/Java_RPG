import java.util.UUID;

abstract class Item{
    protected String nome;
    protected UUID id;
    private double peso;

    public Item(String nome, double peso){
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.peso = peso;
    }

    public UUID getId() {
        return id;
    }

    public double getPeso(){
        return peso;
    }

    public String getNome(){
        return nome;
    }

    public String anunciarItem(){
        return "Você conseguiu o  item: " + nome + "!!";
    }

    public String toString() {
        return "Item: " + nome + ", Peso: " + peso;
    }

    public abstract void usar();
    public abstract int getDano();
}