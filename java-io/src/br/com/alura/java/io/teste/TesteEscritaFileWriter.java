package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/halex/Documents/estudos/alura/java/java oo/java-io/lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("askdjakjs kajsd jkaskjdasjkdasjkd");

        bw.close();
    }
}
