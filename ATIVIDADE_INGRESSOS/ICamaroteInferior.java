package ATIVIDADE_INGRESSOS;

public class ICamaroteInferior extends Ingresso implements Imprimivelel{
    private String localizacao;

    public ICamaroteInferior(int preco, String localizacao) {
        super(preco);
        this.localizacao = localizacao;
    }
    public String getLocalizacao() {return localizacao;}
    public void setLocalizacao(String localizacao) {this.localizacao = localizacao;}

    @Override
    public void imprimirLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }
    public void imprimirTaxa(){};
    public void imprimirPreco(){
        System.out.println("Preço: " + preco);
    };

}
