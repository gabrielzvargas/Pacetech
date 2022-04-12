package ExerciciosCondicionais;

    import java.util.Scanner;
            
public class Main {

   // Exercício: fazer com que o usuário escreva um número e diga se está entre os números 100 e 200
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();
        
        if(numero >=100 && numero <=200){
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
    }
    
}
