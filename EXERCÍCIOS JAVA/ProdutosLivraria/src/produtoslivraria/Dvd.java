
package produtoslivraria;

/**
 *
 * @author Charllys Brauwol
 */
public class Dvd extends Midia{
    private double duracao;

    public Dvd(double duracao, String artista, String titulo, double preco) {
        super(artista, titulo, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public void informacoes(){
        System.out.println("\nTitulo: " + this.getTitulo() +
                            "\nArtista: " + this.getArtista() +
                            "\nDuracao em minutos: " + this.getDuracao()+
                            "\nValor Total: " + this.getPreco());
    }
    
    @Override
    public void caro() {
        if(this.getPreco() >= 35.00){
            System.out.println("Esse Produto Tem Um Valor Caro\n");
        }else{
            System.out.println("Esse Produto Tem Um Valor Barato\n");
        }
        }
}
