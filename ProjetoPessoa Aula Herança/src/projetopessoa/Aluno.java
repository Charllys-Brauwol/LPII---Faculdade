
package projetopessoa;

/**
 *
 * @author Charllys Brauwol
 */
public class Aluno extends Pessoal{
    private int matricula;
    private String semestre;
    private String curso;

    public Aluno(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void verCurso(){
        System.out.println("O aluno" + this.getNome() + " cursa " + this.getCurso());
    }
    
    public void exibirAluno(){
        System.out.println("Nome: " + this.getNome() +
                            "\nSexo: " + this.getSexo() +
                            "\nCidade: " + this.getNaturalidade());
    }
}


