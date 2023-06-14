/*
public class AssassinoP{
    public ArrayList<Asssassino> lista = new ArrayList<Asssassino>();


    public static void inserir(Asssassino novoAssassino){
        lerXml();
        lista.add(novoAssassino);
        salvarXml();
    }

    public void alterar (Asssassino AssassinoAlterado){
        excluir(AssassinoAlterado.getCodigo);
        inserir(AssassinoAlterado);
    }

    public static void excluir(int Codigo) {
        lerXml();
        for(int = o; i < lista.size(); i++) {
            Asssassino cadaAssassino = lista.get(i);
            if (cadaAssassino.getCodigo () == codigo){
                lista.remove(i);
                break;
            }
        }
        salvarXml();
    }

    public static ArrayList<Asssassino> listar(){
        lerXml();
        return listar;
    }

    public static ArrayList<Asssassino> listar {
        lerXml();
        return lista;
    }
//pega o que esta em xml e coloca na lista
    public static void lerXml(){
        File arquivo = new File("C:\Users\MSI\Desktop\\Registro.xml");
        if (arquivo.exists()){
            XStream xstream = new XStream();
            xstream.alias("Personagens", Asssassino.class);
            lista = (ArrayList<Asssassino>) xstream.fromXML(arquivo)
        }else{
            lista = new ArrayList<Asssassino>();
        }
    }
//pega o que esta na lista e salva em xml
    public static void salvarXml(){
        XStream xstream = new XStream();
        xstream.alias("Personagens", Asssassino.class);
        try{
            FileWrite escritor = new FileWrite("C:\Users\MSI\Desktop\\Registro.xml");
            escritor.write( xstream.toXML(lista)  );
            escritor.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
} 

