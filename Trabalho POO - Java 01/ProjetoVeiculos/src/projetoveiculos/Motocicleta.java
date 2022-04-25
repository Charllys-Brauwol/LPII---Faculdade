
package projetoveiculos;

/**
 *
 * @author Charllys e Jonas
 */
public class Motocicleta extends Veiculos{
    
    private int cilindradas;    

    public Motocicleta(int cilindradas, String placa, int ano) {
        super(placa, ano);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public void exibirDados(){
        System.out.println("A moto placa: " + this.getPlaca() +
                            "\nAno: " + this.getAno() +
                            "\nTem " + this.getCilindradas() + " cilidradas!\n");
    }
    
}
