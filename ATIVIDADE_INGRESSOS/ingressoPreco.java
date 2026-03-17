package ATIVIDADE_INGRESSOS;

public class ingressoPreco extends Ingresso implements Imprimivelel {

    public ingressoPreco(int preco) {
        super(preco);
    }

    @Override
    public void imprimirLocalizacao(){};
    public void imprimirTaxa(){};
    public void imprimirPreco(){
        System.out.println("Preço: " + preco);
    };
    
}
