public class Main {
    public static void main(String[] args) throws Exception {
        // Criando um objeto da classe Person
        Pessoa rafael = new Pessoa("Rafael",37, 1.72, 88);
        Pessoa ana = new Pessoa("Ana", 30, 1.80, 60);
        Pessoa diana = new Pessoa("Diana", 11, 1.60, 48);
        Pessoa matheus = new Pessoa("Matheus", 17, 1.70, 61.5);
        Aluno aluno1 = new Aluno("Rafael", 37, 1.72, 88, "Java");
        Aluno aluno2 = new Aluno("Matheus", 17, 1.70, 61.5, "Python");
        Professor professor1 = new Professor("Albert", 55, 1.80, 65, "POO"); 

        // Chamando o método introduce() do objeto rafael
        rafael.introduce();
        rafael.aniversario();
        rafael.emagrecer(5);
        ana.introduce();
        ana.engordar(2);
        ana.crescer(0.05);
        diana.introduce();
        diana.crescer(0.04);
        matheus.introduce();
        matheus.emagrecer(2);
        matheus.crescer(0.05);
        matheus.aniversario();
        aluno1.estudar();
        aluno2.estudar();
        professor1.ensinar();
        
        

/* 
        // Acessando os atributos do objeto rafael
        System.out.println(rafael.getName());
        System.out.println(rafael.getAge());
        System.out.println(rafael.getAltura());
        System.out.println(rafael.getPeso());


        // Mudando os atributos do objeto rafael
        rafael.setAge(40);
        rafael.setPeso(85.3);


        // Chamando o método introduce() do objeto rafael novamente
        rafael.introduce();
*/
    }
}
