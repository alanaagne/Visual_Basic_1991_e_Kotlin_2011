fun main() {
    val dicionario: InterfaceDicionario = Dicionario()

    dicionario.adicionarDefinicao("Kotlin", "Uma linguagem de programação moderna e concisa.")
    dicionario.adicionarDefinicao("Map", "Uma estrutura de dados que armazena pares de chave-valor.")

    println(dicionario.imprimir())

    println("Definição de 'Kotlin': ${dicionario.selecionarDefinicao("Kotlin")}")

    dicionario.atualizarDefinicao("Kotlin", "Uma linguagem de programação moderna, concisa e interoperável com Java.")
    println("Definição atualizada de 'Kotlin': ${dicionario.selecionarDefinicao("Kotlin")}")

    dicionario.removerDefinicao("Map")
    println(dicionario.imprimir())
}
