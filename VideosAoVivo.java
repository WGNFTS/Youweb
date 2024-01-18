import java.util.ArrayList;
import java.util.List;

public class VideosAoVivo {
    private static List<String> transmissoesAtivas = new ArrayList<>();

    public static void iniciarTransmissao(String titulo) {
        // Simulação de início de transmissão ao vivo
        transmissoesAtivas.add(titulo);
    }

    public static void encerrarTransmissao(String titulo) {
        // Simulação de encerramento de transmissão ao vivo
        transmissoesAtivas.remove(titulo);
    }

    public static List<String> obterTransmissoesAtivas() {
        // Simulação de obtenção de transmissões ao vivo ativas
        return transmissoesAtivas;
    }
}

