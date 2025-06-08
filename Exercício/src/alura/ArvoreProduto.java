package alura;

public class ArvoreProduto {
	  private NodeProduto raiz;

	    public void inserir(Produto produto) {
	        raiz = inserirRecursivo(raiz, produto);
	    }

	    private NodeProduto inserirRecursivo(NodeProduto atual, Produto produto) {
	        if (atual == null) {
	            return new NodeProduto(produto);
	        }
	        if (produto.nome.compareToIgnoreCase(atual.produto.nome) < 0) {
	            atual.esquerda = inserirRecursivo(atual.esquerda, produto);
	        } else {
	            atual.direita = inserirRecursivo(atual.direita, produto);
	        }
	        return atual;
	    }

	    public Produto buscar(String nome) {
	        return buscarRecursivo(raiz, nome);
	    }

	    private Produto buscarRecursivo(NodeProduto atual, String nome) {
	        if (atual == null) return null;
	        if (nome.equalsIgnoreCase(atual.produto.nome)) return atual.produto;
	        if (nome.compareToIgnoreCase(atual.produto.nome) < 0) {
	            return buscarRecursivo(atual.esquerda, nome);
	        } else {
	            return buscarRecursivo(atual.direita, nome);
	        }
	    }

	    public void imprimirEmOrdem() {
	        imprimirRecursivo(raiz);
	    }

	    private void imprimirRecursivo(NodeProduto atual) {
	        if (atual != null) {
	            imprimirRecursivo(atual.esquerda);
	            System.out.println(atual.produto);
	            imprimirRecursivo(atual.direita);
	        }
	    }
}
