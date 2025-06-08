Estrutura de Dados com Java<br>
Exercício Aplicável - Catálogo de Produtos por Categoria<br><br>
Contexto real: <br>
Imagine que você está desenvolvendo um sistema para uma loja online. Os produtos são organizados em uma árvore binária de busca por nome, e cada produto pertence a uma categoria, sendo que as categorias são armazenadas e acessadas rapidamente usando uma tabela hash (HashMap). <br><br>

Objetivos do exercício: <br>
- Criar uma árvore binária de busca (BST) para armazenar produtos ordenadamente por nome. <br>
- Usar um HashMap para mapear categorias para listas de produtos. <br>
- Permitir busca por nome de produto e por categoria. <br><br>

 Requisitos funcionais:<br>
1.	Classe Produto com: :<br>
- String nome:<br>
- double preco:<br>
- String categoria:<br>
2.	Classe NodeProduto (nó da árvore) com: :<br>
- Produto produto:<br>
- NodeProduto esquerda:<br>
- NodeProduto direita:<br>
3.	Classe ArvoreProduto com métodos: <br>
- void inserir(Produto produto) – insere o produto na árvore pela ordem do nome. <br>
- Produto buscar(String nome) – busca um produto pelo nome. <br>
- void imprimirEmOrdem() – imprime todos os produtos em ordem alfabética. <br>
4.	No main: <br>
- Criar produtos e inseri-los na árvore. <br>
- Usar um HashMap<String, List<Produto>> para mapear categorias para os produtos. <br>
- Permitir ao usuário: <br>
a) Buscar um produto pelo nome. <br>
b) Ver todos os produtos de uma categoria. <br>

<br><br>
Saída no console: <br> <br>
![image](https://github.com/user-attachments/assets/036aaca7-3eb6-4588-a5ab-7598794d770a)
