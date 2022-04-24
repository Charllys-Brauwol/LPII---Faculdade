
package projetoingresso;

/**
 *
 * @author Charllys e Jonas
 */
public class Ingresso {
    float valor = 30.00f;
    
    public void imprimirValor(){
        System.out.println("O valor é: " + valor);
    }
    
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
