package animal;

/**
 *
 * @author charl
 */
public class Cobra extends AnimalPoli{
    private boolean venenosa;

    public Cobra(boolean venenosa, String cor, double tamanho) {
        super(cor, tamanho);
        this.venenosa = venenosa;
    }
    
    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    @Override
    public void locomover(){
        System.out.println("A cobra rastreou!");
    }
    
}
