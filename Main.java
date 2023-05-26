import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Humano
        Mago patolino = new Mago("Mago Pato", 238, 1000);
        Assassino talon = new Assassino("Talon", 26, 200);


        // Criando objetos ItemMago e ItemAssassino
        ArmaMago cajado = new ArmaMago("Cajado do vazio", 0.7, 100);
        ArmaAssassino adaga = new ArmaAssassino("Lâmina Sanguinária", 1.2, 39);

        // Adicionando os itens ao inventário do humano
        patolino.addItem(cajado);
        talon.addItem(adaga);

        System.out.println(patolino.getNome());
    }
}
