package projetojogador;

public class ProjetoJogador {

    public static void main(String[] args) {
        Jogador novo = new Jogador("Jonas", "Defensor", 2000, "Brasileiro", 1.64, 63.56);
        novo.imprimirDados();
        novo.verificarAposentadoria();

        Jogador novo2 = new Jogador("Luccas", "Meio Campo", 1992, "Italiano", 1.74, 71.46);
        novo2.imprimirDados();
        novo2.verificarAposentadoria();

        Jogador novo3 = new Jogador("Antony", "Atacante", 1988, "Frances", 1.68, 77.21);
        novo3.imprimirDados();
        novo3.verificarAposentadoria();

        Jogador novo4 = new Jogador("Ronaldo", "Defensor", 1978, "Alemao", 1.93, 93.36);
        novo4.imprimirDados();
        novo4.verificarAposentadoria();

    }
}
