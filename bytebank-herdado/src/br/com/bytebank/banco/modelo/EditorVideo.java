package br.com.bytebank.banco.modelo;

public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO");
        return 150;
    }
}
