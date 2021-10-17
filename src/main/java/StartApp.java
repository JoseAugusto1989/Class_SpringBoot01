import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StartApp {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("123DR565");

        Autor autor = factory.getBean(Autor.class);
        autor.setNomeAutor("J.K.Rowling");
        livro.view();

        ((AbstractApplicationContext)factory).close();

    }
}
