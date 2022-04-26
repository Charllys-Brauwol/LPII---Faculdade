package projetojogador;

public class Jogador {

    private String nome;
    private String posicao;
    private int anoNasc;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, int anoNasc, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoNasc = anoNasc;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

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

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int dataNasc) {
        this.anoNasc = dataNasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.getAnoNasc();
    }

    public void imprimirDados() {
        System.out.println(""
                + "\nNome: " + this.getNome()
                + "\nPosicao: " + this.getPosicao()
                + "\nAno de Nascimento: " + this.getAnoNasc()
                + "\nNacionalidade: " + this.getNacionalidade()
                + "\nAltura: " + this.getAltura()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.calcularIdade(2022)
        );
    }

    public void verificarAposentadoria() {
        int idadeAtual = this.calcularIdade(2022);
        if (this.getPosicao() == "Defensor" && idadeAtual < 40) {
            int faltam = 40 - idadeAtual;
            System.out.println("Faltam " + faltam + " ANOS PARA SUA APOSENTADORIA");
        } 
        else if (this.getPosicao() == "Meio Campo" && idadeAtual < 38) {
            int faltam = 38 - idadeAtual;
            System.out.println("Faltam " + faltam + " ANOS PARA SUA APOSENTADORIA");
        } 
        else if (this.getPosicao() == "Atacante" && idadeAtual < 35) {
            int faltam = 35 - idadeAtual;
            System.out.println("Faltam " + faltam + " ANOS PARA SUA APOSENTADORIA");
        }
        else {
            System.out.println("JOGADOR APOSENTADO");
        }
        
    }
}
