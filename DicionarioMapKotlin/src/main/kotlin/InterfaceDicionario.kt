interface InterfaceDicionario {
    fun adicionarDefinicao(palavra: String, definicao: String)  // Adiciona uma nova definição
    fun removerDefinicao(palavra: String)                       // Remove uma definição
    fun selecionarDefinicao(palavra: String): String?           // Seleciona uma definição existente
    fun atualizarDefinicao(palavra: String, definicao: String)  // Atualiza uma definição existente
    fun estaVazio(): Boolean                                    // Verificador
    fun imprimir(): String                                      // Exibir todas as definições
}
