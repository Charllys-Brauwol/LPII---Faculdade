package animal;

/**
 *
 * @author charl
 */
public class Peixe extends AnimalPoli{
    private int qtdNadadeira;

    public Peixe(int qtdNadadeira, String cor, double tamanho) {
        super(cor, tamanho);
        this.qtdNadadeira = qtdNadadeira;
    }
    
    public int getQtdNadadeira() {
        return qtdNadadeira;
    }

    public void setQtdNadadeira(int qtdNadadeira) {
        this.qtdNadadeira = qtdNadadeira;
    }
    
    
    @Override
    public void locomover(){
        System.out.println("o peixe nada!");
    }
    
}
