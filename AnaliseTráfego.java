public class AnaliseTráfego {
    private static Map<String, Integer> paginasAcessadas = new HashMap<>();

    public static void registrarAcesso(String pagina) {
        // Simulação de registro de acesso à página
        paginasAcessadas.put(pagina, paginasAcessadas.getOrDefault(pagina, 0) + 1);
    }

    public static int obterAcessosPagina(String pagina) {
        // Simulação de obtenção de acessos de uma página
        return paginasAcessadas.getOrDefault(pagina, 0);
    }
}

