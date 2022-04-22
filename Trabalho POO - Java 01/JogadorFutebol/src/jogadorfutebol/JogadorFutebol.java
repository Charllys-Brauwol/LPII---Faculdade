package jogadorfutebol;

/**
 *
 * @author Charllys Brauwol
 */
public class JogadorFutebol {

    private String nome;
    private String posicao;
    private int nascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void exibirJogador() {
        System.out.println("O jogador: " + nome
                + "\nPosicao: " + posicao
                + "\nNascido no ano: " + nascimento
                + "\nNascionalidade: " + nacionalidade
                + "\nAltura: " + altura
                + "\nPeso: " + peso);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.getNascimento();
    }

    public void aposentadoria() {
        int aposentadoriaJogador = this.calcularIdade(2022);
        if(this.posicao == "defesa"){
            if(aposentadoriaJogador < 40){
                int faltam = 40 - aposentadoriaJogador;
                System.out.println("Faltam " + faltam + "anos para se aposentar.");
            }else{
                System.out.println("Jogador Aposentado.");
            }
        }else if(this.posicao == "meio"){
            if(aposentadoriaJogador < 38){
                int faltam = 38 - aposentadoriaJogador;
                System.out.println("Faltam " + faltam + "anos para se aposentar."); 
            }else{
                System.out.println("Jogador Aposentado.");
            }
        }else if(this.posicao == "atacante"){
            if(aposentadoriaJogador < 35){
                int faltam = 35 - aposentadoriaJogador;
                System.out.println("Faltam " + faltam + "anos para se aposentar.");
            }else{
                System.out.println("Jogador Aposentado.");
            }
        }else{
            System.out.println("Posicao Invalida!");
        }
    }
}
