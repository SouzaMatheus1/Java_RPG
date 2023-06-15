import java.io.File;
import java.util.ArrayList;
import com.thoughtworks.xtream.Xstream;

// FUNCIONALIDADE EM TESTE
// TENTANDO FAZER XSTREAM FUNCIONAR
public class AssassinoP{
    public static ArrayList<Assassino> lista = new ArrayList<Assassino>();

    String nome;
    public AssassinoP(){
        this.nome = " ";
    }

    public static void inserir(Assassino novoAssassino){
        lerXml();
        lista.add(novoAssassino);
        salvarXml();
    }

    public void alterar (Assassino AssassinoAlterado){
        excluir(AssassinoAlterado.getNome());
        inserir(AssassinoAlterado);
    }

    public static void excluir(String nome) {
        lerXml();
        for(int i = 0; i < lista.size(); i++) {
            Assassino cadaAssassino = lista.get(i);
            if (cadaAssassino.getNome() == nome){
                lista.remove(i);
                break;
            }
        }
        salvarXml();
    }

    public static ArrayList<Assassino> listar(){
        ArrayList<Assassino> listar = lerXml();
        return listar;
    }

//pega o que esta em xml e coloca na lista
    public static ArrayList<Assassino> lerXml(){
        File arquivo = new File("/home/matheus/Documentos/GitHub/PJBL_POO/");
        if (arquivo.exists()){
            XStream xstream = new XStream();
            xstream.alias("Personagens", Assassino.class);
            lista = (ArrayList<Assassino>) xstream.fromXML(arquivo)
        }else{
            lista = new ArrayList<Assassino>();
        }
        return lista;
    }
//pega o que esta na lista e salva em xml
    public static void salvarXml(){
        XStream xstream = new XStream();
        xstream.alias("Personagens", Assassino.class);
        try{
            FileWrite escritor = new FileWrite("C:\Users\MSI\Desktop\\Registro.xml");
            escritor.write( xstream.toXML(lista)  );
            escritor.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
} 
