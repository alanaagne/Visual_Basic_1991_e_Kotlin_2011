class PilhaHistorico(tamanho: Int) : InterfaceHistorico {
    private var ponteiroTopo: Int = -1
    private var dados: Array<Pagina?> = arrayOfNulls(tamanho)

    constructor() : this(10)

    override fun empilhar(pagina: Pagina) {
        if (!estaCheia()) {
            ponteiroTopo++
            dados[ponteiroTopo] = pagina
        } else {
            println("Stack is full!")
        }
    }

    override fun desempilhar(): Pagina? {
        var paginaTopo: Pagina? = null
        if (!estaVazia()) {
            paginaTopo = dados[ponteiroTopo]
            dados[ponteiroTopo] = null
            ponteiroTopo--
        } else {
            println("Stack is empty!")
        }
        return paginaTopo
    }

    override fun atualizar(pagina: Pagina) {
        if (!estaVazia()) {
            dados[ponteiroTopo] = pagina
        } else {
            println("Stack is empty!")
        }
    }

    override fun espiar(): Pagina? {
        return if (!estaVazia()) {
            dados[ponteiroTopo]
        } else {
            println("Stack is empty!")
            null
        }
    }

    override fun estaCheia(): Boolean {
        return (ponteiroTopo == dados.size - 1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in ponteiroTopo downTo 0) {
            if (i == 0)
                resultado += "${dados[i]}"
            else
                resultado += "${dados[i]}, "
        }
        return "$resultado]"
    }
}
