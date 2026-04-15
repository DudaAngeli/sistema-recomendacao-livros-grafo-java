package main;

import model.Livro;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedList<Livro> livros = new LinkedList<>();

        livros.add(new Livro("Senhor dos Anéis", "Tolkien", "Fantasia", 1954, false));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia", 1937, true));
        livros.add(new Livro("As Crônicas de Nárnia", "C.S. Lewis", "Fantasia", 1950, false));

        livros.add(new Livro("Laranja Mecânica", "Anthony Burgess", "Distopia", 1962, false));
        livros.add(new Livro("1984", "George Orwell", "Distopia", 1949, true));
        livros.add(new Livro("Admirável Mundo Novo", "Aldous Huxley", "Distopia", 1932, false));

        livros.add(new Livro("Crime e Castigo", "Dostoiévski", "Romance", 1866, true));
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", "Romance", 1605, false));
        livros.add(new Livro("Orgulho e Preconceito", "Jane Austen", "Romance", 1813, false));
        livros.add(new Livro("O Grande Gatsby", "F. Scott Fitzgerald", "Romance", 1925, false));
        livros.add(new Livro("Guerra e Paz", "Liev Tolstói", "Romance", 1869, false));

        livros.add(new Livro("O Código Da Vinci", "Dan Brown", "Mistério", 2003, true));
        livros.add(new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", "Mistério", 1934, false));
        livros.add(new Livro("O Silêncio dos Inocentes", "Thomas Harris", "Mistério", 1988, true));

        livros.add(new Livro("O Exorcista", "William Peter Blatty", "Terror", 1971, true));
        livros.add(new Livro("Frankenstein", "Mary Shelley", "Terror", 1818, false));
        livros.add(new Livro("Drácula", "Bram Stoker", "Terror", 1897, true));

        livros.add(new Livro("Moby Dick", "Herman Melville", "Aventura", 1851, true));
        livros.add(new Livro("A Ilha do Tesouro", "Robert Louis Stevenson", "Aventura", 1883, false));
        livros.add(new Livro("Robinson Crusoé", "Daniel Defoe", "Aventura", 1719, false));

        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", "Sátira", 1945, false));
        livros.add(new Livro("As Viagens de Gulliver", "Jonathan Swift", "Sátira", 1726, false));
        livros.add(new Livro("Candide", "Voltaire", "Sátira", 1759, false));

        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", 1943, false));
        livros.add(new Livro("A Cigarra e a Formiga", "Esopo", "Fábula", 600, false));
        livros.add(new Livro("A Fazenda dos Animais", "George Orwell", "Fábula", 1945, false));

        HashMap<Livro, Set<Livro>> conexoes = new HashMap<>();

        for (Livro conexao : livros) {

            Set<Livro> relacionados = new HashSet<>();

            for (Livro outro : livros) {
                if (
                        conexao.getGenero().equalsIgnoreCase(outro.getGenero()) && !conexao.equals(outro)
                ) {
                    relacionados.add(outro);
                }
            }

            conexoes.put(conexao, relacionados);
        }

        System.out.println("\n===== Livros Disponíveis =====\n");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.print(livro.listaCompleta());
            }
        }

        System.out.println("\n===== Livros Emprestados =====");
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                System.out.print(livro.listaCompleta());
            }
        }

        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            boolean encontrado = false;

            System.out.println("\nDeseja ver recomendações baseadas em um livro ou gênero específico? S/N");
            String rep = sc.nextLine();

            if (rep.equalsIgnoreCase("n")) {
                System.out.println("\n-----Listando todos os livros registrados e suas recomendações-----\n");

                for (Livro livro : livros) {
                    System.out.print(livro.livroInfo());
                    System.out.println("  Recomendados (gênero: " + livro.getGenero() + "):");

                    for (Livro recomendado : conexoes.get(livro)) {
                        System.out.println("    - " + recomendado.getTitulo());
                    }
                    System.out.println();
                }

            } else if (rep.equalsIgnoreCase("s")) {

                System.out.println("Buscar por gênero ou título? G-Gênero | T-Título");
                rep = sc.nextLine();

                if (rep.equalsIgnoreCase("g")) {

                    System.out.println("Digite o gênero desejado:");
                    rep = sc.nextLine();

                    System.out.println("\nRecomendações baseadas no gênero: " + rep);

                    for (Livro livro : livros) {
                        if (livro.getGenero().equalsIgnoreCase(rep)) {
                            System.out.print(" - " + livro.livroInfo());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhum livro encontrado.");
                    }

                } else if (rep.equalsIgnoreCase("t")) {

                    System.out.println("Digite o título desejado:");
                    rep = sc.nextLine();

                    for (Livro livro : conexoes.keySet()) {
                        if (livro.getTitulo().equalsIgnoreCase(rep)) {

                            System.out.println("\nRecomendações baseadas no título: " + livro.getTitulo());

                            for (Livro recomendado : conexoes.get(livro)) {
                                System.out.print(" - " + recomendado.livroInfo());
                            }

                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhum livro encontrado.");
                    }

                } else {
                    System.out.println("Opção inválida.");
                }

            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println("\nDeseja continuar? (S/N)");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        sc.close();
    }
}