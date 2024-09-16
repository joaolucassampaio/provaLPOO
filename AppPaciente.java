package exercicioDois;
import io.InOut;

public class AppPaciente {
    public static void main(String[] args) {
        // Array de pacientes com capacidade para 5
        Paciente[] pacientes = new Paciente[5];
        
        String opcao = "";

        do {
            opcao = exibirMenu();
            switch(opcao) {
                case "1":
                    cadastrarPacientes(pacientes);
                    break;

                case "2":
                    consultarPaciente(pacientes);
                    break;

                case "3":
                    imprimirTodosPacientes(pacientes);
                    break;

                case "4":
                    System.exit(0);
                    break;
                    
                default:
                    InOut.msgDeInformacao("", "Opção inválida!");
            }
        } while(!opcao.equals("4"));
    }

    // Método para exibir o menu
    public static String exibirMenu() {
        return InOut.leString("\nMenu:\n1. Cadastrar pacientes\n2. Consultar paciente\n3. Imprimir todos os pacientes\n4. Sair\nEscolha uma opção: ");
    }

    // Método para cadastrar pacientes até preencher o array
    public static void cadastrarPacientes(Paciente[] pacientes) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] == null) { // Verifica se o paciente já está cadastrado no índice
                String nome = InOut.leString("Nome do paciente: ");
                String cpf = InOut.leString("CPF do paciente: ");
                String dataNasc = InOut.leString("Data de nascimento do paciente: ");
                
                pacientes[i] = new Paciente(nome, cpf, dataNasc);
                InOut.msgDeAviso(null, "Paciente cadastrado com sucesso!");
                return; // Sai após cadastrar um paciente
            }
        }
        InOut.msgDeInformacao(null, "Não há mais espaço para cadastrar novos pacientes.");
    }

    // Método para consultar um paciente pelo nome
    public static void consultarPaciente(Paciente[] pacientes) {
        String nomeConsulta = InOut.leString("Digite o nome do paciente para consulta: ");
        boolean encontrado = false;

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.getNome().equalsIgnoreCase(nomeConsulta)) {
                InOut.msgDeAviso(null, "Nome: " + paciente.getNome());
                InOut.msgDeAviso(null, "CPF: " + paciente.getCpf());
                InOut.msgDeAviso(null, "Data de Nascimento: " + paciente.getDataNasc());
                InOut.msgDeAviso(null, "Histórico: " + paciente.getHistorico());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            InOut.msgDeAviso(null, "Paciente não encontrado.");
        }
    }

    // Método para imprimir o nome e CPF de todos os pacientes
    public static void imprimirTodosPacientes(Paciente[] pacientes) {
        System.out.println("\nLista de todos os pacientes:");
        for (Paciente paciente : pacientes) {
            if (paciente != null) {
                System.out.println("Nome: " + paciente.getNome() + ", CPF: " + paciente.getCpf());
            }
        }
    }
}
