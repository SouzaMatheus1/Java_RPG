public class ItemDefesa extends Item{
    public double valorDefesa;
    public int valorVida;

    public ItemDefesa(String nome, double peso, double defesa, int vida){
        super(nome, peso);
        this.valorDefesa = defesa;
        this.valorVida = vida;
    }

    public double getDefesa(){
        return valorDefesa;
    }

    public int getVida(){
        return valorVida;
    }

    public int getDano(){
        return 0;
    }

    @Override
    public void usar(){
        System.out.printf("O item %s aumentou %d de defesa!", nome, valorDefesa);
    }
}
