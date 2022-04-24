
package projetolocadora;

/**
 *
 * @author Charllys e Jonas
 */
public class Infantil extends Filmes{

    public Infantil(String titulo, String categoria) {
        super(titulo, categoria);
    }
    
    public float valor(){
        return this.getPreco() + 2.00f;
    }
}
