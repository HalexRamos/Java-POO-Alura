package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 112);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 223);
        cp.deposita(100.0);

        cc.transfere(10.0, cp);

        System.out.println("CC:" + cc.getSaldo());
        System.out.println("CC:" + cp.getSaldo());

    }
}
