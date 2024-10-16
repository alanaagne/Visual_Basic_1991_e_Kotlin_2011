fun main() {
    val listaCompras: InterfaceListaCompras = ListaCompras(10)

    listaCompras.adicionarItem(ItemCompra("Maçã", 5))
    listaCompras.adicionarItem(ItemCompra("Banana", 12))
    listaCompras.adicionarItem(ItemCompra("Laranja", 8))

    println(listaCompras.imprimir())

    listaCompras.apagarItem(2)
    listaCompras.atualizarItem(0, ItemCompra("Abacaxi", 2))

    println(listaCompras.selecionarItem(1))
    println(listaCompras.imprimir())

    // Teste dos novos métodos
    listaCompras.adicionarItem(ItemCompra("Uva", 3))
    println(listaCompras.selecionarTodos())
    listaCompras.apagarTodos()
    println(listaCompras.imprimir())
}
