package br.com.bytebank.banco.teste;

public class TesteStri {
    public static void main(String[] args) {

        String vazio = "     Alura    ";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("a"));
        System.out.println(outroVazio.isEmpty());

        String nome = "Alura"; //object literal
        //String outro = new String("Alura");

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
