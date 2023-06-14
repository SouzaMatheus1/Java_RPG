import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoGUI extends JFrame {
    private JPanel painelPrincipal;
    private JPanel painelTexto;
    private JLabel retornoLabel;
    private String personagemNome;

    private JPanel painelAssassino;
    private JPanel painelMago;

    public JogoGUI() {
        setTitle("Epic Quest");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painelPrincipal = new JPanel(new CardLayout());
        add(painelPrincipal);

        try {
            personagemNome = obterNomePersonagem();
        } catch (EntradaInvalidaException e) {
            JOptionPane.showMessageDialog(this, "Nome de personagem inválido: " + e.getMessage());
            personagemNome = "Personagem anônimo";
        }

        JButton assassinBotao = new JButton("Assassino");
        JButton mageBotao = new JButton("Mago");

        painelAssassino = new JPanel();
        painelMago = new JPanel();

        retornoLabel = new JLabel("", SwingConstants.CENTER);
        painelTexto = new JPanel(new BorderLayout());
        painelTexto.add(retornoLabel, BorderLayout.CENTER);

        painelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        painelPrincipal.add(assassinBotao, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        painelPrincipal.add(mageBotao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        painelPrincipal.add(painelTexto, gbc);

        assassinBotao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Assassino assassino = criarAssassino(personagemNome);
                    JOptionPane.showMessageDialog(JogoGUI.this, assassino.getNome() + " o assassino!");
                    retornoLabel.setText(assassino.falar());

                    JFrame janelaAssassino = new JFrame("Assassino");
                    janelaAssassino.setSize(400, 300);
                    janelaAssassino.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JLabel labelAssassino = new JLabel(assassino.descansar());
                    janelaAssassino.setLayout(new FlowLayout());
                    janelaAssassino.add(labelAssassino);

                    JButton showInvent = new JButton("Mostrar itens");
                    showInvent.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            assassino.showItens();
                        }
                    });

                    janelaAssassino.add(showInvent);

                    janelaAssassino.setVisible(true);
                    painelPrincipal.setVisible(false);
                }catch(AssassinoException ex){
                    ex.printStackTrace();
                }
            }
        });

        mageBotao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Mago mago = criarMago(personagemNome);
                    JOptionPane.showMessageDialog(JogoGUI.this, mago.getNome() + " o mago!");
                    retornoLabel.setText(mago.falar());

                    JFrame janelaMago = new JFrame("Mago");
                    janelaMago.setSize(400, 300);
                    janelaMago.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JLabel labelMago = new JLabel(mago.descansar());
                    janelaMago.setLayout(new FlowLayout());
                    janelaMago.add(labelMago);

                    JButton showInvent = new JButton("Mostrar itens");
                    showInvent.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            mago.showItens();
                        }
                    });

                    janelaMago.add(showInvent);

                    janelaMago.setVisible(true);
                    painelPrincipal.setVisible(false);
                }catch(MagoException ex){
                    ex.printStackTrace();
                }
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 2;
        painelPrincipal.add(painelAssassino, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        painelPrincipal.add(painelMago, gbc);
    }

    public void exibir() {
        setVisible(true);
    }

     private String obterNomePersonagem() throws EntradaInvalidaException {
        String nome = JOptionPane.showInputDialog("Insira o nome do seu personagem:");
        if (nome == null || nome.trim().isEmpty()){
            throw new EntradaInvalidaException("O nome do personagem será criado como 'Anônimo'.");
        }
        return nome;
    }

    private Assassino criarAssassino(String nome) throws AssassinoException{
        try{
            return new Assassino(nome, 300, 300);
        }catch(Exception e){
            throw new AssassinoException("Erro ao criar novo assassino: " + e.getMessage());
        }
    }

    private Mago criarMago(String nome) throws MagoException{
        try{
            return new Mago(nome, 338, 302);
        }catch(Exception e){
            throw new MagoException("Erro ao criar novo mago: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        JogoGUI jogo = new JogoGUI();
        jogo.exibir();
    }
}
