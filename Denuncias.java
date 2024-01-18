public class Denuncias {
    private static List<String> denuncias = new ArrayList<>();

    public static void registrarDenuncia(String denuncia) {
        // Simulação de registro de denúncia
        denuncias.add(denuncia);
    }

    public static List<String> obterDenuncias() {
        // Simulação de obtenção de denúncias
        return denuncias;
    }
}

