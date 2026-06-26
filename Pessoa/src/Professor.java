public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String name, int age, double altura, double peso, String disciplina) {
        super(name, age, altura, peso);
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println(getName() + " esta ensinando a disciplina de " + disciplina + ".");
    }
}
