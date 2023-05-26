class ArmaMago extends Item {
    private int dano;
    private int pontosMana;

    public ArmaMago(String nome, double peso, int pontosMana) {
        super(nome, peso);
        this.dano = 26;
        this.pontosMana = pontosMana;
    }

    public int getDano(){
        return dano;
    }

    public int getPontosMana(){
        return pontosMana;
    }

    public int setPontosMana(int manaGasta){
        int manaTotal = getPontosMana() - manaGasta;
        pontosMana = manaTotal;
        return pontosMana;
    }

    @Override
    public void usar() {
        System.out.println("O mago usa o item " + getNome() + ", causa " + getDano() + " de dano e gasta " + getPontosMana() + " pontos de mana.");
        // Lógica específica para o uso do item por um mago
    }
}
