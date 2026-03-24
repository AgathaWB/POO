

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        Produto produtoA = new Produto(1, "Mouse", 192.45);
        Produto produtoB = new Produto(2, "Teclado", 559.59);
        Produto produtoC = new Produto(3, "Monitor", 2120.29);
        Produto produtoD = new Produto(4, "Headset", 350.00);
        Produto produtoE = new Produto(5, "Mousepad", 70.00);

        System.out.println("Bem vindo a loja virtual be6y5!");

        ProdutoDAOLista produtos = new ProdutoDAOLista();
        produtos.inserir(produtoA);
        produtos.inserir(produtoB);
        produtos.inserir(produtoC);
        produtos.inserir(produtoD);
        produtos.inserir(produtoE);

        for (Produto p : produtos.listar()) {
            System.out.printf("%d. Nome: %s | Preço: %.2f\n",
                    p.getId(), p.getNome(), p.getPreco());
        }

        System.out.println("Qual produto você gostaria de ver?");
        int idProcurado = sc.nextInt();

        boolean encontrado = false;

        for (Produto p : produtos.listar()) {
            if (p.getId() == idProcurado) {
                System.out.printf("%d. Nome: %s | Preço: %.2f\n",
                        p.getId(), p.getNome(), p.getPreco());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado");
        }

       
        produtos.remover(1);

       
    }
}