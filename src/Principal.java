public class Principal {
    public static void main(String[] args) throws Exception {

        //INSTANCIANDO E PRINTANDO AS INFORMAÇÕES DA CLASSE JOGO
        Jogo jogo = new Jogo("SMITE", "Moba", "Ranked Conquista");

        System.out.println("--- Jogo ---");
        System.out.println("Nome do Jogo: "+jogo.getNomeDoJogo());
        System.out.println("Estilo do Jogo: "+jogo.getEstiloDoJogo());
        System.out.println("Modo do Jogo: "+jogo.getModoDoJogo());
        System.out.println("Multiplayer: "+jogo.getMultiplayer());

        jogo.iniciar();
        jogo.logar();
        jogo.recolherRecompensas();

        //INSTANCIANDO E PRINTANDO AS INFORMAÇÕES DA CLASSE JOGADOR
        Jogador jogador = new Jogador("Kennet Ros",23, "Adapting", "Jungle");

        System.out.println("--- Player ---");
        System.out.println("Nome: "+jogador.getNome());
        System.out.println("Idade: "+jogador.getIdade() + " anos.");
        System.out.println("NickName: "+jogador.getApelido());

        jogador.jogar();
        jogador.escolherGod();
        jogador.surrender();

        //INSTANCIANDO E PRINTANDO AS INFORMAÇÕES DA CLASSE EQUIPE
        Equipe equipe = new Equipe("Radiance", 7, "United States");

        System.out.println("--- Equipe ---");
        System.out.println("Nome da Equipe: "+equipe.getNomeDaEquipe());
        System.out.println("Quantidade de Membros: "+equipe.getQtdMembros());
        System.out.println("Localização: "+equipe.getLocalizacao());

        equipe.contratar();
        equipe.competir();
        equipe.ganhar();
        System.out.println("-----------");
        equipe.setQtdMembros(4);
        equipe.competir();
    }
}
