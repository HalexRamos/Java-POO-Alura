package br.com.bytebank.banco.modelo;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente halex = new Cliente();
        halex.nome = "Halex Penha Ramos";
        halex.cpf = "397.447.128-64";
        halex.profissao = "Programador";

        Conta contaDoHalex = new Conta();
        contaDoHalex.deposita(100);

        contaDoHalex.titular = halex;
        System.out.println(contaDoHalex.titular.nome);
    }
}
