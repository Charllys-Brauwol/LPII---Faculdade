package animal;

/**
 *
 * @author charl
 */
public class Ave extends AnimalPoli{
    private double tamanhoBico;

    public Ave(double tamanhoBico, String cor, double tamanho) {
        super(cor, tamanho);
        this.tamanhoBico = tamanhoBico;
    }

    public double getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(double tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
    
    @Override
    public void locomover(){
        System.out.println("A ave voa!");
    }
}
