package br.com.bytebank.banco.modelo;

public class Designer extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do DESIGNER");
        return 200;
    }
}
