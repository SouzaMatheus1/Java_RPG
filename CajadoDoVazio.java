class CajadoDoVazio extends Item {
    private int pontosMana;

    public CajadoDoVazio(String nome, double peso, int dano, int pontosMana) {
        super(nome, peso, dano);
        this.pontosMana = pontosMana;
    }

    public String getNome(){
        return nome;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public int getDano(){
        return dano;
    }

    @Override
    public void usar() {
        System.out.println("O mago usa o item " + getNome() + ", causa " + getDano() + " de dano e recupera " + getPontosMana() + " pontos de mana.");
        // Lógica específica para o uso do item por um mago
    }
}
