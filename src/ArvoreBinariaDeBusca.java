public class ArvoreBinariaDeBusca {
    private No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    public void inserirProduto(Produto produto) {
        raiz = inserirRec(raiz, produto);
    }

    private No inserirRec(No raiz, Produto produto) {
        if (raiz == null) {
            raiz = new No(produto);
            return raiz;
        }

        if (produto.getCodigo() < raiz.produto.getCodigo()) {
            raiz.esquerda = inserirRec(raiz.esquerda, produto);
        } else if (produto.getCodigo() > raiz.produto.getCodigo()) {
            raiz.direita = inserirRec(raiz.direita, produto);
        } else {
            // Atualizar quantidade se o produto já existir
            raiz.produto.setQuantidade(produto.getQuantidade());
        }
        return raiz;
    }

    public void removerProduto(int codigo) {
        raiz = removerRec(raiz, codigo);
    }

    private No removerRec(No raiz, int codigo) {
        if (raiz == null) {
            return null;
        }

        if (codigo < raiz.produto.getCodigo()) {
            raiz.esquerda = removerRec(raiz.esquerda, codigo);
        } else if (codigo > raiz.produto.getCodigo()) {
            raiz.direita = removerRec(raiz.direita, codigo);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            No temp = encontrarMinimo(raiz.direita);
            raiz.produto = temp.produto;
            raiz.direita = removerRec(raiz.direita, temp.produto.getCodigo());
        }
        return raiz;
    }

    private No encontrarMinimo(No raiz) {
        No atual = raiz;
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    public Produto buscarProduto(int codigo) {
        return buscarRec(raiz, codigo);
    }

    private Produto buscarRec(No raiz, int codigo) {
        if (raiz == null || raiz.produto.getCodigo() == codigo) {
            return raiz != null ? raiz.produto : null;
        }

        if (codigo < raiz.produto.getCodigo()) {
            return buscarRec(raiz.esquerda, codigo);
        } else {
            return buscarRec(raiz.direita, codigo);
        }
    }

    public void exibirProdutosEmOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            System.out.println(raiz.produto);
            emOrdemRec(raiz.direita);
        }
    }

    public void exibirProdutosEmPreOrdem() {
        emPreOrdemRec(raiz);
    }

    private void emPreOrdemRec(No raiz) {
        if (raiz != null) {
            System.out.println(raiz.produto);
            emOrdemRec(raiz.esquerda);
            emOrdemRec(raiz.direita);
        }
    }

    public void exibirProdutosEmPosOrdem() {
        emPosOrdemRec(raiz);
    }

    private void emPosOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            emOrdemRec(raiz.direita);
            System.out.println(raiz.produto);
        }
    }

    public Produto exibirProdutoComMenorCodigo() {
        No no = encontrarMinimo(raiz);
        return no != null ? no.produto : null;
    }

    public Produto exibirProdutoComMaiorCodigo() {
        No no = encontraMax(raiz);
        return no != null ? no.produto : null;
    }

    private No encontraMax(No raiz) {
        No atual = raiz;
        while (atual.direita != null) {
            atual = atual.direita;
        }
        return atual;
    }
}
