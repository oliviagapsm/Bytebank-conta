package br.com.bytebank.banco.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteIterator {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
