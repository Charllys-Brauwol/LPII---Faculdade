
package projetofuncionarios;

/**
 *
 * @author Charllys Brauwol
 */
public class Assalariado extends Empregado{
    private double salario = 2000.00;

    public Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double vencimento(){
        System.out.println("" + this.getSalario());
        return 0;
    }
    
    
}
