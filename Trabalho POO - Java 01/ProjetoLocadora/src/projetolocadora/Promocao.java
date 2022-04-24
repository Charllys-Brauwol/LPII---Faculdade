
package projetolocadora;

/**
 *
 * @author Charllys e Jonas
 */
public class Promocao extends Filmes{

    public Promocao(String titulo, String categoria) {
        super(titulo, categoria);
    }
    
    public float valor(){
        return this.getPreco() - 2.00f;
    }
}
