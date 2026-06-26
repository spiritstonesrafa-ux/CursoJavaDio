# Projeto Pessoa - POO em Java

Projeto simples desenvolvido para praticar conceitos de Programacao Orientada a Objetos em Java.

## Conceitos praticados

- Classes e objetos
- Encapsulamento
- Construtores
- Heranca
- Metodos com regras de negocio
- Validacao de atributos

## Estrutura

```bash
Pessoa/
|-- src/
|   |-- Main.java
|   |-- Pessoa.java
|   |-- Aluno.java
|   `-- Professor.java
|-- .gitignore
`-- README.md
```

## Classes

- `Pessoa`: classe base com nome, idade, altura e peso.
- `Aluno`: herda de `Pessoa` e adiciona o curso.
- `Professor`: herda de `Pessoa` e adiciona a disciplina.
- `Main`: executa exemplos de uso das classes.

## Como executar

Na pasta raiz do projeto, compile os arquivos:

```bash
javac -d bin src\Main.java src\Pessoa.java src\Aluno.java src\Professor.java
```

Execute o programa:

```bash
java -cp bin Main
```

## Observacao

A pasta `bin` e os arquivos `.class` sao gerados pela compilacao e nao devem ser enviados para o GitHub.