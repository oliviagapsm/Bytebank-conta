package com.bytebank_conta;

public class TesteConta {
    public static void main(String[] args) {

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
