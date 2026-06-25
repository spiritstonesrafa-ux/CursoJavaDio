public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Instanciando um objeto da classe Bateria
        Bateria moura1 = new Bateria("Moura", 60, "M60AD", 12, 460, 520.00, 10);
        
        /* TESTES DE ENCAPSULAMENTO

        System.out.println(moura1.getEstoque());    // Mostrar estoque antes de alterar
        moura1.setEstoque(5);              // Alterar estoque
        System.out.println(moura1.getEstoque());   // Mostrar estoque após a alteração

        moura1.setPreco(-520.00);
        moura1.setPreco(535.00);
        System.out.println(moura1.getPreco());

        FIM DOS TESTES DE ENCAPSULAMENTO */



        // Chamando o método para exibir os dados
        moura1.dadosBateria();
        moura1.descontoPix(10);
        moura1.verificarPremium();
        moura1.venderUma();
        moura1.venderUma();
        moura1.recomendar();
        

        // Instanciando outro objeto da classe Bateria
        Bateria heliar1 = new Bateria("Heliar", 60, "HE60HD", 12, 480, 520.00, 10);
        // Chamando o método para exibir os dados
        heliar1.dadosBateria();
        heliar1.descontoPix(10);
        heliar1.verificarPremium();
        heliar1.venderUma();
        heliar1.compararCca(moura1);
        heliar1.venderUma();
        heliar1.recomendar();


        // Instanciando outro objeto da classe Bateria
        Bateria zetta1 = new Bateria("Zetta", 50, "Z50ED", 12, 330, 410.00,2);
        // Chamando o método para exibir os dados
        zetta1.dadosBateria();
        zetta1.descontoPix(10);
        zetta1.verificarPremium();
        zetta1.compararCca(moura1);
        zetta1.venderUma();
        zetta1.venderUma();
        zetta1.recomendar();


        Bateria pioneiro = new Bateria("Pioneiro", 60, "P60D", 12, 320, 380.00, 10);
        pioneiro.dadosBateria();
        pioneiro.descontoPix(10);
        pioneiro.verificarPremium();
        pioneiro.recomendar();




        Bateria acDelco = new Bateria("ACDelco", 60, "AC60D", 12, 450, 520.00, 10);
        acDelco.dadosBateria();
        acDelco.descontoPix(10);
        acDelco.verificarPremium();
        acDelco.recomendar();
        acDelco.venderUma();

    } 


}
