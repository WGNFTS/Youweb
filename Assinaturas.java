import java.util.HashMap;
import java.util.Map;

public class Assinaturas {
    private static Map<String, Boolean> statusAssinatura = new HashMap<>();

    public static void definirStatusAssinatura(String usuario, boolean ativa) {
        // Simulação de definição do status de assinatura para um usuário
        statusAssinatura.put(usuario, ativa);
    }

    public static boolean verificarAssinatura(String usuario) {
        // Simulação de verificação do status de assinatura de um usuário
        return statusAssinatura.getOrDefault(usuario, false);
    }
}

