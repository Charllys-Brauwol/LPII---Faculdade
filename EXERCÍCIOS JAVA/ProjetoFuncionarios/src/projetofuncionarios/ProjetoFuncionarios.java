
package projetofuncionarios;

/**
 *
 * @author Charllys Brauwol
 */
public class ProjetoFuncionarios {

    public static void main(String[] args) {
        Empregado jose = new Empregado("Jose", "Pereira", "43567");
        jose.vencimento();
        
        Assalariado pedro = new Assalariado("Pedro", "Cavalcante", "34567");
        pedro.vencimento();
        
        Comissionado arthur = new Comissionado(10, 5, "Arthur", "Cabral", "2345");
        arthur.vencimento();
    }
    
}
