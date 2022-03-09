package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;//Integer

        //WRAPPER - classes que existem para cada tipo primitivo (existem para que haja compatibilidade com as coleções)

        Integer idadeRef = Integer.valueOf(29);//autoboxing

        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);


        int valor = idadeRef.intValue();//unboxing

        String s = args[0]; //"10"

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing (transformação de primitivo para objeto)

    }
}
