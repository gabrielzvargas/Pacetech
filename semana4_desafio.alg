algoritmo "Desafio_Semana 4"
// Função : Resolver o desafio da semana criando um programa que satisfaça as necessidades do cliente
// Autor : Gabriel Zimmermann Vargas
// Data : 04/03/2022

var
opcaoMenuum, opcaoMenuTemp, opcaoMenuDin: literal
tempCelsius, tempFahr, cotacaoDolar, valorDolar, valorReal: real

inicio
Escreval("Olá, seja bem vindo. Por favor, informe a cotação do dólar da data de hoje:")
leia(cotacaoDolar)
limpatela
repita
Escreval("Informe a operação desejada:")
Escreval("1 - Conversão de temperatura")
Escreval("2 - Conversão monetária")
Escreval("3 - Encerrar programa")
leia(opcaoMenuum)

se opcaoMenuum = "1" entao
   Escreval("Selecione a conversão desejada")
   Escreval("1 - Celsius para Fahrenheit")
   Escreval("2 - Fahrenheit para Celsius")
   leia(opcaoMenuTemp)
   se opcaoMenuTemp = "1" entao
   Escreval("Insira a temperatura em Celsius:")
   leia(tempCelsius)
   tempFahr <- (tempCelsius * 1.8) + 32
   Escreval("A temperatura em Fahrenheit é de: ", tempFahr)

   senao
   Escreval("Insira a temperatura em Fahrenheit:")
   leia(tempFahr)
   tempCelsius <- (tempFahr - 32) / 1.8
   Escreval("A temperatura em Celsius é de: ", tempCelsius)
   fimse
fimse

se opcaoMenuum = "2" entao
   Escreval("Selecione a conversão desejada")
   Escreval("1 - Real para Dólar")
   Escreval("2 - Dólar para real")
   leia(opcaoMenuDin)
   se opcaoMenuDin = "1" entao
   Escreval("Insira o valor em Real:")
   leia(valorReal)
   valorDolar <- valorReal / cotacaoDolar
   Escreval("O valor em dólar é de: $", valorDolar)

   senao
   Escreval("Insira o valor em Dólar:")
   leia(valorDolar)
   valorReal <- valorDolar * cotacaoDolar
   Escreval("O valor em reais é de: R$", valorReal)
   fimse
fimse

ate opcaoMenuum = "3"
fimalgoritmo
