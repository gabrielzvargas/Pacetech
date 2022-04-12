/* Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. Mostre como resultado
se houve lucro, preju�zo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a m�dia do pre�o de custo e do pre�o de venda

*/
package ExercicioEstruturaRepeticaoII;

import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
       String nomeProduto;
       float precoCusto; // Essas vari�veis est�o fora do FOR porque n�o v�o ser criadas novas vari�veis a cada repeti��o 
       float precoVenda;
       
       float totalCusto = 0.0f; // Tem que iniciar em zero
       float totalVenda = 0.0f; // Tem que iniciar em zero
       
    Scanner leitor = new Scanner(System.in);
    
    int i = 0;
    for(; i < 3; i++){
        
        System.out.println("Informe o nome do produto");
        nomeProduto = leitor.next();
        
        System.out.println("Informe o pre�o de custo do produto");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Informe o pre�o de venda do produto");
        precoVenda = leitor.nextFloat();
        
        totalCusto = totalCusto + precoCusto;
        totalVenda = totalVenda + precoVenda;
              
        if(precoCusto == precoVenda) {
           System.out.println("Houve um empate entre pre�o de custo e de venda");
        } else {
            if(precoCusto > precoVenda) {
           System.out.println("Preju�zo"); 
            } else {
           System.out.println("Lucro"); 
            }
        }
        
        System.out.println(nomeProduto + ", pre�o de custo = " + precoCusto + ", pre�o de venda = " + precoVenda);
    }
        
        System.out.println("A m�dia do pre�o de custo � de: " + (totalCusto/i));
        System.out.println("A m�dia do pre�o de venda � de: " + (totalVenda/i));
}
}
