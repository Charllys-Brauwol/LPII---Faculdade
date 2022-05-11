
package produtoslivraria;

/**
 *
 * @author Charllys Brauwol
 */
public class Livro extends Produtos{
    private String autor;
    private int paginas;

    public Livro(String autor, int paginas, String titulo, double preco) {
        super(titulo, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    @Override
    public void caro() {
        if(this.getPreco() >= 30.00){
            System.out.println("Esse Produto Tem Um Valor Caro\n");
        }else{
            System.out.println("Esse Produto Tem Um Valor Barato\n");
        }
    }
    
    public void informacoes(){
        System.out.println("Titulo: " + this.getTitulo() +
                            "\nEscritora: " + this.getAutor() +
                            "\nTotal de Paginas: " + this.getPaginas() +
                            "\nValor Total: " + this.getPreco());
    }
    
    
}
