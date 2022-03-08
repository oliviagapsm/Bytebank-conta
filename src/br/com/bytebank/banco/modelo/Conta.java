package br.com.bytebank.banco.modelo;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(){

    }

    public Conta(int agencia, int numero) {
        total++;
        //System.out.println("o total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        // System.out.println("estou criando uma conta" + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ",  Valor: "+ valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode número menor igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor igual a zero!");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Número: " + this.numero + " Agencia: " + this.agencia;
    }
}
