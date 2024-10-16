class ListaCompras(tamanho: Int) : InterfaceListaCompras {
    private val lista: Array<ItemCompra?> = arrayOfNulls(tamanho)
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var quantidade = 0

    override fun estaCheia(): Boolean {
        return (quantidade == lista.size)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String {
        var retorno = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            if (i == ponteiroFim) {
                retorno += "${lista[(ponteiroAux + i) % lista.size]}"
            } else {
                retorno += "${lista[(ponteiroAux + i) % lista.size]}, "
            }
        }
        return "$retorno]"
    }

    override fun adicionarItem(item: ItemCompra) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % lista.size
            lista[ponteiroFim] = item
            quantidade++
        } else {
            println("A lista está cheia")
        }
    }

    override fun atualizarItem(posicao: Int, item: ItemCompra) {
        if (!estaVazia()) {
            if (posicao in 0 until quantidade) {
                val posicaoFisica = (ponteiroInicio + posicao) % lista.size
                lista[posicaoFisica] = item
            } else {
                println("Posição inválida")
            }
        } else {
            println("A lista está vazia")
        }
    }

    override fun selecionarItem(posicao: Int): ItemCompra? {
        var itemAux: ItemCompra? = null
        if (!estaVazia()) {
            if (posicao in 0 until quantidade) {
                val posicaoFisica = (ponteiroInicio + posicao) % lista.size
                itemAux = lista[posicaoFisica]
            } else {
                println("Posição inválida")
            }
        } else {
            println("A lista está vazia")
        }
        return itemAux
    }

    override fun apagarItem(posicao: Int) {
        if (!estaVazia()) {
            if (posicao in 0 until quantidade) {
                val posicaoFisica = (ponteiroInicio + posicao) % lista.size
                var ponteiroAux = posicaoFisica
                for (i in posicao until quantidade - 1) {
                    val atual = ponteiroAux
                    val proximo = (ponteiroAux + 1) % lista.size
                    lista[atual] = lista[proximo]
                    ponteiroAux++
                }
                ponteiroFim = (ponteiroFim - 1 + lista.size) % lista.size
                quantidade--
            } else {
                println("Posição inválida")
            }
        } else {
            println("A lista está vazia")
        }
    }

    override fun selecionarTodos(): List<ItemCompra?> {
        val itens = mutableListOf<ItemCompra?>()
        if (!estaVazia()) {
            for (i in 0 until quantidade) {
                val posicaoFisica = (ponteiroInicio + i) % lista.size
                itens.add(lista[posicaoFisica])
            }
        }
        return itens
    }

    override fun apagarTodos() {
        if (!estaVazia()) {
            for (i in 0 until quantidade) {
                lista[i] = null
            }
            ponteiroInicio = 0
            ponteiroFim = -1
            quantidade = 0
        } else {
            println("A lista já está vazia")
        }
    }
}
