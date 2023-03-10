public class ContaCorrente extends Conta implements Tributavel { //na herança herda-se atributos e métodos, mas não os construtores


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo +=valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor+ 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo*0.01;
    }
}

