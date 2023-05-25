import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Humano
        Humano humano = new Assassino("John", 25);

        // Criando objetos ItemMago e ItemAssassino
        Item armaMago = new CajadoDoVazio("Pergaminho Arcano", 0.5, 0, 50);
        Item armaAssa = new AdagaSanguinaria("Poção de Energia", 0.2, 0, 30);

        // Adicionando os itens ao inventário do humano
        humano.addItem(armaMago);
        humano.addItem(armaAssa);

        
    }
}
