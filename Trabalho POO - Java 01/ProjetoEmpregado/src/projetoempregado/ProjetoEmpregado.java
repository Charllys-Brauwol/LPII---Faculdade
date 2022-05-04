package projetoempregado;

/**
 *
 * @author Charllys Brauwol
 */
public class ProjetoEmpregado {

    public static void main(String[] args) {
        Horista h = new Horista(25, 100, "Pedro", "Chico", "123");
        System.out.println(h.getNome() + " RECEBE " + h.vencimento());
        System.out.println("====================");
        
        Comissionado b = new Comissionado(50000, 5, "Chiquinho", "Fco", "123");
        System.out.println(b.getNome() + " RECEBE " + b.vencimento());
        System.out.println("====================");
        
        Assalariado a = new Assalariado(1500, "Pedrinho", "Corrinho", "123");
        System.out.println(a.getNome() + " RECEBE " + a.vencimento());
    }
    
}
