public class Carro {
    // campos privados que representam o estado do carro
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        // inicializa o carro desligado, em ponto morto e com velocidade zero
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
        System.out.println("Carro criado: desligado, marcha 0, velocidade 0 km/h.");
    }

    public void ligar() {
        // ligar o carro só faz sentido se ele estiver desligado
        if (ligado) {
            System.out.println("O carro já está ligado.");
            return;
        }
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        // só pode desligar se o carro estiver ligado
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }
        // só permite desligar se estiver em marcha 0 e velocidade 0
        if (marcha != 0 || velocidade != 0) {
            System.out
                    .println("Não é possível desligar: o carro precisa estar em ponto morto e com velocidade 0 km/h.");
            return;
        }
        ligado = false;
        System.out.println("Carro desligado.");
    }

    public void acelerar() {
        // verifica se o carro está ligado antes de tentar acelerar
        if (!verificarOperacaoDisponivel("acelerar")) {
            return;
        }
        // não pode acelerar em ponto morto
        if (marcha == 0) {
            System.out.println("Não é possível acelerar com a marcha em ponto morto.");
            return;
        }
        // respeita a velocidade máxima de 120 km/h
        if (velocidade >= 120) {
            System.out.println("Velocidade máxima alcançada.");
            return;
        }
        int novaVelocidade = velocidade + 1;
        // checa se a nova velocidade está dentro dos limites da marcha atual
        if (!limiteDaMarcha(novaVelocidade, marcha)) {
            System.out.println("Não é possível acelerar: velocidade " + novaVelocidade
                    + " km/h fora dos limites da marcha " + marcha + ".");
            return;
        }
        velocidade = novaVelocidade;
        System.out.println("Acelerou para " + velocidade + " km/h.");
    }

    public void diminuirVelocidade() {
        // verifica se o carro está ligado antes de diminuir a velocidade
        if (!verificarOperacaoDisponivel("diminuir a velocidade")) {
            return;
        }
        // não pode diminuir além de 0 km/h
        if (velocidade <= 0) {
            System.out.println("A velocidade já está em 0 km/h.");
            return;
        }
        velocidade--;
        System.out.println("Velocidade reduzida para " + velocidade + " km/h.");
    }

    public void virarEsquerda() {
        // verificar se o carro está ligado antes de virar
        if (!verificarOperacaoDisponivel("virar à esquerda")) {
            return;
        }
        // só vira se estiver entre 1 e 40 km/h
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Só é possível virar com velocidade entre 1 km/h e 40 km/h. Velocidade atual: "
                    + velocidade + " km/h.");
            return;
        }
        System.out.println("Virou à esquerda com " + velocidade + " km/h.");
    }

    public void virarDireita() {
        // verificar se o carro está ligado antes de virar
        if (!verificarOperacaoDisponivel("virar à direita")) {
            return;
        }
        // só vira se estiver entre 1 e 40 km/h
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Só é possível virar com velocidade entre 1 km/h e 40 km/h. Velocidade atual: "
                    + velocidade + " km/h.");
            return;
        }
        System.out.println("Virou à direita com " + velocidade + " km/h.");
    }

    public void verificarVelocidade() {
        if (!ligado) {
            System.out.println("O carro esta desligado.");
            return;
        }
        if (velocidade == 0) {
            System.out.println("O carro esta parado.");
            return;
        } else {
            System.out.println("O carro está na marcha = " + marcha + ", com velocidade = " + velocidade + " km/h.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        // verifica se o carro está ligado antes de trocar marcha
        if (!verificarOperacaoDisponivel("trocar de marcha")) {
            return;
        }
        // a marcha deve ser de 0 a 6
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. Escolha entre 0 e 6.");
            return;
        }
        // não permite pular marchas: só aceita diferença de 1 marcha
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas. Marcha atual: " + marcha + ".");
            return;
        }
        // checa se a velocidade atual está dentro do limite da nova marcha
        if (!limiteDaMarcha(velocidade, novaMarcha)) {
            System.out.println("Não é possível trocar para a marcha " + novaMarcha + " com velocidade atual de "
                    + velocidade + " km/h.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha trocada para " + marcha + ".");
    }

    private boolean limiteDaMarcha(int velocidade, int marcha) {
        // define os limites de velocidade para cada marcha
        switch (marcha) {
            case 0:
                return velocidade == 0;
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade >= 21 && velocidade <= 40;
            case 3:
                return velocidade >= 41 && velocidade <= 60;
            case 4:
                return velocidade >= 61 && velocidade <= 80;
            case 5:
                return velocidade >= 81 && velocidade <= 100;
            case 6:
                return velocidade >= 101 && velocidade <= 120;
            default:
                return false;
        }
    }

    private boolean verificarOperacaoDisponivel(String acao) {
        // condição comum: o carro deve estar ligado para qualquer ação
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível " + acao + ".");
            return false;
        }
        return true;
    }
}
