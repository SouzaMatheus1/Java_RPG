import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class JogoGUI extends JFrame{
    private JPanel painelPrincipal;

    public JogoGUI() {
        setTitle("Epic Quest");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        painelPrincipal = new JPanel();
        add(painelPrincipal);
        
        // Adicione os componentes Swing ao painelPrincipal
        // Exemplo:
        JButton assassin = new JButton("Assassino");
        painelPrincipal.add(assassin);

        JButton mage = new JButton("Mago");
        painelPrincipal.add(mage);
        
        // Defina os eventos dos componentes Swing
        // Exemplo:
        assassin.addActionListener(e -> {
            Assassino evelyn = new Assassino("Evellyn", 300, 300);
            JOptionPane.showMessageDialog(this, "Assassino selecionado!");
            JOptionPane.showMessageDialog(this, evelyn.getNome());
        });

        mage.addActionListener(e -> {
            Mago morgana = new Mago("Morgana", 339, 800);
            JOptionPane.showMessageDialog(this, "Mago selecionado!");
            JOptionPane.showMessageDialog(this, morgana.getNome());
        });
    }

    private void assassinButton(){

    }

    private void mageButton(){

    }

    public void exibir() {
        setVisible(true);
    }
}
