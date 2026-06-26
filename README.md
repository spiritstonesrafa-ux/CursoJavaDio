# Curso Java DIO - Projetos de Estudo

Este repositorio armazena projetos praticos desenvolvidos durante estudos de Java e Programacao Orientada a Objetos.

## Projetos inclusos

### 1. Projeto Baterias (`/Bateria`)

Sistema de gerenciamento de estoque, precificacao e analise tecnica de baterias automotivas.

- Conceitos: classes, atributos privados, construtores, metodos de negocio e encapsulamento.
- Funcionalidades: classificacao por CCA, desconto para PIX, controle de estoque e comparacao entre baterias.

### 2. Projeto Banco (`/Banco`)

Simulacao de uma conta bancaria com regras de saldo, saque, deposito, boleto e cheque especial.

- Conceitos: encapsulamento, condicionais, regras de negocio e interacao via terminal.
- Funcionalidades: depositos, saques, pagamento de boletos e controle de cheque especial.

### 3. Projeto Pessoa (`/Pessoa`)

Projeto simples para praticar heranca e encapsulamento com as classes `Pessoa`, `Aluno` e `Professor`.

- Conceitos: classes e objetos, construtores, heranca, encapsulamento e validacao de atributos.
- Funcionalidades: aniversario, ganho/perda de peso, crescimento, estudo e ensino.

## Estrutura

```bash
CursoJavaDio/
|-- Banco/
|   `-- src/
|       |-- Conta.java
|       `-- Main.java
|-- Bateria/
|   `-- src/
|       |-- Bateria.java
|       `-- Main.java
|-- Pessoa/
|   `-- src/
|       |-- Main.java
|       |-- Pessoa.java
|       |-- Aluno.java
|       `-- Professor.java
|-- .gitignore
`-- README.md
```

## Como executar

### Projeto Baterias

```bash
cd Bateria/src
javac Main.java Bateria.java
java Main
```

### Projeto Banco

```bash
cd Banco/src
javac Main.java Conta.java
java Main
```

### Projeto Pessoa

```bash
cd Pessoa
javac -d bin src\Main.java src\Pessoa.java src\Aluno.java src\Professor.java
java -cp bin Main
```

## Observacao

Arquivos `.class` e pastas `bin/` sao gerados na compilacao e nao precisam ser enviados ao GitHub.
