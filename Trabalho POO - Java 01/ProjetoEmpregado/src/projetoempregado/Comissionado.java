
package projetoempregado;

/**
 *
 * @author Charllys Brauwol
 */
public class Comissionado extends Empregado{
    private double totalVendas;
    private double taxasComissao;

    public Comissionado(double totalVendas, double taxasComissao, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.totalVendas = totalVendas;
        this.taxasComissao = taxasComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxasComissao() {
        return taxasComissao;
    }

    public void setTaxasComissao(double taxasComissao) {
        this.taxasComissao = taxasComissao;
    }
    
    @Override
    public double vencimento() {
        double salario = (this.getTotalVendas()/100)*this.getTaxasComissao();
        return salario;
    }
    
    
}
