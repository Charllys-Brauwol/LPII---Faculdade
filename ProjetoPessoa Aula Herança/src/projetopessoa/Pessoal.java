
package projetopessoa;

/**
 *
 * @author Charllys
 */
public class Pessoal {
    private String nome;
    private int anoNascimento;
    private char sexo;
    private String naturalidade;

    public Pessoal(String nome, int anoNascimento, char sexo, String naturalidade) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    
    public int calcularIdade (int anoAtual){
        return anoAtual - this.getAnoNascimento();
    }
    
}
