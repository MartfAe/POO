public class LivroTest {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Java Básico", "Deitel", 2015, 159.90);
        Livro livro3 = new Livro("Python Avançado", "Guido van Rossum");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();

        livro1.setTitulo("C#");
        livro1.setAutor("Microsoft");
        livro1.setAnoPublicacao(2020);
        livro1.setPreco(99.90);

        livro1.exibirDetalhes();

    }
}
