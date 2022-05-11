
package produtoslivraria;

/**
 *
 * @author Charllys brauwol
 */
public class Midia extends Produtos{
    private String artista;

    public Midia(String artista, String titulo, double preco) {
        super(titulo, preco);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
 
    @Override
    public void caro() {
        }
    
}
