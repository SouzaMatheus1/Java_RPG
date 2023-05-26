import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Criando humanos
        Mago patolino = new Mago("Mago Pato", 238, 1000);
        Assassino talon = new Assassino("Talon", 26, 200);

        // Criando itens de mago
        ArmaMago cajado = new ArmaMago("Cajado do vazio", 0.7, 100);
        ArmaMago sufIg = new ArmaMago("Sufocamento igneo", 1.3, 100);

        // Criando itens de assassino
        ArmaAssassino adaga = new ArmaAssassino("Lamina Sanguinaria", 1.2, 39);
        ArmaAssassino espada = new ArmaAssassino("Adaga Sombria", 6.7, 98);
        
        // Adicionando os itens ao inventário do Mago
        patolino.addItem(cajado);
        patolino.addItem(sufIg);

        // Adicionando os itens ao inventário do Assasino
        talon.addItem(adaga);
        talon.addItem(espada);

        // ================================== // // ================================== // 

        // Criando monstros
        Troll trundle = new Troll("Trundle", 600, 200);
        Ciclope crom = new Ciclope("Crom", 650, 110);

        talon.receberDano(trundle.atacar(talon));
        System.out.println(talon.getPontosVida());
        patolino.receberDano(crom.atacar(patolino));
        System.out.println(patolino.getPontosVida());



    }
}
