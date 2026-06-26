# Projeto Bateria - POO em Java

Sistema simples para representar baterias automotivas e praticar conceitos de Programacao Orientada a Objetos em Java.

## Conceitos praticados

- Classes e objetos
- Encapsulamento
- Construtores
- Getters e setters
- Metodos com regras de negocio
- Comparacao entre objetos
- Validacao de atributos

## Estrutura

```bash
Bateria/
|-- src/
|   |-- Bateria.java
|   `-- Main.java
`-- README.md
```

## Classes

- `Bateria`: representa uma bateria automotiva com marca, amperagem, modelo, voltagem, CCA, preco e estoque.
- `Main`: cria exemplos de baterias e executa os metodos da classe.

## Funcionalidades

- Exibir dados da bateria
- Aplicar desconto percentual no preco
- Classificar bateria como premium ou convencional
- Comparar baterias pelo CCA
- Controlar venda e estoque
- Recomendar linha da bateria conforme o CCA

## Como executar

Na pasta `src`, compile os arquivos:

```bash
javac Main.java Bateria.java
```

Execute o programa:

```bash
java Main
```

## Observacao

Arquivos `.class` sao gerados pela compilacao e nao devem ser enviados para o GitHub.
