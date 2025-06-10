package alura;

public class NodeProduto {
	    Produto produto;
	    NodeProduto esquerda;
	    NodeProduto direita;

	    public NodeProduto(Produto produto) {
	        this.produto = produto;
	        this.esquerda = null;
	        this.direita = null;
	    }
}
