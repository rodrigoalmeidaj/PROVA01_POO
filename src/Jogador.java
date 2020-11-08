public class Jogador {
    // ATRIBUTOS
    private String nome;
    private int idade;
    private String apelido;
    private String role;

    //METODO CONTRUTOR
    public Jogador(String nome, int idade, String apelido, String role){
        this.nome = nome;
        this.idade = idade;
        this.apelido = apelido;
        this.role = role;
    }

    // METODOS ESPECÍFICOS DA CLASSE (NÃO ESSENCIAIS).
    public void jogar(){
        System.out.println("O jogador está jogando");
    }

    public void escolherGod(){
        System.out.println("O jogador " + apelido + " escolheu o GOD.");
    }

    public void surrender(){
        feedar();
        System.out.println("O jogador " + apelido + " se rendeu após feedar.");
    }

    //METODO PRIVADO
    private void feedar(){
        System.out.println("DA F6 AÍ, NAMORAL...");
    }


    // METODOS GETTERS E SETTERS, USANDO CAMELCASE (aAa)
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getApelido(){
        return this.apelido;
    }
    public String getRole(){
        return this.role;
    }
    //setters, como nao retornam nada, sao void
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    public void setRole(String role){
        this.role = role;
    }
}
