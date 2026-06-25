public class Conta {
    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;

// Construtor (inicializa o saldo)
public Conta(double depositoInicial) {
    this.saldo = depositoInicial;

    // verifica qual vai ser o limite do cheque especial
    if (depositoInicial <= 500) {
        this.limiteChequeEspecial = 50;
    } else {
        this.limiteChequeEspecial = depositoInicial * 0.5;
    }
this.valorUsadoChequeEspecial = 0;   // começa sem usar nada do cheque especial.
}

// Getters 
public double getSaldo() {
    return saldo;
}

public double getLimiteChequeEspecial() {
    return limiteChequeEspecial;
}

public double getValorUsadoChequeEspecial() {
    return valorUsadoChequeEspecial;
}

// Métodos da classe
// Consultar saldo
public void saldo() {
    System.out.println("Seu saldo é: " + saldo);
}

// Consultar cheque especial
public void consultarChequeEspecial() {
    System.out.println("Seu cheque especial é: " + limiteChequeEspecial);
    System.out.println("Você já usou: " + valorUsadoChequeEspecial);
    System.out.println("Seu saldo disponível é: " + (limiteChequeEspecial - valorUsadoChequeEspecial));
}

// Depositar
public void depositar(double valor) {
    // verificar se o valor é válido
    if (valor <= 0) {
        System.out.println("Valor inválido");
        return;             // Encerra o método, sem fazer nada.
    }
    saldo += valor;
    System.out.println("Deposito realiozado com sucesso");
    System.out.println("Seu saldo é: " + saldo);

    // verificar se pegou cheque especial
    if (valorUsadoChequeEspecial > 0) {
        double taxa = valorUsadoChequeEspecial * 0.2;
        double dividaTotalcheq = valorUsadoChequeEspecial + taxa;
        if (saldo >= dividaTotalcheq) {
            saldo -= dividaTotalcheq;
            valorUsadoChequeEspecial = 0;
            System.out.println("Divida paga com sucesso");
            System.out.println("Seu saldo é: " + saldo);
        } else {
            System.out.println("Depósito insuficiente para quitar o cheque especial. Ainda deve: " + (dividaTotalcheq - saldo));
        }
    }
   
}

// Sacar
public void sacar(double valor) {
    // verificar se o valor é válido
    if (valor <= 0) {
        System.out.println("Valor inválido");
            return; 
        }
        // verificar se tem saldo suficiente
        double chequeDisponivel = limiteChequeEspecial - valorUsadoChequeEspecial;
        if (valor > saldo + chequeDisponivel) {
            System.out.println("Saldo insuficiente");
            return;
        }
    // fazer o saque
    if (valor <= saldo){
        saldo -= valor;
        System.out.println("Saque realizado com sucesso");
        System.out.println("Seu saldo é: " + saldo);
    } else {
        // fazer o saque usando o cheque especial (porque não tem saldo suficiente)
        double falta = valor - saldo;
        valorUsadoChequeEspecial += falta;
        saldo = 0;
        System.out.println("Saque realizado com sucesso usando cheque especial");
        System.out.println("Cheque especial usado: " + falta);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Você já usou: " + valorUsadoChequeEspecial + " no cheque especial");
    }
}
    
    // Pagar boleto (metodo semelhante ao de sacar)
    public void pagarBoleto(double valor) {
        // verificar se o valor é válido
       if (valor <= 0) {
        System.out.println("Valor inválido");
            return; 
        }

        double chequeDisponivel = limiteChequeEspecial - valorUsadoChequeEspecial;
        if (valor > saldo + chequeDisponivel) {
            System.out.println("Saldo insuficiente");
            return;
        }
        
    if (valor <= saldo){
        saldo -= valor;
        System.out.println("Boleto pago com sucesso");
        System.out.println("Seu saldo é: " + saldo);
    } else {
        double falta = valor - saldo;           // quanto falta no saldo
        valorUsadoChequeEspecial += falta;      // registra uso do cheque especial
        saldo = 0;                              // saldo zerado 
        System.out.println("Boleto pago com sucesso usando cheque especial");
        System.out.println("Cheque especial usado: " + falta);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Você já usou: " + valorUsadoChequeEspecial + " no cheque especial");
    }
}

    // Verificar se está usando cheque especial
    public void verificarSeUsaChequeEspecial() {
        if (valorUsadoChequeEspecial > 0) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }

}
