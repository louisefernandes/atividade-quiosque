import java.util.List;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        Quiosque quiosque = new Quiosque();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Quiosque do IFTech\n");

        while (true) {
            //Em espera
            try{
                System.out.println("Informe Sua Matrícula");
                String matricula = scanner.next();
                System.out.println(quiosque.identificarAluno(matricula));

                //Identificado
                try{
                    System.out.println("Escolha o Minicurso: ");
                    List<Curso> cursos = quiosque.getCursos().getCursos();
                    for (int i=0;i<cursos.size();i++){
                        System.out.println((i+1)+"."+cursos.get(i).getNome());
                    }
                    int numero = scanner.nextInt();
                    System.out.println(quiosque.escolherMinicurso(cursos.get(numero-1).getNome()));

                    //Processando
                    try{
                        System.out.println("Digite o Numero do Seu Cartão: ");
                        String cartao = scanner.next();
                        System.out.println(quiosque.informarCartao());

                        //Inscrito
                        try{
                            System.out.println(quiosque.emitirTicket());

                            //Finalizado
                            try{
                                System.out.println(quiosque.finalizar());
                            }catch(Exception e){
                                System.out.println(e);
                                System.out.println("Volte Sempre.");
                                break;
                            }

                        }catch(Exception e){
                            System.out.println(e);
                            System.out.println("Volte Sempre.");
                        }

                    }catch(Exception e){
                        System.out.println(e);
                        System.out.println("Volte Sempre.");
                    }
                }catch(Exception e){
                    System.out.println(e);
                    System.out.println("Volte Sempre.");   
                }
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Volte Sempre.");
            }
        }
         scanner.close();     
    }
    
}
