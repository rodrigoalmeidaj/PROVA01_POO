public class Equipe {
    // ATRIBUTOS
    private String nomeDaEquipe;
    private int qtdMembros;
    private String localizacao;
    private String nomeDaCompeticao;

    //METODO CONTRUTOR
    public Equipe(String nomeDaEquipe, int qtdMembros, String localizacao){
        this.nomeDaEquipe = nomeDaEquipe;
        this.qtdMembros = qtdMembros;
        this.localizacao = localizacao;
        this.nomeDaCompeticao = "SMITE World Championship";
    }

    // METODOS ESPECÍFICOS DA CLASSE (NÃO ESSENCIAIS).
    public void contratar(){
        System.out.println("A Equipe "+nomeDaEquipe+ " contratou um Pro player. ");
    }

    public void competir(){
        if(qtdMembros < 5){
            desclassificar();
        }else
        System.out.println("A equipe "+nomeDaEquipe+ " está competindo no "+nomeDaCompeticao);
    }

    public void ganhar(){
        System.out.println("A equipe "+ nomeDaEquipe+ " ganhou.");
    }

    //METODO PRIVADO
    private void desclassificar(){
        System.out.println("A equipe "+nomeDaEquipe+ " está desclassificada por falta de jogadores.");
    }


    // METODOS GETTERS E SETTERS, USANDO CAMELCASE (aAa)
    public String getNomeDaEquipe(){
        return this.nomeDaEquipe;
    }
    public int getQtdMembros(){
        return this.qtdMembros;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }
    //setters, como nao retornam nada, sao void
    public void setNomeDaEquipe(String nomeDaEquipe){
        this.nomeDaEquipe = nomeDaEquipe;
    }
    public void setQtdMembros(int qtdMembros){
        this.qtdMembros = qtdMembros;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
}
