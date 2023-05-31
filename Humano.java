import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.UUID;

abstract class Humano{
    private String nome;
    private int idade;
    private int pontosVida;
    private int pontosEnergia;
    private double defesa;
    private double esquiva;
    private ArrayList<Item> itens;
    
    public Humano(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.pontosVida = 100;
        this.pontosEnergia = 100;
        this.esquiva = (0.2 * (this.pontosVida + this.pontosEnergia))/100;
        this.defesa = (0.14 * (this.pontosVida + this.pontosEnergia))/1.5;
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
        for(Item itemBolsa : itens){
            if(itemBolsa instanceof ItemDefesa){
                    equiparItem((ItemDefesa)item);
                }
            }
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

    public void equiparItem(ItemDefesa item) {
        // Atualiza os atributos 
        pontosVida += item.getVida();
        defesa += item.getDefesa();

        // Avisa usuário
        System.out.printf("O item %s foi adicionado a bolsa, aumentando a defesa!", item.getNome());
    }

    public void usarItemCura(ItemCura item){
        for(Item itemBolsa : itens){
            if(itemBolsa == item){
                pontosVida += item.getCura();
                item.usar();
            }
        }
    }

    // Combate
    public void receberDano(int quantidade){
        double chanceEsquiva = Math.random(); // Gera um número aleatório entre 0 e 1
    
        if(chanceEsquiva <= esquiva){
            System.out.println(nome + " esquivou e não recebeu dano!");
            System.out.println("ESQUIVA: " + esquiva);
            System.out.println("CHANCEESQUIVA: " + chanceEsquiva);
        }else{
            double danoFinal = quantidade - defesa;
            if(danoFinal > 0){
                this.pontosVida -= danoFinal;
                System.out.println(nome + " recebeu " + danoFinal + " pontos de dano.");
                System.out.println("DEFESA: "+defesa);
                
                if(pontosVida <= 0){
                    System.out.println("O humano foi derrotado.");
                }
            }else{
                System.out.println("O humano defendeu-se completamente do golpe e não recebeu dano!");
            }
        }
    }

    public abstract void falar();
    public abstract void caminhar();
    public abstract void descansar();
    public abstract int atacar(Monstro alvo, UUID id);
}
