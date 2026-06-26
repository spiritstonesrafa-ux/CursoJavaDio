public class Pessoa {
    private String name;
    private int age;
    private double altura;
    private double peso;

    public Pessoa(String name, int age, double altura, double peso) {
        setName(name);
        setAge(age);
        setAltura(altura);
        setPeso(peso);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Nome invalido.");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso invalido.");
        }
    }

    public void introduce() {
        System.out.println("Ola, meu nome e " + name + " e tenho " + age + " anos.");
        System.out.printf("Minha altura e %.2f m\n", altura);
        System.out.printf("E meu peso e %.2f kg\n", peso);
    }

    public void aniversario() {
        System.out.println("Feliz aniversario, " + name + "!");
        this.age++;
        System.out.println("Agora tenho " + this.age + " anos.");
    }

    public void engordar(double ganho) {
        if (ganho <= 0) {
            System.out.println("Ganho de peso invalido.");
            return;
        }

        this.peso += ganho;
        System.out.println(name + " engordou " + ganho + "kg. Peso atual: " + this.peso + "kg.");
    }

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
