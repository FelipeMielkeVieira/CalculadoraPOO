import entities.Calculadora;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Calculadora calc = new Calculadora();

    public static void main(String[] args) {

        int opcao, qtd;
        double num1, num2;
        double[] numeros;

        do {
            System.out.println(
                    "----- Menu -----\n0 - Sair \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Potência \n6 - Porcentagem \n7 - Raiz Quadrada");
            opcao = sc.nextInt();

            System.out.print("Quantidade de Números: ");
            qtd = sc.nextInt();

            if(qtd < 1 || qtd > 5) {
                System.out.println("Quantidade Inválida!");
            } else {

                switch(opcao) {
                    case 1:

                        if(qtd < 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        numeros = new double[qtd];
                        for(int i = 0; i < qtd; i++) {
                            System.out.print("Número " + (i + 1) + ": ");
                            numeros[i] = sc.nextDouble();
                        }
                        System.out.println("Soma = " + calc.soma(numeros));
                        break;
                    case 2:

                        if(qtd < 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        numeros = new double[qtd];
                        for(int i = 0; i < qtd; i++) {
                            System.out.print("Número " + (i + 1) + ": ");
                            numeros[i] = sc.nextDouble();
                        }
                        System.out.println("Subtração = " + calc.subtracao(numeros));
                        break;
                    case 3:

                        if(qtd < 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        numeros = new double[qtd];
                        for(int i = 0; i < qtd; i++) {
                            System.out.print("Número " + (i + 1) + ": ");
                            numeros[i] = sc.nextDouble();
                        }
                        System.out.println("Multiplicação = " + calc.multiplicacao(numeros));
                        break;
                    case 4:

                        if(qtd != 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        System.out.print("Número 1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Número 2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Divisão = " + calc.divisao(num1, num2));
                        break;
                    case 5:

                        if(qtd != 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        System.out.print("Número 1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Número 2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Potência = " + calc.potencia(num1, num2));
                        break;
                    case 6:

                        if(qtd != 2) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        System.out.print("Número 1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Número 2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Porcentagem = " + calc.porcentagem(num1, num2) + "%");
                        break;
                    case 7:

                        if(qtd != 1) {
                            System.out.println("Quantidade Inválida!");
                            break;
                        }

                        System.out.print("Número: ");
                        System.out.println("Raiz Quadrada = " + calc.raizQuadrada(sc.nextDouble()));
                        break;
                }
            }

        } while (opcao != 0);
    }
}