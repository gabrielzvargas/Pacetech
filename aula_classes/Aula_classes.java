package aula_classes;

import java.util.Scanner;

public class Aula_classes { //essa classe principal sempre é iniciada com o programa, relacionada com a 'main' abaixo - Todo código precisa de uma classe principal

    public static void main(String[] args) {
  
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.50f); // objetoPessoa é uma variável não primitiva. Para ela existir, precisamos dizer a qual classe está indexada.
        Scanner leitor = new Scanner(System.in);
       
        
        System.out.println("Digite o peso");
        objetoPessoa.setPeso(leitor.nextFloat()); // vai puxar o peso que está na classe pessoa e atribuir ao objeto pessoa.
        System.out.println("Digite a altura");
        objetoPessoa.setAltura(leitor.nextFloat()); // vai puxar a altura que está na classe pessoa e atribuir ao objeto pessoa.
      
        System.out.println("O IMC é " + objetoPessoa.calcularIMC()); //vai retornar o cálculo que está na classe pessoa.
    }
    
}
