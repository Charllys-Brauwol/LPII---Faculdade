
package produtoslivraria;

/**
 *
 * @author Charllys Brauwol
 */
public class ProdutosLivraria {

    public static void main(String[] args) {
        Livro cod0001 = new Livro("J. K. Rowling", 208, "Harry Potter e a Pedra Filosofal", 24.00);
        cod0001.informacoes();
        cod0001.caro();
        
        Livro cod0002 = new Livro("Mauricio Samy Silva", 304, "Fundamentos de HTML5 e CSS3", 41.96);
        cod0002.informacoes();
        cod0002.caro();
        
        Cd cod0003 = new Cd(14, "E O Tchan", "E O Tchan 10 anos", 27.55);
        cod0003.informacoes();
        cod0003.caro();
        
        Cd cod0004 = new Cd(18, "Calcinha Preta", "Cd Calcinha Prata Vol. 15", 21.99);
        cod0004.informacoes();
        cod0004.caro();
        
        Dvd cod0005 = new Dvd(120, "Racionais", "1000 Trutas 1000 Tretas", 44.99);
        cod0005.informacoes();
        cod0005.caro();
        
        Dvd cod0006 = new Dvd(133, "Fabio Jr.", "Minha Historia", 33.21);
        cod0006.informacoes();
        cod0006.caro();
        
        
    }
    
}