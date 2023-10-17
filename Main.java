import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiosque quiosque = new Quiosque();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Bem-vindo ao Quiosque do IFTech");
                System.out.println("Escolha a ação:");
                System.out.println("1. Identificar Aluno");
                System.out.println("2. Escolher Minicurso");
                System.out.println("3. Informar Cartão de Crédito");
                System.out.println("4. Finalizar");

                int escolha = scanner.nextInt();
                scanner.nextLine(); 

                switch (escolha) {
                    case 1:
                        System.out.println("Digite sua matrícula: ");
                        String matricula = scanner.nextLine();
                        quiosque.identificarAluno(matricula);
                        break;
                    case 2:
                        System.out.println("Escolha o minicurso (GPT, BLOCKCHAIN, IOT, VR): ");
                        String minicurso = scanner.nextLine();
                        quiosque.escolherMinicurso(minicurso);
                        break;
                    case 3:
                        System.out.println("Informe o cartão de crédito: ");
                        String cartao = scanner.nextLine();
                        quiosque.informarCartao(cartao);
                        break;
                    case 4:
                        quiosque.finalizar();
                        System.out.println("Operação finalizada. Obrigado!");
                        return; // Encerra o programa
                    default:
                        System.out.println("Escolha uma opção válida.");
                }
            }
        } finally {
            scanner.close(); // Fecha o Scanner no bloco finally
        }
    }
}
