import java.util.ArrayList;
import java.util.List;

public class CursoRepository {
    private List<Curso> cursos;

    public CursoRepository(){
        this.cursos = new ArrayList<Curso>();
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
    }

    public Curso getCursoPorNome(String nome) throws Exception{ 
        for (Curso curso : cursos){
            if(curso.getNome() == nome){
                return curso;
            }
        }
        throw new Exception("Curso não Encontrado");
    }

    public int getSize(){
        return this.cursos.size();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}
