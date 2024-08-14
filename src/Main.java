public class Main {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca estoque = new ArvoreBinariaDeBusca();

        estoque.inserirProduto(new Produto(61, "Notebook", 50));
        estoque.inserirProduto(new Produto(43, "Mouse", 200));
        estoque.inserirProduto(new Produto(89, "Teclado", 150));

        estoque.inserirProduto(new Produto(100, "Processador", 50));
        estoque.inserirProduto(new Produto(90, "Pendrive", 200));
        estoque.inserirProduto(new Produto(66, "PC", 150));

        estoque.inserirProduto(new Produto(79, "Memória RAM", 50));
        estoque.inserirProduto(new Produto(77, "Cabo VGA", 200));
        estoque.inserirProduto(new Produto(82, "Cabo HDMI", 150));

        estoque.inserirProduto(new Produto(16, "Pasta térmica", 50));
        estoque.inserirProduto(new Produto(51, "Cooler", 200));
        estoque.inserirProduto(new Produto(11, "Suporte para notebook", 150));

        estoque.inserirProduto(new Produto(32, "Placa mãe", 50));
        estoque.inserirProduto(new Produto(51, "Placa de rede", 200));
        estoque.inserirProduto(new Produto(55, "Placa de vídeo", 150));


       Produto p = estoque.buscarProduto(51);
        if (p != null) {
            System.out.println("Produto encontrado: " + p.getNome() + ", Quantidade: " + p.getQuantidade() + ", Código: " + p.getCodigo());
        } else {
            System.out.println("Produto não encontrado!");
        }

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
