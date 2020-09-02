# Calculadora de Impostos

## Problema

Dado um orçamento, diversos impostos podem ser aplicados sobre este orçamento.

A lógica da aplicação do imposto é sempre a mesma: pega o valor do orçamento e aplicar um cálculo matemático, retornando o valor do imposto.

Inicialmente, o problema pode ser facilmente resolvido com uma classe que recebe o orçamento e o nome do imposto e, a partir de uma série
 de condicionais, aplica o imposto pedido.
 
O problema é que, essa classe única tende a crescer bastante dificultando sua legibilidade, flexibilidade e manutenção.
 
## Solução
 
Aplicando o Strategy Design Patter, criamos um contrato para os impostos, uma interface que todo imposto vai implementar. Cada implementação
 trata exclusivamente da regra de cálculo. A calculadora de imposto recebe uma implementação do imposto e apenas aplica a chamada.
 
 Dessa forma, evitamos a necessidade de extensas cadeias condicionais e deixamos o código mais flexível. 
 
 Claro que, na prática, quem for usar a calculadora ainda terá que aplicar regras para saber qual imposto vai usar, mas existem outros
  design patterns para lidar com isso.   