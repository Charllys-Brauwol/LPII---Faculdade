
package projetopessoa;

/**
 *
 * @author Charllys Brauwol
 */
public class Professor extends Pessoal{
    private int matricula;
    private String nivelGraduacao;
    private int anosExperiencia;

    public Professor(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void somarExperiencia(int anos){
        this.setAnosExperiencia(getAnosExperiencia() + anos);
    }
    
    public void exibirProfessor(){
        System.out.println(""
                + "Nome: " + this.getNome()
                + "\nSexo: " + this.getSexo()
                + "\nNaturalidade: " + this.getNaturalidade()
                + "\nAno de Nascimento" + this.getAnoNascimento()
                + "\nMatricula: " + this.getMatricula()
                + "\nNivel de Graduação: " + this.getNivelGraduacao()
                + "\nAnos de Experiencia: " + this.getAnosExperiencia()
                + "\nIdade: " + this.calcularIdade(2022));
    }
    
    public void exibirAnosExperiencia(){
        System.out.println("O professor " + this.getNome() + 
                "tem " + this.getAnoNascimento() +
                "anos de experiencia.");
    }
    
    public void verificarAposentadoria(){
        int totalAnosAposentadoria = this.calcularIdade(2022)+ this.getAnosExperiencia();
        if(this.getSexo() == 'M'){
            if(totalAnosAposentadoria < 90){
                int faltam = 90 - totalAnosAposentadoria;
                System.out.println("Faltam " + faltam + " anos para sua aposentadoria.");
            }else{
                System.out.println("Você já pode se aposentar!");
            }
        }else if(this.getSexo() == 'F'){
            if(totalAnosAposentadoria < 85){
                int faltam = 85 - totalAnosAposentadoria;
                System.out.println("Faltam " + faltam + " anos para sua aposentadoria.");
            }
        }else{
            System.out.println("Sexo inválido!");
        }
    }
}
