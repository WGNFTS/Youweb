import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GruposDiscussao {
    private static Map<String, List<String>> grupos = new HashMap<>();

    public static void criarGrupo(String nomeGrupo) {
        // Simulação de criação de grupo de discussão
        grupos.put(nomeGrupo, new ArrayList<>());
    }

    public static void adicionarMembro(String nomeGrupo, String usuario) {
        // Simulação de adição de membro a um grupo
        List<String> membros = grupos.getOrDefault(nomeGrupo, new ArrayList<>());
        membros.add(usuario);
        grupos.put(nomeGrupo, membros);
    }

    public static List<String> obterMembros(String nomeGrupo) {
        // Simulação de obtenção de membros de um grupo
        return grupos.getOrDefault(nomeGrupo, new ArrayList<>());
    }
}

