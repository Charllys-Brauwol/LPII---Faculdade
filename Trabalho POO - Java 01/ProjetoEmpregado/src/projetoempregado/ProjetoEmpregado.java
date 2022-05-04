package projetoempregado;

/**
 *
 * @author Charllys Brauwol
 */
public class ProjetoEmpregado {

    public static void main(String[] args) {
        Assalariado a = new Assalariado(1400, "Joao ", "Da Silva", "123");
        System.out.println(a.getNome() + a.getSobrenome() + " RECEBE UM SALARIO DE " + a.vencimento() + " E POSSUI O CPF" + a.getCpf());
        System.out.println("====================");
        
        Comissionado b = new Comissionado(1500, 5, "Joao", "Da Silva", "123");
        System.out.println(a.getNome() + a.getSobrenome() + " RECEBE UM SALARIO DE " + a.vencimento() + " E POSSUI O CPF" + a.getCpf());
        b.exibir();
        System.out.println("====================");
        
        Horista h = new Horista(25, 100, "Joao", "Da Silva", "123");
        System.out.println(a.getNome() + a.getSobrenome() + " RECEBE UM SALARIO DE " + a.vencimento() + " E POSSUI O CPF" + a.getCpf());
        h.exibir();
        
        
        
    }
    
}
