public class Quiosque {
    private QuiosqueState state = new EmEspera(this);
    private CursoRepository cursos = new CursoRepository();
    private AlunoRepository alunos = new AlunoRepository();
    private Aluno aluno;
    private Curso curso;

    public Quiosque() {
        this.alunos.adicionarAluno(new Aluno("Gonzaga", "123", 50));
        this.alunos.adicionarAluno(new Aluno("Louise", "456", 400));
        this.alunos.adicionarAluno(new Aluno("Jardielen", "789", 100));        
        this.alunos.adicionarAluno(new Aluno("Fred", "111", 200));

        this.cursos.adicionarCurso(new Curso("GPT", 100));
        this.cursos.adicionarCurso(new Curso("BlockChain", 90));
        this.cursos.adicionarCurso(new Curso("IOT", 80));
        this.cursos.adicionarCurso(new Curso("VR", 70));
    }

    public void setState(QuiosqueState state) {
        this.state = state;
    }

    public QuiosqueState getState(){
        return this.state;
    }

    public String efetuarTransicao(){
        return this.state.proximoState();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public CursoRepository getCursos() {
        return cursos;
    }

    public AlunoRepository getAlunos() {
        return alunos;
    }

    public String identificarAluno(String matricula) throws Exception{
        try{
            this.aluno = alunos.validarAluno(matricula);
            return this.efetuarTransicao(); 
        }catch (Exception e){
            throw new Exception("Matrícula Inválida. " + e);
        }
    }

    public String escolherMinicurso(String minicurso) throws Exception {
        if(this.state instanceof Identificado){
            try{
                this.curso = this.cursos.getCursoPorNome(minicurso);
                return this.efetuarTransicao();
            }catch (Exception e){
                throw new Exception(e);
            }
        }
        throw new Exception("Não pode escolhe um minicurso sem identificar um aluno.");
    }

    public String informarCartao() throws Exception {
        if(this.state instanceof Processando){
            return this.efetuarTransicao();
        }
        throw new Exception("Não pode informar cartão sem identificar um aluno.");
    }

    public String emitirTicket() throws Exception {
        if(this.state instanceof Inscrito){
            return this.efetuarTransicao();
        }
        throw new Exception("Não pode Emitir ticket sem identificar um aluno.");
    }

    public String finalizar() throws Exception {
        if(this.state instanceof Finalizado){
            return this.efetuarTransicao();
        }
        throw new Exception("Não pode finalizar o processo sem identificar um aluno.");
    }


    
}

