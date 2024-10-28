import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Curso{
    private String titulo;
    private String instrutor;
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
}