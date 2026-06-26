public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String name, int age, double altura, double peso, String curso) {
        super(name, age, altura, peso);
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(getName() + " esta estudando no curso de " + curso + ".");
    }
}