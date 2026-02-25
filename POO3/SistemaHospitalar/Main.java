package SistemaHospitalar;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Medico> medicos = new ArrayList<>();
        List<Paciente> pacientes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n==== HOSPITAL ====");
            System.out.println("1 - Cadastrar médico");
            System.out.println("2 - Cadastrar paciente");
            System.out.println("3 - Registrar consulta");
            System.out.println("4 - Listar consultas de paciente");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Especialidade: ");
                    String esp = sc.nextLine();
                    medicos.add(new Medico(nome, esp));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    pacientes.add(new Paciente(sc.nextLine()));
                    break;

                case 3:
                    if (medicos.isEmpty() || pacientes.isEmpty()) {
                        System.out.println("Cadastre médico e paciente primeiro!");
                        break;
                    }

                    System.out.println("Escolha paciente:");
                    for (int i = 0; i < pacientes.size(); i++)
                        System.out.println(i + " - " + pacientes.get(i).getNome());

                    int p = Integer.parseInt(sc.nextLine());

                    System.out.println("Escolha médico:");
                    for (int i = 0; i < medicos.size(); i++)
                        System.out.println(i + " - " + medicos.get(i).getNome());

                    int m = Integer.parseInt(sc.nextLine());

                    System.out.print("Descrição do prontuário: ");
                    String desc = sc.nextLine();//////////////

                    Consulta consulta = new Consulta(medicos.get(m), pacientes.get(p), desc);

                    pacientes.get(p).adicionarConsulta(consulta);
                    break;

                case 4:

                    if (pacientes.isEmpty()) {
                        System.out.println("Nenhum paciente cadastrado!");
                        break;
                    }

                    System.out.println("Escolha paciente:");
                    for (int i = 1; i < pacientes.size(); i++) {
                        System.out.println(i + " - " + pacientes.get(i).getNome());
                    }

                    int indice = Integer.parseInt(sc.nextLine());

                    List<Consulta> consultas = pacientes.get(indice).getConsultas();

                    if (consultas.isEmpty()) {
                        System.out.println("Esse paciente não possui consultas.");
                    } else {
                        for (int i = 0; i < consultas.size(); i++) {
                            System.out.println("Médico: " + consultas.get(i).getMedico().getNome());
                            System.out.println("Prontuário: " + consultas.get(i).getProntuario().getDescricao());
                           
                        }
                    }
                    break;
            }

        } while (opcao != 0);
        {

        }

    }
}
// lista as consultas e os protuarios
