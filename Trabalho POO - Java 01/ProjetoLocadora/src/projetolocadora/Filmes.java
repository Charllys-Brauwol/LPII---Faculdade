
package projetolocadora;

/**
 *
 * @author Charllys e Jonas
 */
public class Filmes {
    private String titulo;
    private String categoria;
    private float preco = 4.00f;

    public Filmes(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float valor(){
        return this.getPreco();
    }
    
    public void imprimir(){
        System.out.println("Filme: " +this.titulo+
                            "\nCategorai: " +this.categoria+
                            "\nValor: " +valor()+
                            "\n");
    }
}
