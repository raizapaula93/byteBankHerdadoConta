package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.00);

        cc.transfere(10,cp);
        cp.transfere(310,cc);
        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());
    }
}
