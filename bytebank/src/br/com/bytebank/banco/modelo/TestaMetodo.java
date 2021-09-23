package br.com.bytebank.banco.modelo;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoHalex = new Conta();

        contaDoHalex.saldo = 100;
        contaDoHalex.deposita(50);
        System.out.println(contaDoHalex.saldo);

        boolean conseguiuRetirar = contaDoHalex.saca(20);
        System.out.println(contaDoHalex.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoHalex);

        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoHalex.saldo);

        contaDoHalex.titular = "halex penha ramos";
        System.out.println(contaDoHalex.titular);
    }
}
