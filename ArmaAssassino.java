class ArmaAssassino extends Item {
    private int dano;
    private int pontosEnergia;

    public ArmaAssassino(String nome, double peso, int pontosEnergia) {
        super(nome, peso);
        this.dano = 46;
        this.pontosEnergia = pontosEnergia;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPontosEnergia(){
        return pontosEnergia;
    }

    public int setPontosEnergia(int energiaGasta){
        int energiaTotal = getPontosEnergia() - energiaGasta;
        pontosEnergia = energiaTotal;
        return energiaGasta;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usar() {
        System.out.println("O assassino usa o item " + getNome() + " e causa " + getDano() + " pontos de dano e gasta " + getPontosEnergia() + " pontos de energia.");
        // Lógica específica para o uso do item por um assassino
    }
}