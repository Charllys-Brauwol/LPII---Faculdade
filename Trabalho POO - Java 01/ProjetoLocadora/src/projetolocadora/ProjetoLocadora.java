
package projetolocadora;

/**
 *
 * @author Charllys e Jonas
 * Crie um programa para um sistema de locação de filmes digitais.
 */
public class ProjetoLocadora {

    public static void main(String[] args) {
       
        Filmes cod01 = new Filmes("De Volta pro Futuro.", "Geral");
        cod01.imprimir();
        
        Lancamentos cod02 = new Lancamentos("A Era do Gelo 5", "Lancamento");
        cod02.imprimir();
        
        Promocao cod03 = new Promocao("A Mumia", "Promocao");
        cod03.imprimir();
        
        Infantil cod04 = new Infantil("Barbie", "Infantil");
        cod04.imprimir();
    }
    
}
