public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando instâncias de Livro com novos títulos
        Livro livro1 = new Livro("1984", "George Orwell", 1949, "978-0-452-28423-4");
        Livro livro2 = new Livro("A Revolução dos Bichos", "George Orwell", 1945, "978-0-452-28424-1");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "978-85-259-0001-1");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando uma instância de Usuario
        Usuario usuario = new Usuario("Carlos Silva", "U123");

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Buscando um livro pelo título
        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("A Revolução dos Bichos");
        if (livroBuscado != null) {
            // Emprestando o livro
            usuario.emprestarLivro(livroBuscado);
        }

        // Listando livros disponíveis após o empréstimo
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo o livro
        usuario.devolverLivro(livroBuscado);

        // Listando livros disponíveis após a devolução
        biblioteca.listarLivrosDisponiveis();
    }
}