import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recomendacao {
    private static Map<String, List<String>> historicoVisualizacao = new HashMap<>();

    public static void registrarVisualizacao(String usuario, String videoId) {
        // Simulação de registro de visualização de vídeo por usuário
        historicoVisualizacao.putIfAbsent(usuario, new ArrayList<>());
        historicoVisualizacao.get(usuario).add(videoId);
    }

    public static List<String> obterRecomendacoes(String usuario) {
        // Simulação de geração de recomendações com base no histórico de visualização
        List<String> historico = historicoVisualizacao.getOrDefault(usuario, new ArrayList<>());
        List<String> recomendacoes = new ArrayList<>();
        // Lógica de recomendação aqui (pode ser algoritmo personalizado)
        return recomendacoes;
    }
}

