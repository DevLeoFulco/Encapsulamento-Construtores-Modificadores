# README

## Visão Geral

Este repositório contém um programa Java que exemplifica os conceitos de Encapsulamento, Construtores e Modificadores de Acesso. O programa simula um sistema simples de conta bancária, onde é possível realizar depósitos, saques e visualizar informações da conta.

## Conceitos Demonstrados

### Encapsulamento

O encapsulamento é uma prática de design que protege os detalhes internos de uma classe e restringe o acesso direto aos seus membros. Na classe `Conta`, os atributos `numero`, `titular`, e `saldo` são privados (`private`), e seu acesso é controlado por métodos públicos, como `getTitular`, `setTitular`, `getSaldo`, `deposito` e `saque`. Isso garante que o estado interno da classe seja modificado ou acessado apenas de maneiras controladas.

### Construtores

A classe `Conta` possui dois construtores:

1. **Construtor com Número e Titular:**
   ```java
   public Conta(int numero, String titular) {
       this.numero = numero;
       this.titular = titular;
   }
   ```
   Este construtor inicializa uma conta com número e titular, sem saldo inicial.

2. **Construtor com Número, Titular e Saldo Inicial:**
   ```java
   public Conta(int numero, String titular, double saldoInicial) {
       this.numero = numero;
       this.titular = titular;
       deposito(saldoInicial);
   }
   ```
   Este construtor é uma versão sobrecarregada que permite a inicialização da conta com um saldo inicial.

### Modificadores de Acesso

Os atributos `numero`, `titular`, e `saldo` são declarados como privados (`private`). Isso significa que eles só podem ser acessados diretamente dentro da própria classe. Para permitir o acesso externo controlado a esses atributos, métodos públicos como `getTitular`, `setTitular`, e `getSaldo` são fornecidos.

## Como Usar

1. Clone o repositório em sua máquina local.
   ```bash
   git clone https://github.com/seu-nome/nome-do-repositorio.git
   ```

2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.

3. Execute a classe `Program` para iniciar a simulação da conta bancária.

4. Siga as instruções na tela para inserir o número da conta, nome do titular, e realizar operações de depósito e saque.

## Exemplo

Aqui está um exemplo de como o programa pode ser usado:

1. Insira o número da conta: 123
2. Insira o nome do titular: João da Silva
3. Sua conta tem depósito inicial (s / n)? s
   - Informe o valor do depósito inicial: 1000.00

4. Visualize os dados da conta:
   ```
   ------- Dados da conta -------
   Conta 123 , Titular : João da Silva , Saldo : R$ 1000.00
   ```

5. Digite o valor que deseja depositar: 500.00
   ```
   -------- Novos dados na conta -------
   Conta 123 , Titular : João da Silva , Saldo : R$ 1500.00
   ```

6. Digite o valor que deseja sacar: 200.00
   ```
   -------- Novos dados na conta -------
   Conta 123 , Titular : João da Silva , Saldo : R$ 1295.00
   ```

## Conclusão

Este projeto exemplifica práticas essenciais de programação orientada a objetos, incluindo encapsulamento para proteção de dados, construtores para inicialização de objetos e modificadores de acesso para controlar a visibilidade de membros da classe. Explore e modifique o código conforme necessário para aprimorar sua compreensão desses conceitos. Bons Estudos!
