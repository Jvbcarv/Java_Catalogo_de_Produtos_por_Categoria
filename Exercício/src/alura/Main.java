package alura;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreProduto arvore = new ArvoreProduto();
        HashMap<String, List<Produto>> categorias = new HashMap<>();

        // Lista de produtos
        Produto[] produtos = {
            new Produto("Camiseta", 49.99, "Roupas"),
            new Produto("Celular", 1200.00, "Eletronicos"),
            new Produto("Aspirador", 350.00, "Eletronicos"),
            new Produto("Jaqueta", 199.90, "Roupas")
        };

        // Inserção na árvore e na tabela hash
        for (Produto p : produtos) {
            arvore.inserir(p);
            categorias.computeIfAbsent(p.categoria, k -> new ArrayList<>()).add(p);
        }

        // Impressão dos produtos em ordem alfabética
        System.out.println("Produtos cadastrados (em ordem alfabetica):");
        arvore.imprimirEmOrdem();

        System.out.println("\nDigite uma categoria para ver os produtos:");
        String catBusca = scanner.nextLine();
        List<Produto> listaCategoria = categorias.get(catBusca);
        if (listaCategoria != null) {
            System.out.println("Produtos da categoria \"" + catBusca + "\":");
            for (Produto p : listaCategoria) {
                System.out.println("- " + p.nome);
            }
        } else {
            System.out.println("Categoria não encontrada.");
        }

        System.out.println("\nDigite o nome de um produto para buscar:");
        String nomeBusca = scanner.nextLine();
        Produto encontrado = arvore.buscar(nomeBusca);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}