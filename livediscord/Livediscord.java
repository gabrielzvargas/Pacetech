package livediscord;

/* Escrever um algoritmo em que o usuário irá digitar um conjunto de dados (altura e sexo) de 8 pessoas.
                        O programa tem que dizer:
                        1 - o total de mulheres
                        2 - a maior e a menor altura
                        3 - a média de altura das mulheres
 */

import java.util.Scanner;

public class Livediscord {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);
        float cotacaoDolar, tempCelsius, tempFahr, valorDolar, valorReal;
        int opcao;
        System.out.println("Olá. Por favor, digite a cotação do dólar");
        cotacaoDolar = leitorScanner.nextFloat();
        System.out.println("A cotação do dólar é de: $ " + cotacaoDolar);
        System.out.println("");

        do {
            System.out.println("Selecione a opção desejada\n"
                    + "\n"
                    + "1 - Converter Celsius para Fahrenheit\n"
                    + "2 - Conversão Fahrenheit para Celsius\n"
                    + "3 - Converter Real para Dólar\n"
                    + "4 - Converter Dólar para Real\n"
                    + "5 - Sair");

            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira a temperatura em ºC");
                    tempCelsius = leitorScanner.nextFloat();

                    tempFahr = (tempCelsius * 1.8f) + 32;
                    System.out.println("A temperatura em Fahrenheit é de: " + tempFahr + "ºF");
                }
                case 2 -> {
                    System.out.println("Insira a temperatura em ºF");
                    tempFahr = leitorScanner.nextFloat();

                    tempCelsius = ((tempFahr - 32) / 1.8f);
                    System.out.println("A temperatura em Celsius é de: " + tempCelsius + "ºC");
                }

                case 3 -> {
                    System.out.println("Insira o valor em R$");
                    valorReal = leitorScanner.nextFloat();

                    valorDolar = valorReal / cotacaoDolar;
                    System.out.println("A quantia de R$" + valorReal + " equivale a: $" + valorDolar);
                }

                case 4 -> {
                    System.out.println("Insira o valor em $");
                    valorDolar = leitorScanner.nextFloat();

                    valorReal = valorDolar * cotacaoDolar;
                    System.out.println("A quantia de $" + valorDolar + " equivale a : R$" + valorReal);
                }
                case 5 -> {
                    System.out.println("Fim do programa");
                }
                default ->
                    System.out.println("Opção inválida");
            }
        } while (opcao != 5);
    }
}
