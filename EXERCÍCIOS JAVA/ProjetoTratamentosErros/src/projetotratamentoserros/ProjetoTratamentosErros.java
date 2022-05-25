
package projetotratamentoserros;

import java.util.Scanner;

/**
 *
 * @author Charllys Brauwol
 */
public class ProjetoTratamentosErros {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);      
        
        try {
            System.out.println("Informe um numero:");
            double num1 = en.nextDouble();
            System.out.println("Informe o segundo numero:");
            double num2 = en.nextDouble();
            double resultado = calcular(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e){
            System.out.println("Informe valores validos");
        }
        
    }
    
    public static double calcular(double num1, double num2){
    return num1 / num2;
}
}
