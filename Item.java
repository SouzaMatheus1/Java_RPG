abstract class Item{
    protected String nome;
    private double peso;

    public Item(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
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

    public abstract void usar();
    public abstract int getDano();
}