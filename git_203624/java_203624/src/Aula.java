public class Aula {
    private String titulo;
    private int minutagem;

    public Aula(String titulo, int minutagem) {
        this.titulo = titulo;
        this.minutagem = minutagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getMinutagem() {
        return minutagem;
    }
}
