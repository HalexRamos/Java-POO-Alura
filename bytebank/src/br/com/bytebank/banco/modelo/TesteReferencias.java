package br.com.bytebank.banco.modelo;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("sao a mesmissima conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
