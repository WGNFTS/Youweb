public class Autenticacao {
    private static Map<String, String> usuarios = new HashMap<>();

    public static boolean validarCredenciais(String email, String senha) {
        // Simulação de autenticação com dados armazenados em memória
        String senhaArmazenada = usuarios.get(email);
        return senhaArmazenada != null && senhaArmazenada.equals(senha);
    }

    public static void registrarUsuario(String email, String senha) {
        // Simulação de registro de usuário com armazenamento em memória
        usuarios.put(email, senha);
    }
}

