
package projetopessoa;

/**
 *
 * @author Charllys Brauwol
 */
public class ProjetoPessoa {

    
    public static void main(String[] args) {
        Professor leonardo = new Professor("Leonardo", 1996, 'M', "Mombacense");
        leonardo.calcularIdade(2022);
        leonardo.setAnosExperiencia(5);
        leonardo.setMatricula(123);
        leonardo.setNaturalidade("Mombacense");
        leonardo.setNivelGraduacao("Graduado");
        leonardo.exibirProfessor();
        leonardo.verificarAposentadoria();
        
        Aluno joao = new Aluno("João Pedro", 1996, 'M', "Mombacense");
        joao.setCurso("Informática");
        joao.setSemestre("2 Semestre");
        joao.setNaturalidade("Mombacense");
        joao.exibirAluno();
        
    }
    
}
