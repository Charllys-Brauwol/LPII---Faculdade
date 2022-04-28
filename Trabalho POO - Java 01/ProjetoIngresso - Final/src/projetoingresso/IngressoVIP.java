
package projetoingresso;

/**
 *
 * @author Charllys e Jonas
 */
public class IngressoVIP extends Ingresso {
    private float adcVip;  
    private float diferenca;
    @Override
    public void imprimirValor(){
        adcVip = this.getValor() + 10.00f; 
        System.out.println("O valor do Ingresso VIP e: " + adcVip);
        diferenca = adcVip - this.getValor();
        System.out.println("A diferenca do Ingresso VIP para o normal e: " + diferenca);
    }
   
    
    
    
}

