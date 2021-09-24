package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt"));

//        PrintStream ps = new PrintStream("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt");

        PrintWriter ps = new PrintWriter("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("askdjakjs kajsd jkaskjdasjkdasjkd");

        ps.close();
    }
}
