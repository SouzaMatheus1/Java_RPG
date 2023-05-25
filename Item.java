abstract class Item{
    private String nome;
    private double peso;

    public Item(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String anunciarItem(){
        return "Você conseguiu o  item: " + nome "!!";
    }

    public abstract void usar();
}