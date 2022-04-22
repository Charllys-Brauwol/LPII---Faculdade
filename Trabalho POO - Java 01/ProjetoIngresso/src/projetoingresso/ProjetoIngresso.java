
package projetoingresso;

/**
 *
 * @author Charllys e Jonas
 */
public class ProjetoIngresso {

    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso();
        ingressoNormal.imprimirValor();
        
        IngressoVIP ingressoVIP = new IngressoVIP();
        ingressoVIP.imprimirValor();
    }
    
}
