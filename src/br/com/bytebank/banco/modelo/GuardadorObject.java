package br.com.bytebank.banco.modelo;

public class GuardadorObject {
    private Object[] ref;
    private int posicaoLivre2;

    public GuardadorObject(){
        this.ref = new Object[10];
        this.posicaoLivre2 = 0;
    }

    public GuardadorObject(Object ref){
        this.ref[this.posicaoLivre2] = ref;
        this.posicaoLivre2++;
    }

    public int getQuantidadedeElementosO(){
        return this.posicaoLivre2;
    }

    public Object getRef(int pos){
        return this.ref[pos];
    }
}
