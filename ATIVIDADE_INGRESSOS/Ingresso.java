package ATIVIDADE_INGRESSOS;

public abstract class Ingresso {
    protected int preco;

    public Ingresso(int preco){
        this.preco = preco;
    }

    public int getPreco() {return preco;}
    public void setPreco(int preco) {this.preco = preco;}

    public void imprimirLocalizacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirLocalizacao'");
    }
}
