
package projetoveiculos;

/**
 *
 * @author Charllys e Jonas
 */
public class Onibus extends Veiculos{
    
    private int assentos;

    public Onibus(int assentos, String placa, int ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    public void exibirDados(){
        System.out.println("O onibus placa: " + this.getPlaca() + 
                            "\nAno: " + this.getAno() +
                            "\nTem: " + this.getAssentos() + " assentos.\n");
    }
}
