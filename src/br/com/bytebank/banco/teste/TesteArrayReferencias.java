package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.sql.SQLOutput;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        //int[]idades = new int[5];
        Object[] referencias= new Object[5];

        ContaCorrente cc1 =  new ContaCorrente(22,335);
        referencias[0] = cc1;

        ContaPoupanca cc2 =  new ContaPoupanca(55,322);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

//        System.out.println(contas[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca)referencias[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
