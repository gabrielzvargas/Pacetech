algoritmo "Desafio_Semana 4"
// Fun��o : Resolver o desafio da semana criando um programa que satisfa�a as necessidades do cliente
// Autor : Gabriel Zimmermann Vargas
// Data : 04/03/2022

var
opcaoMenuum, opcaoMenuTemp, opcaoMenuDin: literal
tempCelsius, tempFahr, cotacaoDolar, valorDolar, valorReal: real

inicio
Escreval("Ol�, seja bem vindo. Por favor, informe a cota��o do d�lar da data de hoje:")
leia(cotacaoDolar)
limpatela
repita
Escreval("Informe a opera��o desejada:")
Escreval("1 - Convers�o de temperatura")
Escreval("2 - Convers�o monet�ria")
Escreval("3 - Encerrar programa")
leia(opcaoMenuum)

se opcaoMenuum = "1" entao
   Escreval("Selecione a convers�o desejada")
   Escreval("1 - Celsius para Fahrenheit")
   Escreval("2 - Fahrenheit para Celsius")
   leia(opcaoMenuTemp)
   se opcaoMenuTemp = "1" entao
   Escreval("Insira a temperatura em Celsius:")
   leia(tempCelsius)
   tempFahr <- (tempCelsius * 1.8) + 32
   Escreval("A temperatura em Fahrenheit � de: ", tempFahr)

   senao
   Escreval("Insira a temperatura em Fahrenheit:")
   leia(tempFahr)
   tempCelsius <- (tempFahr - 32) / 1.8
   Escreval("A temperatura em Celsius � de: ", tempCelsius)
   fimse
fimse

se opcaoMenuum = "2" entao
   Escreval("Selecione a convers�o desejada")
   Escreval("1 - Real para D�lar")
   Escreval("2 - D�lar para real")
   leia(opcaoMenuDin)
   se opcaoMenuDin = "1" entao
   Escreval("Insira o valor em Real:")
   leia(valorReal)
   valorDolar <- valorReal / cotacaoDolar
   Escreval("O valor em d�lar � de: $", valorDolar)

   senao
   Escreval("Insira o valor em D�lar:")
   leia(valorDolar)
   valorReal <- valorDolar * cotacaoDolar
   Escreval("O valor em reais � de: R$", valorReal)
   fimse
fimse

ate opcaoMenuum = "3"
fimalgoritmo
