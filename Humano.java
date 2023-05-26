import java.util.ArrayList;
import java.util.UUID;

abstract class Humano{
    private String nome;
    private int idade;
    private int pontosVida;
    private int pontosEnergia;
    private ArrayList<Item> itens;
    
    public Humano(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.pontosVida = 100;
        this.pontosEnergia = 100;
        this.itens = new ArrayList<Item>();
    }

    // Metódos GET
    public String getNome(){
        return nome;
    }
    
    public int getPontosVida(){
        return pontosVida;
    }

    public int getIdade(){
        return idade;
    }
    
    public int getPontosEnergia(){
        return pontosEnergia;
    }

    // Metódos itens
    public void showItens(){
        System.out.println("Itens na bolsa de " + getNome() + ":");
        for(Item item : itens){
            System.out.println(item);
        }
    }

    public Item selectItem(UUID id){
        Item temp = null;
        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i); 
            if (item.getId().equals(id)) {
                temp = item;
                break;
            }
        }
        return temp;
    }

    public void showItem(UUID id){
        Item temp = null;
        for(int i = 0; i < itens.size(); i++){
            temp = itens.get(i);           
            if(temp.getId().equals(id)){
                System.out.println(temp);
            }
        }
    }

    public int usarItem(){
        int danoTotal = 0;
        for (Item item : itens){
            danoTotal += item.getDano();
            item.usar();
        }
        return danoTotal;
    }

    public void addItem(Item item){
        itens.add(item);
        System.out.println("Item '" + item.getNome() + "' adicionado a lista de itens de " + nome + ".");
    }

    public void remItem(UUID id){
        Item temp = null;
        for(int i = 0; i < itens.size(); i++){
            temp = itens.get(i);           
            if(temp.getId().equals(id)){
                itens.remove(i);
            }
        }
    }

    // Combate
    public void receberDano(int quantidade) {
        this.pontosVida -= quantidade;
        System.out.println("O humano recebe " + quantidade + " pontos de dano.");
        if (pontosVida <= 0) {
            System.out.println("O humano foi derrotado.");
        }
    }

    public abstract void falar();
    public abstract void caminhar();
    public abstract void atacar(Monstro alvo, Item item);
    public abstract void descansar();
}
