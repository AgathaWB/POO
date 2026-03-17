package SISTEMAS_POO_5.Ecommerce;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //dados de teste
        Fornecedor fornecedor = new Fornecedor("Tech Distribuidora");
        Fornecedor fornecedorM = new Fornecedor("Bruno eletronicos");

        Produto p1 = new Produto("Notebook", fornecedor);
        Produto p2 = new Produto("Mouse Gamer", fornecedorM);

        Cliente cliente = new Cliente("Ana");

        Pedido pedido = new Pedido("NF123");
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        cliente.adicionarPedido(pedido);

        int opcao;

        do {
            System.out.println("\n==== SISTEMA E-COMMERCE ====");
            System.out.println("1 - Ver pedidos do cliente");
            System.out.println("2 - Ver produtos do pedido");
            System.out.println("3 - Ver fornecedor de um produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    List<Pedido> pedidos = cliente.getPedidos();
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("Nota Fiscal: " +
                                pedidos.get(i).getNotaFiscal().getNumero());
                    }
                    break;

                case 2:
                    List<Produto> produtos = pedido.getProdutos();
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Produto: " +
                                produtos.get(i).getNome());
                    }
                    break;

                case 3:
                    System.out.println("Fornecedor do Notebook: " +
                            p1.getFornecedor().getNome());
                             System.out.println("Fornecedor do Mouse Gamer: " +
                            p2.getFornecedor().getNome());
                
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

     
    }
}