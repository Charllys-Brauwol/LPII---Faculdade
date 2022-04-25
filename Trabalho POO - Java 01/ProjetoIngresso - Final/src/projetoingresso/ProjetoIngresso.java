package projetoingresso;

import java.util.Scanner;

/**
 *
 * @author Charllys e Jonas
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
