package org.victor.raphael;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int primeiroParametro, segundoParametro;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu primeiro parâmetro");
        primeiroParametro = ler.nextInt();

        System.out.println("Digite o seu segundo parâmetro");
        segundoParametro = ler.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = segundoParametro - primeiroParametro;

            for (int i = 1; i < contagem + 1; i++) {
                System.out.println("imprimindo o número: " + i);
            }
        }

    }
}
