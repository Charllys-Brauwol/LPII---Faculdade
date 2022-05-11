
package projetofuncionarios;

/**
 *
 * @author Charllys Brauwol
 */
public class Comissionado extends Empregado{
    private double totalVenda;
    private double taxaComissao;
    private double totalSalario;

    public Comissionado(double totalVenda, double taxaComissao, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    

    public double getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSalario(double totalSalario) {
        this.totalSalario = totalSalario;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public double vencimento(){
        this.totalSalario = (this.getTaxaComissao() * this.getTotalVenda());
        super.vencimento();
        System.out.println("" + this.getTotalSalario());
        return 0;
    }
}
