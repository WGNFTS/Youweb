public class Comentarios {
    private static Map<String, List<String>> comentariosPorVideo = new HashMap<>();

    public static void adicionarComentario(String videoId, String comentario) {
        // Simulação de armazenamento de comentários por vídeo
        if (!comentariosPorVideo.containsKey(videoId)) {
            comentariosPorVideo.put(videoId, new ArrayList<>());
        }
        comentariosPorVideo.get(videoId).add(comentario);
    }

    public static List<String> obterComentariosPorVideo(String videoId) {
        // Simulação de recuperação de comentários por vídeo
        return comentariosPorVideo.getOrDefault(videoId, new ArrayList<>());
    }
}

