// A classe Pessoa representa uma pessoa comum no sistema.
// Ela sera a classe "pai" das classes Aluno e Professor.
public class Pessoa {
    // Atributos privados: somente a propria classe acessa diretamente.
    // Isso e encapsulamento: protegemos os dados e usamos metodos para manipula-los.
    private String name;
    private int age;
    private double altura;
    private double peso;

    // Construtor: executa quando criamos um novo objeto Pessoa.
    // Em vez de atribuir direto, usamos os setters para aproveitar as validacoes.
    public Pessoa(String name, int age, double altura, double peso) {
        setName(name);
        setAge(age);
        setAltura(altura);
        setPeso(peso);
    }

    // Setter: altera o nome da pessoa.
    // Aqui existe uma validacao para evitar nome vazio ou nulo.
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Nome invalido.");
            return;
        }
        this.name = name;
    }

    // Getter: devolve o nome para outras classes sem expor o atributo diretamente.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter com validacao: idade nao pode ser negativa.
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Idade invalida.");
        }
    }

    public double getAltura() {
        return altura;
    }

    // Altura precisa ser maior que zero para fazer sentido.
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura invalida.");
        }
    }

    public double getPeso() {
        return peso;
    }

    // Peso tambem precisa ser maior que zero.
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso invalido.");
        }
    }

    // Metodo de comportamento: mostra os dados principais da pessoa.
    public void introduce() {
        System.out.println("Ola, meu nome e " + name + " e tenho " + age + " anos.");
        System.out.printf("Minha altura e %.2f m\n", altura);
        System.out.printf("E meu peso e %.2f kg\n", peso);
    }

    // Metodo que altera o estado do objeto: aumenta a idade em 1.
    public void aniversario() {
        System.out.println("Feliz aniversario, " + name + "!");
        this.age++;
        System.out.println("Agora tenho " + this.age + " anos.");
    }

    // Recebe um valor e soma ao peso atual.
    public void engordar(double ganho) {
        if (ganho <= 0) {
            System.out.println("Ganho de peso invalido.");
            return;
        }

        this.peso += ganho;
        System.out.println(name + " engordou " + ganho + "kg. Peso atual: " + this.peso + "kg.");
    }

    // Recebe um valor e subtrai do peso atual, sem permitir peso zero ou negativo.
    public void emagrecer(double perda) {
        if (perda <= 0) {
            System.out.println("Perda de peso invalida.");
            return;
        }

        if (perda >= peso) {
            System.out.println("Perda de peso maior ou igual ao peso atual nao e permitida.");
            return;
        }

        this.peso -= perda;
        System.out.println(name + " emagreceu " + perda + "kg. Peso atual: " + this.peso + "kg.");
    }

    // Pessoas ate 21 anos podem crescer neste exemplo.
    // O metodo recebe quanto a altura deve aumentar.
    public void crescer(double cresceu) {
        if (cresceu <= 0) {
            System.out.println("Valor de crescimento invalido.");
            return;
        }

        if (age <= 0) {
            System.out.println("Dados invalidos.");
            return;
        }

        if (age <= 21) {
            this.altura += cresceu;
            System.out.printf("%s cresceu %.2f m. Altura atual: %.2f m.\n", name, cresceu, altura);
        } else {
            System.out.println(name + " nao pode crescer.");
        }
    }
}