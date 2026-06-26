// Professor tambem herda de Pessoa.
// Ele reutiliza os atributos e metodos da classe Pessoa e adiciona disciplina.
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String name, int age, double altura, double peso, String disciplina) {
        // Reaproveita a inicializacao definida na classe Pessoa.
        super(name, age, altura, peso);
        this.disciplina = disciplina;
    }

    // Metodo especifico de Professor.
    public void ensinar() {
        System.out.println(getName() + " esta ensinando a disciplina de " + disciplina + ".");
    }
}