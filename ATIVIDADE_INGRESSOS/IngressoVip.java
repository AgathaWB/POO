package ATIVIDADE_INGRESSOS;

public class IngressoVip extends Ingresso implements Imprimivelel {
    private int taxaVip;

    public IngressoVip(int preco, int taxaVip) {
        super(preco);
        this.taxaVip = taxaVip;
    }

    public int getTaxaVip() {return taxaVip;}
    public void setTaxaVip(int taxaVip) {this.taxaVip = taxaVip;}

    @Override
    public void imprimirLocalizacao(){};
    public void imprimirTaxa(){
        System.out.println("Taxa Vip: " + taxaVip);
    };
    public void imprimirPreco(){
        System.out.println("Preço: " + preco);
    };
}
