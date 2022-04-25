package projetoingresso;

import java.util.Scanner;

/**
 *
 * @author Charllys e Jonas
 * 
 * 2. Crie uma classe chamada Ingresso, que possui um valor em reais e um método
imprimirValor(). Crie uma classe IngressoVIP, que herda de Ingresso e possui um valor
adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional
incluído). Crie um programa para criar as instâncias de Ingresso e IngressoVIP,
mostrando a diferença de preços.

 */
public class ProjetoIngresso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                           Consulte o Valor dos Ingressos:
                           1 - Ingresso Normal
                           2 - Ingresso VIP""");
        int tipo = entrada.nextInt();

        switch (tipo) {
            case 1 -> {
                Ingresso ingressoNormal = new Ingresso();
                ingressoNormal.imprimirValor();
            }
            case 2 -> {
                IngressoVIP ingressoVIP = new IngressoVIP();
                ingressoVIP.imprimirValor();
            }
            default -> System.out.println("Escolha novamente.");
        }

    }

}
