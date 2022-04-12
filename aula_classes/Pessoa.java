package aula_classes; // para criar uma classe, precisa clicar com o botão direito no projeto e 'new java class'

public class Pessoa { //classe criada para lidarmos com as variáveis do objeto que queremos trabalhar, nesse caso pessoa 
   
    // Atributos - o que a classe representa, variáveis. Nese caso só tem esses 2 pq é o que é necessário pra calcular o IMC
    
    private float peso, altura; // são dados privados, só podem ser alterados dentro desta classe responsável por eles
    
    /* Método construtor: é executado quando o objeto da classe principal é executado, por isso precisa ter o mesmo nome do que o objeto criado.
       É necessário em casos de setar valores default para projeto, validar dados, executar código
    */
public Pessoa(float peso, float altura){
    this.peso = peso;
    this.altura = altura;
}
    
 // Métodos - semelhante a função ou procedimento do VisualG - responsável pelo que a classe consegue fazer com os atributos inferidos.   
public float calcularIMC(){ // Estrutura do método segue o modelo ao lado. Float foi colocado pq é o tipo de resposta que vai ter. CalcularIMC é o que será feito
    float imc = peso / (altura * altura);
    return imc;
    
    }
// Métodos acessores: permitem que outras classes utilizem esses dados para execução do algoritmo. Ou seja, a classe principal não pode modificar valores, somente ler.
public void setPeso(float peso){
    this.peso = peso;
    }

public float getPeso(){
    return peso;
}
public void setAltura(float altura){
    this.altura = altura;
    }

public float getAltura(){
    return altura;
}

}
