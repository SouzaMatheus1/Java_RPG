class AdagaSanguinaria extends Item {
    private int pontosEnergia;

    public AdagaSanguinaria(String nome, double peso, int dano, int pontosEnergia) {
        super(nome, peso, dano);
        this.pontosEnergia = pontosEnergia;
    }

    public String getNome(){
        return nome;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usar() {
        System.out.println("O assassino usa o item " + getNome() + " e causa " + getDano() + " pontos de dano.");
        // Lógica específica para o uso do item por um assassino
    }
}