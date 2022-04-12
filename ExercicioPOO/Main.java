/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintes informações como atributos:
a) o número do item faturado;
b) a descrição do item;
c) a quantidade comprada do item;
d) o preço unitário do item 

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por
item não for positivo ele deve ser configurado como 0.0. Forneça um método set e um método get para cada variável de instância.

Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura (isto é, multiplica a quantidade pelo preço por item) e depois 
retorna o valor como um double. Escreva um app de teste que demonstra as capacidades da classe Invoice.
*/
package ExercicioPOO;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "Mousepad", 10, 40.0f);
        
        System.out.println("Valor total = " + inv.getInvoiceAmount());
    }
    
}
