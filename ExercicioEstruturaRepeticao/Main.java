package ExercicioEstruturaRepeticao;
// Exerc�cio: leia um n�mero N vezes e diga se � positivo, negativo ou 0
import java.util.Scanner;
public class Main {

    
      public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
        
            System.out.println("Digite um n�mero");
            int numero = leitorScanner.nextInt();
        
        if(numero == 0){
            System.out.println("O n�mero � zero");
        } else {
            if(numero > 0){
             System.out.println("O n�mero � maior do que zero");   
            }    else  {
                System.out.println("O n�mero � menor do que zero");
            }
        }
        
        System.out.println("Deseja continuar? S - Sim / N - N�o");
        desejaContinuar = leitorScanner.next().charAt(0);
    }
      }
}