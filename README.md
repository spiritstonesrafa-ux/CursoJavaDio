# Curso Java DIO - Projetos de Estudo 📚

Este repositório foi criado para armazenar os projetos práticos desenvolvidos durante o **Curso de Java da DIO (Digital Innovation One)**. Cada pasta representa um projeto focado em conceitos específicos.

---

## 📁 Projetos Inclusos

### 1. Projeto Baterias 🔋 (Pasta `/Bateria`)
Sistema de gerenciamento de estoque, precificação e análise técnica de **Baterias Automotivas**.
* **Conceitos de POO:** Classes, atributos privados, construtores, métodos de negócio e encapsulamento (com validação em setters).
* **Funcionalidades:** Classificação por CCA (Premium, Intermediária, Econômica), cálculo de desconto para PIX, controle de vendas no estoque e comparador de CCA entre baterias.

### 2. Projeto Banco 🏦 (Pasta `/Banco`)
Simulação de uma **Conta Bancária** dinâmica com regras de limite e taxas.
* **Conceitos de POO:** Encapsulamento de saldo e limites, condicionais de controle financeiro.
* **Funcionalidades:** Depósitos, saques comuns, pagamentos de boletos e sistema automático de **Cheque Especial** (com cobrança de 20% de juros sobre o valor utilizado no momento de um depósito posterior para quitação da dívida).

---

## 💻 Estrutura do Repositório

```bash
CursoJavaDio/
├── Banco/
│   └── src/
│       ├── Conta.java      # Lógica da conta bancária
│       └── Main.java       # Teste das operações bancárias
├── Bateria/
│   └── src/
│       ├── Bateria.java    # Lógica do sistema de baterias
│       └── Main.java       # Teste das operações de estoque
├── .gitignore              # Filtro de arquivos compilados e IDEs
└── README.md               # Esta documentação
```

---

## 🚀 Como Executar os Projetos

### Pré-requisitos
* **Java JDK 11** (ou superior) instalado.
* Terminal de sua preferência.

### Executando o Projeto Baterias
1. Vá para o diretório do código-fonte:
   ```bash
   cd Bateria/src
   ```
2. Compile e execute:
   ```bash
   javac Main.java Bateria.java
   java Main
   ```

### Executando o Projeto Banco
1. Vá para o diretório do código-fonte:
   ```bash
   cd Banco/src
   ```
2. Compile e execute:
   ```bash
   javac Main.java Conta.java
   java Main
   ```
