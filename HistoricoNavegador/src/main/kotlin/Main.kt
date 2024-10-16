fun main() {
    val historicoNavegador: InterfaceHistorico = PilhaHistorico(10)

    historicoNavegador.empilhar(Pagina("https://www.google.com"))
    historicoNavegador.empilhar(Pagina("https://www.microsoft.com"))
    historicoNavegador.empilhar(Pagina("https://www.github.com"))

    println(historicoNavegador.imprimir())

    println("Página atual: ${historicoNavegador.espiar()}")

    println("Voltando para a página anterior...")
    historicoNavegador.desempilhar()

    println("Página atual: ${historicoNavegador.espiar()}")
    println(historicoNavegador.imprimir())
}
