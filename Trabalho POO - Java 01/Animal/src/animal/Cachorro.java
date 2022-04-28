
package animal;

/**
 *
 * @author charl
 */
public class Cachorro extends AnimalPoli{
    private String raca;

    public Cachorro(String raca, String cor, double tamanho) {
        super(cor, tamanho);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void latir(){
        System.out.println("Au Au Au!");
    }
    
    @Override
    public void locomover(){
        System.out.println("O cachorro correu!");
    }
    
     public void exibir(){
        super.exibir();
        System.out.println();
    }
    
}
