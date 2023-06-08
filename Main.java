public class Main {
    public static void main(String[] args) {
        JogoGUI jogo = new JogoGUI();
        jogo.exibir();
        // Criando humanos
        Mago patolino = new Mago("Mago Pato", 238, 1000);
        Assassino talon = new Assassino("Talon", 26, 200);

        // Criando itens de mago
        ArmaMago cajado = new ArmaMago("Cajado do vazio", 0.7, 100);
        ArmaMago sufIg = new ArmaMago("Sufocamento igneo", 1.3, 100);

        // Criando itens de assassino
        ArmaAssassino adaga = new ArmaAssassino("Lamina Sanguinaria", 1.2, 39);
        ArmaAssassino espada = new ArmaAssassino("Adaga Sombria", 6.7, 98);

        // Criando itens de cura e defesa
        ItemCura pocaoDivida = new ItemCura("Pocao Divina", 0.50, 23);
        ItemDefesa escudo = new ItemDefesa("Escudo de mao", 3.0, 4.4, 10);
        
        // Adicionando os itens ao inventário do Mago
        patolino.addItem(cajado);
        patolino.addItem(sufIg);
        patolino.addItem(pocaoDivida);

        // Adicionando os itens ao inventário do Assasino
        talon.addItem(adaga);
        talon.addItem(espada);
        talon.addItem(escudo);

        // ================================== // // ================================== // 

        // Criando monstros
        Troll trundle = new Troll("Trundle", 500, 100);
        Ciclope crom = new Ciclope("Crom", 450, 130);

        talon.receberDano(trundle.atacar(talon));
        System.out.println(talon.getPontosVida());

        patolino.receberDano(crom.atacar(patolino));
        System.out.println(patolino.getPontosVida());

        // talon.receberDano(trundle.atacar(talon));
        // System.out.println(talon.getPontosVida());
        // patolino.receberDano(crom.atacar(patolino));
        // System.out.println(patolino.getPontosVida());

        // trundle.receberDano(talon.atacar(crom, espada.getId()));
        // System.out.println(trundle.getPontosVida());

        
    }
}
