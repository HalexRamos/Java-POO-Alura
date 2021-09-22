package bytebank;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente halex = new Gerente();
        halex.setNome("Halex Penha Ramos");
        halex.setCpf("222222222-22");
        halex.setSalario(2600.00);

        System.out.println(halex.getNome());
        System.out.println(halex.getBonificacao());
    }
}
