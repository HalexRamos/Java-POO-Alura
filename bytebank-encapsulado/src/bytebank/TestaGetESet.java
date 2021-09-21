package bytebank;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 25255);

        System.out.println(conta.getNumero());

        Cliente halex = new Cliente();
        halex.setNome("Halex Penha Ramos");

        conta.setTitular(halex);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());
    }
}
