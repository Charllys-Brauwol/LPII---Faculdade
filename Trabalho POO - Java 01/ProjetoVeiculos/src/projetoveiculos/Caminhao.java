
package projetoveiculos;

/**
 *
 * @author Charllys e Jonas
 */
public class Caminhao extends Veiculos{
    
    private int eixos;

    public Caminhao(int eixos, String placa, int ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    public void exibirDados(){
        System.out.println("O caminhao placa: " + this.getPlaca() + 
                            "\nAno: " + this.getAno() +
                            "\nTem: " + this.getEixos() + " eixos.\n");
    }
}
