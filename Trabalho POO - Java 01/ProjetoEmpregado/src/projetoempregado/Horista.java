package projetoempregado;

/**
 *
 * @author Charllys Brauwol
 */
public class Horista extends Empregado {

    private double precoHoras;
    private double horasTrabalhadas;

    public Horista(double precoHoras, double horasTrabalhadas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.precoHoras = precoHoras;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHoras() {
        return precoHoras;
    }

    public void setPrecoHoras(double precoHoras) {
        this.precoHoras = precoHoras;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
        return this.getHorasTrabalhadas()*this.getPrecoHoras();
    }
    
    @Override
    public void exibir() {
        System.out.println("VALOR DA HORA: " + this.getPrecoHoras());
        System.out.println("TOTAL DE HORAS TABALHADAS " + this.getHorasTrabalhadas());
    }
}
