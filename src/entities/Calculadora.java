package entities;

public class Calculadora {

    public double soma(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public double subtracao(double[] numeros) {
        double subtracao = 0;
        for (int i = 0; i < numeros.length; i++) {
            subtracao += numeros[i];
        }
        return subtracao;
    }

    public double multiplicacao(double[] numeros) {
        double multiplicacao = 0;
        for (int i = 0; i < numeros.length; i++) {
            multiplicacao += numeros[i];
        }
        return multiplicacao;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double porcentagem(double num1, double num2) {
        return num1 * 100 / num2;
    }
}
