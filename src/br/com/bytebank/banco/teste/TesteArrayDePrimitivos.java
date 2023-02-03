package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {

        //int[]idades = new int[5];
        ContaCorrente[] contas = new ContaCorrente[5];//criei somente o espaço, n
        ContaCorrente cc1 = new ContaCorrente(8,318);
        contas[0]=cc1;
        ContaCorrente cc2 = new ContaCorrente(9,33);
        contas[1]=cc2;

        System.out.println(cc2.getNumero());

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];

        System.out.println(ref.getNumero());
    }
}
