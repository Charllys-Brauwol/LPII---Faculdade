/**
 * Crie uma classe java NumeroDecrescente que contenha um método que receba um
 * número inteiro e imprima, em ordem decrescente, o valor do número até 0
 */
package numerodecrescente;

import java.util.Scanner;

/**
 *
 * @author Charllys Brauwol
 */
public class NumeroDecrescente {

    public static void main(String[] args) {
        //Declaração de Váriavéis
        int numero;
        int i;

        //Metódos de Entrada de Dados
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero:");
        numero = digitar.nextInt();

        //Estrutura de Repetição 
        for (i = numero; i >= 0; i--) {
            System.out.println("Numero:   " + i);
        }
    }

}
