// Aluno herda de Pessoa.
// Isso significa que Aluno possui nome, idade, altura e peso, alem do atributo curso.
public class Aluno extends Pessoa {
    private String curso;

    // O construtor recebe os dados de Pessoa e tambem o curso do aluno.
    public Aluno(String name, int age, double altura, double peso, String curso) {
        // super chama o construtor da classe pai, neste caso Pessoa.
        super(name, age, altura, peso);
        this.curso = curso;
    }

    // Metodo especifico de Aluno.
    // Como Aluno herda de Pessoa, pode usar getName().
    public void estudar() {
        System.out.println(getName() + " esta estudando no curso de " + curso + ".");
    }
}