public class Autor implements AutorLivro {

    private String nomeAutor;

    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void viewAutor() {
        System.out.println(this.nomeAutor);
    }
}
