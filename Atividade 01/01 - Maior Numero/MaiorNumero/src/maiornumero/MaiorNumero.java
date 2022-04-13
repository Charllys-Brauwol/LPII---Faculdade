/*
Crie uma classe java MaiorNumero que contenha um método que receba dois
números inteiros e imprima o maior entre eles.
 */
package maiornumero;

import java.util.Scanner;

/*
 * @author Charllys Brauwol
 */
public class MaiorNumero {

    public static void main(String[] args) {
        //Declaração de Váriavéis
        int numero1;
        int numero2;

        //Metódos de Entrada de Dados
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero:");
        numero1 = digitar.nextInt();

        System.out.println("Digite o Segundo Numero:");
        numero2 = digitar.nextInt();

        //Estrutura de Decisão para comparar os dois números
        if (numero1 > numero2) {
            System.out.println("O Primeiro Numero digitado e maior:" + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O Segundo e maior:" + numero2);
        } else {
            System.out.println("Os dois sao Iguais");
        }
    }
}
