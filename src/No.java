class No {
    Produto produto;
    No esquerda, direita;

    public No(Produto produto) {
        this.produto = produto;
        this.esquerda = this.direita = null;
    }
}
