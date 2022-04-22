
package jogadorfutebol;

/**
 *
 * @author Charllys Brauwol
 */
public class Jogador {

    public static void main(String[] args) {
        JogadorFutebol charllys = new JogadorFutebol();
        charllys.setNome("Charllys");
        charllys.setPosicao("defesa");
        charllys.setNascimento(1993);
        charllys.setNacionalidade("Brasileira");
        charllys.setAltura((float) 1.65);
        charllys.setPeso((float) 75.0);
        charllys.exibirJogador();
        charllys.aposentadoria();
        
        JogadorFutebol jonas = new JogadorFutebol();
        charllys.setNome("Jonas");
        charllys.setPosicao("atacante");
        charllys.setNascimento(1995);
        charllys.setNacionalidade("Brasileira");
        charllys.setAltura((float) 1.65);
        charllys.setPeso((float) 70.0);
        charllys.exibirJogador();
        charllys.aposentadoria();
    }
    
}
