package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adiciona(new Aula("Criando uma aula", 20));
    javaColecoes.adiciona(new Aula("Modelando colecoes", 22));
    Aluno a1 = new Aluno("Rodrigo Turini", 34672);

    Aluno a2 = new Aluno("Guilherme Silveira", 34673);
    Aluno a3 = new Aluno("Mauricio Aniche", 34674);

    javaColecoes.matricula(a1);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);

    System.out.println("Quem eh o aluno com matricula 34672");
    Aluno aluno = javaColecoes.buscaMatriculado(34672);

    System.out.println("aluno: " + aluno);

    }
}