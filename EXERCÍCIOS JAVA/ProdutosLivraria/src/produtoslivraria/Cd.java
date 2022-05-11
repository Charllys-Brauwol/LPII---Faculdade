
package produtoslivraria;

/**
 *
 * @author Charllys brauwol
 */
public class Cd extends Midia{
    private int faixas;

    public Cd(int faixas, String artista, String titulo, double preco) {
        super(artista, titulo, preco);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
    
    public void informacoes(){
        System.out.println("Titulo: " + this.getTitulo() +
                            "\nArtista: " + this.getArtista() +
                            "\nQTD de Faixas: " + this.getFaixas() +
                            "\nValor Total: " + this.getPreco());
    }
    
    @Override
    public void caro() {
        if(this.getPreco() >= 25.00){
            System.out.println("Esse Produto Tem Um Valor Caro\n");
        }else{
            System.out.println("Esse Produto Tem Um Valor Barato\n");
        }
        }
}
