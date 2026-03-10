public class InCamaroteVip extends Ingresso implements Imprimivelel{
    private String localizacao;
    private int taxaVip;

    public InCamaroteVip(int preco, String localizacao, int taxaVip) {
        super(preco);
        this.localizacao = localizacao;
        this.taxaVip = taxaVip;
    }
    public String getLocalizacao() {return localizacao;}
    public void setLocalizacao(String localizacao) {this.localizacao = localizacao;}
    public int getTaxaVip() {return taxaVip;}
    public void setTaxaVip(int taxaVip) {this.taxaVip = taxaVip;}

    @Override
    public void imprimirLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }
    public void imprimirTaxa(){
        System.out.println("Taxa Vip: " + taxaVip);
    };
    public void imprimirPreco(){
        System.out.println("Preço: " + preco);
    };
}
