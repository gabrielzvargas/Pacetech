package ExercicioCarangoVelho;

/*
Faça um programa que calcule e exiba o valor do desconto a ser pago pelos clientes que compram carros. O desconto deve ser de
12% para carros fabricado antes de 2000 e 7% para carros fabricados após 2000. O sistema deverá perguntar se o cliente deseja continuar ou não.
Informar o total de carros com anos até 2000 e depois o total
*/
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.00f;        
        float valorPago = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
    
    Scanner leitor = new Scanner(System.in);
    
    char desejaRepetir = 's';
    
    while(desejaRepetir == 's' || desejaRepetir == 'S'){
        
        //Entrada de dados
        
        System.out.println("Digite o ano de fabricação do carro");
        anoFabricacao = leitor.nextInt();
        System.out.println("Digite o valor do carro");
        valorVeiculo = leitor.nextFloat();
        
        if(anoFabricacao <= 2000){
           porcentagemDesconto = 0.12f;
           
        } else {
           porcentagemDesconto = 0.07f;
           totalCarrosSemiNovos++;
        }
        totalCarros++;
        
        valorDesconto = valorVeiculo * porcentagemDesconto;
        valorPago = valorVeiculo - valorDesconto;
        
        System.out.println("O valor de desconto foi de: " + valorDesconto);
        System.out.println("O valor que deve ser pago é de: " + valorPago);
        
        System.out.println("Deseja repetir? S - Sim // N - Não");
        desejaRepetir = leitor.next().charAt(0);
    }
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
    
}
