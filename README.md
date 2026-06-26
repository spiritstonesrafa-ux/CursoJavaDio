# Curso Java DIO - Projetos de Estudo

Este repositorio armazena projetos praticos desenvolvidos durante estudos de Java e Programacao Orientada a Objetos.

## Projetos inclusos

### 1. Projeto Baterias (`/Bateria`)

Sistema de gerenciamento de estoque, precificacao e analise tecnica de baterias automotivas.

- Conceitos: classes, atributos privados, construtores, metodos de negocio e encapsulamento.
- Funcionalidades: classificacao por CCA, desconto para PIX, controle de estoque e comparacao entre baterias.
- Documentacao: [`Bateria/README.md`](Bateria/README.md)

### 2. Projeto Banco (`/Banco`)

Simulacao de uma conta bancaria com regras de saldo, saque, deposito, boleto e cheque especial.

- Conceitos: encapsulamento, condicionais, regras de negocio e interacao via terminal.
- Funcionalidades: depositos, saques, pagamento de boletos e controle de cheque especial.
- Documentacao: [`Banco/README.md`](Banco/README.md)

### 3. Projeto Pessoa (`/Pessoa`)

Projeto simples para praticar heranca e encapsulamento com as classes `Pessoa`, `Aluno` e `Professor`.

- Conceitos: classes e objetos, construtores, heranca, encapsulamento e validacao de atributos.
- Funcionalidades: aniversario, ganho/perda de peso, crescimento, estudo e ensino.
- Documentacao: [`Pessoa/README.md`](Pessoa/README.md)

### 4. Projeto Carro (`/carro`)

Simulacao de um carro com controle de marcha, velocidade, direcao e estado ligado/desligado.

- Conceitos: encapsulamento, metodos, condicionais, switch case e interacao via terminal.
- Funcionalidades: ligar, desligar, acelerar, reduzir velocidade, trocar marcha, virar e verificar velocidade.
- Documentacao: [`carro/README.md`](carro/README.md)

## Estrutura

```bash
CursoJavaDio/
|-- Banco/
|   |-- README.md
|   `-- src/
|       |-- Conta.java
|       `-- Main.java
|-- Bateria/
|   |-- README.md
|   `-- src/
|       |-- Bateria.java
|       `-- Main.java
|-- Pessoa/
|   |-- README.md
|   `-- src/
|       |-- Main.java
|       |-- Pessoa.java
|       |-- Aluno.java
|       `-- Professor.java
|-- carro/
|   |-- README.md
|   `-- src/
|       |-- Carro.java
|       `-- Main.java
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

### Projeto Carro

```bash
cd carro/src
javac Main.java Carro.java
java Main
```

## Observacao

Arquivos `.class` e pastas `bin/` sao gerados na compilacao e nao precisam ser enviados ao GitHub.
