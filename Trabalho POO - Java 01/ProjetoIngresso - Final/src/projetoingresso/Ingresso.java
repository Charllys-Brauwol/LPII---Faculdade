
package projetoingresso;

/**
 *
 * @author Charllys e Jonas
 */
public class Ingresso {
    private float valor = 30.00f;
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float valor() {
        return this.getValor();
    }
    
    public void imprimirValor(){
        System.out.println("O valor e: " + this.getValor());
    }
    
    
}
