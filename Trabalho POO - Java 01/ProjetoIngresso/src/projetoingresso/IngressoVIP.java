
package projetoingresso;

/**
 *
 * @author Charllys e Jonas
 */
public class IngressoVIP extends Ingresso {
    
    

    public IngressoVIP() {
        this.valor = (float) (this.valor + 10.00);
    }

    public float getValorVip() {
        return valor;
    }

    public void setValorVip(float valor) {
        this.valor = valor;
    }
    
    
    
}

