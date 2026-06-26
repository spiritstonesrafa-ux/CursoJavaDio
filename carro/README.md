# Projeto Carro - POO em Java

Simulacao de um carro com regras de marcha, velocidade, direcao e estado ligado/desligado.

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
carro/
|-- src/
|   |-- Carro.java
|   `-- Main.java
`-- README.md
```

## Classes

- `Carro`: representa o estado do carro e concentra as regras de negocio.
- `Main`: executa um menu interativo para controlar o carro pelo terminal.

## Funcionalidades

- Ligar e desligar o carro
- Acelerar
- Diminuir velocidade
- Trocar marcha
- Virar para esquerda ou direita
- Verificar velocidade
- Validar limites de velocidade por marcha

## Como executar

Na pasta `src`, compile os arquivos:

```bash
javac Main.java Carro.java
```

Execute o programa:

```bash
java Main
```

## Observacao

Arquivos `.class` sao gerados pela compilacao e nao devem ser enviados para o GitHub.
