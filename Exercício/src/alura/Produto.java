package alura;

public class Produto {
	String nome;
    	double preco;
    	String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome + " | R$ " + preco + " | Categoria: " + categoria;
    }
}
