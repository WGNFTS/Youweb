public class ArmazenamentoVideos {
    private static List<String> videosArmazenados = new ArrayList<>();

    public static void fazerUpload(String video) {
        // Simulação de upload de vídeo
        videosArmazenados.add(video);
    }

    public static void excluirVideo(String video) {
        // Simulação de exclusão de vídeo
        videosArmazenados.remove(video);
    }

    public static List<String> obterVideosArmazenados() {
        // Simulação de obtenção de lista de vídeos armazenados
        return videosArmazenados;
    }
}

