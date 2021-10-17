import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorLivro;

    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public AutorLivro getAutorLivro() {
        return autorLivro;
    }
    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void view() {
        System.out.println(this.nome + " - " + this.codigo);
        autorLivro.viewAutor();
    }
}
