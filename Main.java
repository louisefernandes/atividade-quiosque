

public class Main {

    public static void main(String[] args) {
        Quiosque quiosque = new Quiosque();

        for (Aluno aluno : quiosque.getAlunos().getAlunos()){

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Bem-vindo ao Quiosque do IFTech");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            sleep(1000);
            System.out.println(quiosque.getState());
    
            //Em Espera 
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Informando Matrícula: "+ aluno.getMatricula());
            System.out.println("Bem Vindo: "+ aluno.getNome());
            try {
                System.out.println(quiosque.identificarAluno(aluno.getMatricula()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            sleep(1000);
            System.out.println(quiosque.getState());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    
            //Identificado 
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Escolhendo o Curso: BlockChain");
            try {
                System.out.println(quiosque.escolherMinicurso("BlockChain"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            sleep(1000);
            System.out.println(quiosque.getState());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    
            //Processando 
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Informando Cartão de Crédito: 789456"+aluno.getMatricula());
            try {
                System.out.println(quiosque.informarCartao());
            } catch (Exception e) {
                e.printStackTrace();
            }
            sleep(1000);
            System.out.println(quiosque.getState());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    
            //Inscrito 
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Emitir o Ticket");
            try {
                System.out.println(quiosque.emitirTicket());
            } catch (Exception e) {
                e.printStackTrace();
            }
            sleep(1000);
            System.out.println(quiosque.getState());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    
            //Finalizado
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Finalizar Sessão");
            try {
                System.out.println(quiosque.finalizar());
            } catch (Exception e) {
                e.printStackTrace();
            }
            sleep(1000);
            System.out.println(quiosque.getState());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    private static void sleep(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
