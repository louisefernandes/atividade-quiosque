import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos;

    public AlunoRepository() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno validarAluno(String matricula) throws Exception {
        for(Aluno aluno: alunos){
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        throw new Exception("Aluno não encontrado");
    }
}

