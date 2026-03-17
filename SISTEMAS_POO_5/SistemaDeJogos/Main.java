package SISTEMAS_POO_5.SistemaDeJogos;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador jogador = new Jogador("Player1");
        Personagem heroi = new Personagem("Guerreiro");
        jogador.adicionarPersonagem(heroi);

        Item espada = new Item("Espada", true);
        Item escudo = new Item("Escudo", true);
        Item pocao = new Item("Poção", false);

        heroi.getInventario().adicionarItem(espada);
        heroi.getInventario().adicionarItem(escudo);
        heroi.getInventario().adicionarItem(pocao);

        espada.equipar();

        Guilda guilda = new Guilda("Dragões");
        heroi.entrarGuilda(guilda);

        int opcao;

        do {
            System.out.println("\n==== SISTEMA JOGO ====");
            System.out.println("1 - Mostrar inventário");
            System.out.println("2 - Mostrar membros da guilda");
            System.out.println("3 - Mostrar itens equipados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    List<Item> itens = heroi.getInventario().getItens();
                    for (int i = 0; i < itens.size(); i++) {
                        System.out.println(itens.get(i).getNome());
                    }
                    break;

                case 2:
                    List<Personagem> membros = guilda.getMembros();
                    for (int i = 0; i < membros.size(); i++) {
                        System.out.println(membros.get(i).getNome());
                    }
                    break;

                case 3:
                    List<Item> itensEquipados = heroi.getInventario().getItens();
                    for (int i = 0; i < itensEquipados.size(); i++) {
                        if (itensEquipados.get(i).isEquipado()) {
                            System.out.println(itensEquipados.get(i).getNome());
                        }
                    }
                    break;

                case 0:
                    break;

            }

        } while (opcao != 0);

        
    }
}