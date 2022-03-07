package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteConta {
    public static void main(String[] args) throws SaldoInsuficienteException {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200.0);

        ContaCorrente cc = new ContaCorrente(555, 203);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(678, 907);
        cp.deposita(200.0);

        cc.transfere(50.0, cp);


        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto cal = new CalculadorImposto();
        cal.registra(cc);
        cal.registra(seguro);

        System.out.println(cal.getTotalImposto());

    }
}
