class Dicionario : InterfaceDicionario {
    private val dicionario: MutableMap<String, String> = mutableMapOf()

    override fun adicionarDefinicao(palavra: String, definicao: String) {
        dicionario[palavra] = definicao
    }

    override fun removerDefinicao(palavra: String) {
        if (dicionario.containsKey(palavra)) {
            dicionario.remove(palavra)
        } else {
            println("A palavra '$palavra' não existe no dicionário.")
        }
    }

    override fun selecionarDefinicao(palavra: String): String? {
        return dicionario[palavra]
    }

    override fun atualizarDefinicao(palavra: String, definicao: String) {
        if (dicionario.containsKey(palavra)) {
            dicionario[palavra] = definicao
        } else {
            println("A palavra '$palavra' não existe no dicionário.")
        }
    }

    override fun estaVazio(): Boolean {
        return dicionario.isEmpty()
    }

    override fun imprimir(): String {
        return dicionario.entries.joinToString(", ") { "${it.key}: ${it.value}" }
    }
}
