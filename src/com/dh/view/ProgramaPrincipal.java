package com.dh.view;

import com.dh.domain.Bolo;
import com.dh.domain.Massa;
import com.dh.domain.Sanduiche;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        int opcao;

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1. Sanduíches");
        System.out.println("2. Massas");
        System.out.println("3. Bolos");

        Scanner scanner = new Scanner(System.in);
        //caso voce passe um parametro dentro de try que seja closable, nao é necessário o uso de finally:
        // try (Scanner scanner = new Scanner(System.in) {
        //       ..
        //    }

        try {
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    for (String ingrediente : Sanduiche.INGREDIENTES_DISPONIVEIS) {
                        System.out.println(ingrediente);
                    }
                    break;
                }

                case 2: {
                    //Massa.CARDAPIO_DE_MASSAS.forEach(massa -> System.out.println(massa));
                    //Massa.CARDAPIO_DE_MASSAS.forEach(System.out::println);
                    for (String massa : Massa.CARDAPIO_DE_MASSAS) {
                        System.out.println(massa);
                    }
                    break;
                }


                case 3: {
                    //Bolo.CARDAPIO_DE_BOLOS.stream().forEach(bolo -> System.out.println(bolo));
                    //Bolo.CARDAPIO_DE_BOLOS.stream().forEach(System.out::println);

                    for (String bolo : Bolo.CARDAPIO_DE_BOLOS) {
                        System.out.println(bolo);
                    }
                    break;
                } default: {
                    System.out.println("Opção inválida");
                }
            }
        } finally {
            scanner.close();
        }
    }
}
