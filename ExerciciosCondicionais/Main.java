package ExerciciosCondicionais;

    import java.util.Scanner;
            
public class Main {

   // Exerc�cio: fazer com que o usu�rio escreva um n�mero e diga se est� entre os n�meros 100 e 200
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();
        
        if(numero >=100 && numero <=200){
            System.out.println("O n�mero est� no intervalo");
        } else {
            System.out.println("O n�mero n�o est� no intervalo");
        }
    }
    
}
