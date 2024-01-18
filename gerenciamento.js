// Simulação de gerenciamento de conteúdo
const userVideos = [];

function uploadVideo(userId, videoData) {
    // Faça o upload de um novo vídeo (simulado)
    const video = { userId, ...videoData };
    userVideos.push(video);
}

function deleteVideo(videoId) {
    // Exclua um vídeo com base no ID (simulado)
    const index = userVideos.findIndex(video => video.id === videoId);
    if (index !== -1) {
        userVideos.splice(index, 1);
    }
}
