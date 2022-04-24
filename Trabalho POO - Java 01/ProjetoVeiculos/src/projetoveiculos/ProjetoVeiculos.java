
package projetoveiculos;

/**
 *
 * @author Charllys e Jonas
 */
public class ProjetoVeiculos {

    public static void main(String[] args) {
        Motocicleta fan = new Motocicleta (150, "NNQ-59L0", 2009);
        fan.exibirDados();
        
        Onibus mercedes = new Onibus(45, "GSD-23F5", 2005);
        mercedes.exibirDados();
        
        Caminhao iveco = new Caminhao(3, "XDS-56D8", 2020);
        iveco.exibirDados();
    }
    
}
