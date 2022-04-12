/*
A fim de representar empregados em uma empresa, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:

1 - um primeiro nome
2 - um sobrenome
3 - um salário mensal 

Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. 
Se o salário mensal não for positivo, configure-o como 0.0

Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.
 */
package desafiosemana7_gzv;


public class Desafiosemana7_gzv {

   
    public static void main(String[] args) {
       Empregado fangio = new Empregado("Juan", "Fangio", 1300f);  
       Empregado jarbas = new Empregado("Jarbas", "Augusto", 1400f);
       
        System.out.println("O nome do funcionário é " + fangio.getPrimeiroNome() + " " + fangio.getSobrenome() + ". Seu salário mensal é de R$" + fangio.getSalarioMensal()); 
        System.out.println("Salário anual é de R$" + fangio.calcularSalario());
        System.out.println("Salário anual + 10% é R$" + (fangio.calcularSalario()* 1.1));
        System.out.println(" ");
        System.out.println("O nome do funcionário é " + jarbas.getPrimeiroNome() + " " + jarbas.getSobrenome() + ". Seu salário mensal é de R$" + jarbas.getSalarioMensal()); 
        System.out.println("Salário anual é de R$" + jarbas.calcularSalario());
        System.out.println("Salário anual + 10% é R$" + (jarbas.calcularSalario()* 1.1));
    }
    
}
