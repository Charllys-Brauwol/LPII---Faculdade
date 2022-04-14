/*
 Crie uma classe java TrocaNumero que contenha um método que receba dois números
NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos
forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na ordem NumA = 9
e NumB = 5.
*/
package trocanumero;

import java.util.Scanner;

/**
 *
 * @author Charllys Brauwol
 */
public class TrocaNumero {

    public static void main(String[] args) {
          //Declaração de Váriavéis
        int numA;
        int numB;

        //Metódos de Entrada de Dados
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero:");
        numA = digitar.nextInt();

        System.out.println("Digite o Segundo Numero:");
        numB = digitar.nextInt();
        
        System.out.println("Primeiro Numero:" + numA);
        System.out.println("Segundo Numero:" + numB);
        System.out.println("Ordem Inversa\n: " +numB);
        System.out.println("e\n" +numA
        );
 
    }
    
}
