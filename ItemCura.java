public class ItemCura extends Item {
    protected int valorCura;

    public ItemCura(String nome, double peso, int valorCura){
        super(nome, peso);
        this.valorCura = valorCura;
    }

    public int getCura(){
        return valorCura;
    }

    public int getDano(){
        return 0;
    }

    @Override
    public void usar(){
        System.out.printf("O item curou %d pontos de vida", valorCura);
    }
}