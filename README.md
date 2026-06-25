# Curso Java DIO - Projeto Baterias 🔋

Este repositório foi criado para armazenar os projetos práticos desenvolvidos durante o **Curso de Java da DIO (Digital Innovation One)**. 

O projeto atual consiste em um sistema de gerenciamento de estoque, precificação e análise técnica de **Baterias Automotivas**, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java.

---

## 🛠️ Conceitos de POO Aplicados

No código desenvolvido, foram exercitados os seguintes pilares e estruturas:
* **Classes e Objetos**: Definição da estrutura `Bateria` e instanciação dos objetos na classe `Main`.
* **Encapsulamento**: Atributos definidos como privados (`private`) com acessores e modificadores (`getters` e `setters`) controlando e validando as entradas (ex: validação para evitar preços ou estoques negativos).
* **Construtor**: Inicialização segura dos objetos com todos os atributos obrigatórios.
* **Métodos de Negócio (Comportamento)**: Métodos que simulam ações reais do mercado de baterias.

---

## 📊 Funcionalidades do Sistema

O sistema possui regras de negócio específicas para o segmento de baterias:

* **Exibição de Informações (`dadosBateria`)**: Exibe de forma organizada os dados técnicos de cada bateria cadastrada.
* **Cálculo de Desconto (`descontoPix`)**: Aplica uma porcentagem de desconto dinâmica para pagamentos via PIX.
* **Classificação Técnica (`verificarPremium` & `recomendar`)**: 
  * Classifica se uma bateria é **Premium** caso seu CCA (capacidade de arranque a frio) seja maior ou igual a `450`.
  * Recomenda categorias de uso com base no CCA:
    * **Premium** (CCA ≥ 450)
    * **Intermediária** (CCA ≥ 350)
    * **Econômica** (CCA < 350)
* **Comparador de Baterias (`compararCca`)**: Compara duas baterias diferentes e aponta qual possui a maior corrente de partida (CCA).
* **Controle de Vendas (`venderUma`)**: Realiza a baixa automática no estoque, impedindo a venda caso o estoque chegue a zero.

---

## 💻 Estrutura de Pastas

```bash
Baterias/
├── Bateria/
│   ├── src/
│   │   ├── Bateria.java  # Classe com a lógica de negócio e atributos
│   │   └── Main.java     # Classe principal de testes e simulações
└── README.md             # Documentação do projeto
```

---

## 🚀 Como Executar

### Pré-requisitos
* Possuir o **Java JDK 11** (ou superior) instalado na máquina.
* IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse).

### Execução via Terminal
1. Navegue até a pasta do código-fonte:
   ```bash
   cd Bateria/src
   ```
2. Compile os arquivos Java:
   ```bash
   javac Main.java Bateria.java
   ```
3. Execute o programa:
   ```bash
   java Main
   ```
