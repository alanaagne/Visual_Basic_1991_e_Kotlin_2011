interface InterfaceListaCompras {
    fun adicionarItem(item: ItemCompra)                 // Adiciona um novo item
    fun apagarItem(posicao: Int)                        // Apaga um item da lista
    fun selecionarItem(posicao: Int): ItemCompra?       // Seleciona um item existente
    fun atualizarItem(posicao: Int, item: ItemCompra)   // Atualiza um item existente
    fun estaCheia(): Boolean                            // Verificador
    fun estaVazia(): Boolean                            // Verificador
    fun imprimir(): String                              // Exibir lista
    fun selecionarTodos(): List<ItemCompra?>            // Seleciona todos os itens
    fun apagarTodos()                                   // Apaga todos os itens
}
