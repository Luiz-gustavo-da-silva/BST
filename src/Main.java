public class Main {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca estoque = new ArvoreBinariaDeBusca();

        estoque.inserirProduto(new Produto(101, "Notebook", 50));
        estoque.inserirProduto(new Produto(50, "Mouse", 200));
        estoque.inserirProduto(new Produto(200, "Teclado", 150));

        Produto p = estoque.buscarProduto(50);
        if (p != null) {
            System.out.println("Produto encontrado: " + p.getNome() + ", Quantidade: " + p.getQuantidade() + ", Código: " + p.getCodigo());
        } else {
            System.out.println("Produto não encontrado!");
        }

        System.out.println("Início");
        estoque.exibirProdutosEmOrdem();
        System.out.println("Fim");
        estoque.removerProduto(101);
        System.out.println("Início");
        estoque.exibirProdutosEmOrdem();
        System.out.println("Fim");

        System.out.println("Início");
        estoque.exibirProdutosEmPreOrdem();
        System.out.println("Fim");
        System.out.println("Início");
        estoque.exibirProdutosEmPosOrdem();
        System.out.println("Fim");

        Produto menorCodigo = estoque.exibirProdutoComMenorCodigo();
        if (menorCodigo != null) {
            System.out.println("Produto com menor código: " + menorCodigo);
        }

        Produto maiorCodigo = estoque.exibirProdutoComMaiorCodigo();
        if (maiorCodigo != null) {
            System.out.println("Produto com maior código: " + maiorCodigo);
        }
    }
}
