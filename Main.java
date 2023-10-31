import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiosque quiosque = new Quiosque();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Quiosque do IFTech");

        try {
            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Identificar Aluno");
                System.out.println("2. Escolher Minicurso");
                System.out.println("3. Informar Cartão de Crédito");
                System.out.println("4. Finalizar");

                int opcao;
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Opção inválida. Digite um número válido.");
                    scanner.nextLine(); // Limpar o buffer
                    continue;
                }

                switch (opcao) {
                    case 1:
                        if (quiosque.getState() instanceof EmEspera) {
                            System.out.println("Digite sua matrícula (Formato de 3 números): ");
                            String matricula = scanner.nextLine();
                            quiosque.identificarAluno(matricula);
                        } else {
                            System.out.println("Essa ação não é permitida no estado atual.");
                        }
                        break;
                    case 2:
                        if (quiosque.getState() instanceof Identificado) {
                            System.out.println("Escolha o minicurso (GPT, BLOCKCHAIN, IOT, VR): ");
                            String minicurso = scanner.nextLine();
                            quiosque.escolherMinicurso(minicurso);
                        } else {
                            System.out.println("Essa ação não é permitida no estado atual.");
                        }
                        break;
                    case 3:
                        if (quiosque.getState() instanceof Processando) {
                            System.out.println("Informe o cartão de crédito: ");
                            String cartao = scanner.nextLine();
                            quiosque.informarCartao(cartao);
                        } else {
                            System.out.println("Aguarde a autorização do cartão de crédito antes de informar o cartão.");
                        }
                        break;
                    case 4:
                        if (quiosque.getState() instanceof Inscrito) {
                            quiosque.finalizar();
                            System.out.println("Operação finalizada. Obrigado!");
                            return;
                        } else {
                            System.out.println("Você deve escolher um minicurso e informar o cartão de crédito antes de finalizar.");
                        }
                        break;
                    default:
                        System.out.println("Escolha uma opção válida.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}
