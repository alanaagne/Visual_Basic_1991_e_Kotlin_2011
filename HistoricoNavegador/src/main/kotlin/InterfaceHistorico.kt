interface InterfaceHistorico {
    
        fun empilhar(pagina: Pagina)               // Adiciona uma nova página ao histórico
        fun desempilhar(): Pagina?                 // Volta para a página anterior
        fun atualizar(pagina: Pagina)              // Atualiza a página no topo
        fun espiar(): Pagina?                      // Acessa a página atual
        fun estaCheia(): Boolean                   // Verificador
        fun estaVazia(): Boolean                   // Verificador
        fun imprimir(): String                     // Exibir histórico completo

}