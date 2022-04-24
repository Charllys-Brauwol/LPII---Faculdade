
package projetolocadora;

/**
 *
 * @author Chartllys e Jonas
 */
public class Lancamentos extends Filmes{

    public Lancamentos(String titulo, String categoria) {
        super(titulo, categoria);
    }
    
    public float valor(){
        return this.getPreco() + 3.00f;
    }
    
}
