import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoricoPesquisa {
    private static Map<String, List<String>> historico = new HashMap<>();

    public static void registrarConsulta(String usuario, String consulta) {
        // Simulação de registro de consulta no histórico
        historico.putIfAbsent(usuario, new ArrayList<>());
        historico.get(usuario).add(consulta);
    }

    public static List<String> obterHistoricoConsulta(String usuario) {
        // Simulação de obtenção do histórico de consulta de um usuário
        return historico.getOrDefault(usuario, new ArrayList<>());
    }
}

