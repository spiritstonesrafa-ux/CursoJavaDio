# Projeto Banco - POO em Java

Simulacao de uma conta bancaria desenvolvida para praticar Programacao Orientada a Objetos em Java.

## Conceitos praticados

- Classes e objetos
- Encapsulamento
- Construtores
- Metodos com regras de negocio
- Condicionais
- Switch case
- Interacao via terminal

## Estrutura

```bash
Banco/
|-- src/
|   |-- Conta.java
|   `-- Main.java
`-- README.md
```

## Classes

- `Conta`: representa uma conta bancaria com saldo, cheque especial e operacoes financeiras.
- `Main`: executa o menu interativo do sistema bancario.

## Funcionalidades

- Consultar saldo
- Depositar valores
- Sacar valores
- Pagar boletos
- Consultar limite do cheque especial
- Verificar se o cheque especial esta sendo usado
- Cobrar taxa ao quitar o cheque especial

## Como executar

Na pasta `src`, compile os arquivos:

```bash
javac Main.java Conta.java
```

Execute o programa:

```bash
java Main
```

## Observacao

Arquivos `.class` sao gerados pela compilacao e nao devem ser enviados para o GitHub.
