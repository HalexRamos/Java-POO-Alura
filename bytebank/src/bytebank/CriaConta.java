package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println(primeiraConta.saldo);
        primeiraConta.agencia = 146;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);


        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        segundaConta.agencia = 146;
        System.out.println(segundaConta.agencia);

        if (primeiraConta == segundaConta ) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
