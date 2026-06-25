public class Bateria {
    // Atributos
    private String marca;
    private int amperagem;
    private String modelo;
    private int voltagem;
    private int cca;
    private double preco;
    private int estoque;

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public int getAmperagem() {
        return amperagem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVoltagem() {
        return voltagem;
    }


    public int getCca() {
        return cca;
    }


    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0)
        this.estoque = estoque;
        else
        System.out.println("Estoque inválido");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0)
        this.preco = preco;
        else
        System.out.println("Preço inválido");
    }
        

    // Construtor
    public Bateria(String marca, int amperagem, String modelo, int voltagem, int cca, double preco, int estoque) {
        this.marca = marca;
        this.amperagem = amperagem;
        this.modelo = modelo;
        this.voltagem = voltagem;
        this.cca = cca;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Método
    void dadosBateria() {
        System.out.println("Marca: " + marca);
        System.out.println("Amperagem: " + amperagem + "ah");
        System.out.println("Modelo: " + modelo);
        System.out.println("Voltagem: " + voltagem + "v");
        System.out.println("CCA: " + cca);
        System.out.printf("Preço R$: %.2f\n", preco);
        System.out.println("Estoque: " + estoque);
    }

    // Método para aplicar desconto percentual no preço. (ESCOLHER O DESCONTO NO ARQUIVO MAIN AO CHAMAR O METODO [descontoPix] ).
    void descontoPix(double percentual) {
        preco = preco - (preco * percentual / 100);
        System.out.printf("Preço com desconto R$: %.2f\n", preco);
    }

    // Método para verificar se a bateria é Premium ou convencional.
    void verificarPremium() {
        if (cca >= 450) {
            System.out.println("Bateria Premium");
        } else { System.out.println("Bateria convencional");
        }
    }

    // Método para comparar baterias 
    // (No arquivo MAIN ao chamar o método [compararCca] colocamos o modelo da bateria que queremos comparar)
    void compararCca(Bateria outraBateria) {
        if (this.cca > outraBateria.cca) {
            System.out.println(this.modelo + " Possui o maior CCA");
        } else {
            System.out.println(outraBateria.modelo + " Possui o maior CCA");
        }
    }

    void venderUma() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Bateria vendida" + "\n" + "Estoque: " + estoque);
        } else {
            System.out.println("Bateria sem estoque");
        }
    }

    void recomendar() {
        if (cca >= 450) {
            System.out.println("Linha de recomendação: Bateria Premium");
        } else if (cca >= 350) {
            System.out.println("Linha de recomendação: Bateria Intermediaria");
        } else {
            System.out.println("Linha de recomendação: Bateria Economica");
        }
    }
}

