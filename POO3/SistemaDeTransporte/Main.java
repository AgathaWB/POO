package SistemaDeTransporte;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Motorista> motoristas = new ArrayList<>();
        List<Passageiro> passageiros = new ArrayList<>();
        List<Corrida> corridas = new ArrayList<>();

        int opcao;
        do {
            /// parte 1
            System.out.println("\n==== TRANSPORTE ====");
            System.out.println("1 - Cadastrar motorista");
            System.out.println("2 - Cadastrar passageiro");
            System.out.println("3 - Solicitar corrida");//não precisa

            /// parte 2
            System.out.println("4 - Listar corridas do motorista");
            System.out.println("5 - Listar corridas do passageiro");
            System.out.println("6 - Mostrar pagamento de uma corrida");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                /// 1
                case 1:
                    System.out.print("Nome do motorista: ");
                    motoristas.add(new Motorista(sc.nextLine()));
                    break;

                case 2:
                    System.out.print("Nome do passageiro: ");
                    passageiros.add(new Passageiro(sc.nextLine()));
                    break;

                case 3:
                    if (motoristas.isEmpty() || passageiros.isEmpty()) {
                        System.out.println("Cadastre motorista e passageiro primeiro!");
                        break;
                    }
                    System.out.println("Escolha passageiro:");
                    for (int i = 0; i < passageiros.size(); i++)
                        System.out.println(i + " - " + passageiros.get(i).getNome());
                    int p = Integer.parseInt(sc.nextLine());

                    System.out.println("Escolha motorista:");
                    for (int i = 0; i < motoristas.size(); i++)
                        System.out.println(i + " - " + motoristas.get(i).getNome());
                    int m = Integer.parseInt(sc.nextLine());

                    System.out.print("Origem: ");
                    String origem = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    Corrida corrida = new Corrida(origem, destino, valor, motoristas.get(m), passageiros.get(p));
                    corridas.add(corrida);
                    break;

                /// 2
                case 4:
                    System.out.println("Escolha motorista:");
                    for (int i = 0; i < motoristas.size(); i++) {
                        System.out.println(i + " - " + motoristas.get(i).getNome());
                    }

                    int mi = Integer.parseInt(sc.nextLine());

                    List<Corrida> corridasMotorista = motoristas.get(mi).getCorridas();
                    for (int i = 0; i < corridasMotorista.size(); i++) {
                        System.out.println(
                                corridasMotorista.get(i).getOrigem() + " -> " +
                                        corridasMotorista.get(i).getDestino());
                    }
                    break;

                case 5:
                    System.out.println("Escolha passageiro:");
                    for (int i = 0; i < passageiros.size(); i++) {
                        System.out.println(i + " - " + passageiros.get(i).getNome());
                    }

                    int pi = Integer.parseInt(sc.nextLine());

                    List<Corrida> corridasPassageiro = passageiros.get(pi).getCorridas();
                    for (int i = 0; i < corridasPassageiro.size(); i++) {
                        System.out.println(
                                corridasPassageiro.get(i).getOrigem() + " -> " +
                                        corridasPassageiro.get(i).getDestino());
                    }
                    break;
                case 6:
                    if (corridas.isEmpty()) {
                        System.out.println("Nenhuma corrida registrada!");
                        break;
                    }
                    System.out.println("Escolha corrida:");
                    for (int i = 0; i < corridas.size(); i++)
                        System.out.println(
                                i + " - " + corridas.get(i).getOrigem() + " -> " + corridas.get(i).getDestino());
                    int ci = Integer.parseInt(sc.nextLine());
                    System.out.println("Pagamento: " + corridas.get(ci).getPagamento().getValor());
                    break;
            }

        } while (opcao != 0);

    }
}