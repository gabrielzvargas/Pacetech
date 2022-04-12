algoritmo "Conversor de temperatura com registro de horário"
// Função: Permitir que o usuário insira a temperatura registrada juntamente com o horário da leitura, imprimindo o resultado da temperatura em ordem crescente
// Autor: Gabriel Zimmermann Vargas
// Data: 10/03/2022

var

opcaoMenu: literal
temperatura: vetor[1..4] de real
horario: vetor[1..4] de real
i, j: inteiro
aux1, aux2: real

procedimento mostrarMenu()
inicio
  Escreval("1 - Converter Celsius para Fahrenheint")
  Escreval("2 - Converter Fahrenheint para Celsius")
  Escreval("3 - Sair")
  leia(opcaoMenu)
fimprocedimento

funcao converter1(C: real): real
inicio
    retorne(1.8 * C + 32)
fimfuncao

funcao converter2(F: real): real
inicio
    retorne(F - 32) / 1.8
fimfuncao

procedimento lerDados()
inicio
para i de 1 ate 4 faca
     Escreval("Por favor, informe a temperatura")
     leia(temperatura[i])

     Escreval("Por favor, informe o horário de leitura da temperatura")
     leia(horario[i])
     fimpara
fimprocedimento

procedimento converterTemperaturaCparaF()
inicio
metodoBolha()
   para i de 1 ate 4 faca
         Escreval("Temperatura", temperatura[i], "°C, registrada às", horario[i], "h corresponde a ", converter1(temperatura[i]) , "°F")
   fimpara
fimprocedimento

procedimento converterTemperaturaFparaC()
inicio
metodoBolha()
   para i de 1 ate 4 faca
         Escreval("Temperatura", temperatura[i], "°F, registrada às", horario[i], "h corresponde a ", converter2(temperatura[i]), "°C")
   fimpara
fimprocedimento

procedimento metodoBolha()
inicio
 para i de 1 ate 4 faca
      para j de 1 ate 4 faca
           se (temperatura[j] > temperatura[i]) entao
      aux1 <- temperatura[i]
      temperatura[i] <- temperatura[j]
      temperatura[j] <- aux1
      aux2 <- horario[i]
      horario[i] <- horario[j]
      horario[j] <- aux2
           fimse
      fimpara
 fimpara
fimprocedimento

inicio
 repita
       mostrarMenu()
       escolha opcaoMenu
       caso "1"
          lerDados()
          converterTemperaturaCparaF()
       caso "2"
          lerDados()
          converterTemperaturaFparaC()
       caso "3"
          Escreval("Fim do programa")
       outrocaso
          Escreval("Opção inválida")
       fimescolha
 ate opcaoMenu = "3"
fimalgoritmo

