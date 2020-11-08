public class Jogo {
    // ATRIBUTOS
    private String nomeDoJogo;
    private String estiloDoJogo;
    private String modoDoJogo;
    private boolean multiplayer;

    //METODO CONTRUTOR
    public Jogo(String nomeDoJogo, String estiloDoJogo, String modoDoJogo){
        this.nomeDoJogo = nomeDoJogo;
        this.estiloDoJogo = estiloDoJogo;
        this.modoDoJogo = modoDoJogo;
        this.multiplayer = true;
    }

    // METODOS ESPECÍFICOS DA CLASSE (NÃO ESSENCIAIS).
    public void iniciar(){
        System.out.println("O jogo abriu.");
    }
    public void logar(){
        criarConta();
        System.out.println("Você está logado.");
    }
    public void recolherRecompensas(){
        System.out.println("Você recebeu suas Gemas.");
    }
    //METODO PRIVADO
    private void criarConta(){
        System.out.println("Conta criada.");
    }

    // METODOS GETTERS E SETTERS, USANDO CAMELCASE (aAa)
    public String getNomeDoJogo(){
        return this.nomeDoJogo;
    }
    public String getEstiloDoJogo(){
        return this.estiloDoJogo;
    }
    public String getModoDoJogo(){
        return this.modoDoJogo;
    }
    public boolean getMultiplayer(){
        return this.multiplayer;
    }

    //setters, como nao retornam nada, sao void
    public void setNomeDoJogo(String nomeDoJogo){
        this.nomeDoJogo = nomeDoJogo;
    }
    public void setEstiloDoJogo(String estiloDoJogo){
        this.estiloDoJogo = estiloDoJogo;
    }
    public void setModoDoJogo(String modoDoJogo){
        this.modoDoJogo = modoDoJogo;
    }
    public void setMultiplayer(Boolean multiplayer){
        this.multiplayer = true;
    }
}