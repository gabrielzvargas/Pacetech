/* Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a média do preço de custo e do preço de venda

*/
package ExercicioEstruturaRepeticaoII;

import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
       String nomeProduto;
       float precoCusto; // Essas variáveis estão fora do FOR porque não vão ser criadas novas variáveis a cada repetição 
       float precoVenda;
       
       float totalCusto = 0.0f; // Tem que iniciar em zero
       float totalVenda = 0.0f; // Tem que iniciar em zero
       
    Scanner leitor = new Scanner(System.in);
    
    int i = 0;
    for(; i < 3; i++){
        
        System.out.println("Informe o nome do produto");
        nomeProduto = leitor.next();
        
        System.out.println("Informe o preço de custo do produto");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Informe o preço de venda do produto");
        precoVenda = leitor.nextFloat();
        
        totalCusto = totalCusto + precoCusto;
        totalVenda = totalVenda + precoVenda;
              
        if(precoCusto == precoVenda) {
           System.out.println("Houve um empate entre preço de custo e de venda");
        } else {
            if(precoCusto > precoVenda) {
           System.out.println("Prejuízo"); 
            } else {
           System.out.println("Lucro"); 
            }
        }
        
        System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);
    }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto/i));
        System.out.println("A média do preço de venda é de: " + (totalVenda/i));
}
}
