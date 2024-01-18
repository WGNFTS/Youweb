// Simulação de comentários
const videoComments = [];

function addComment(videoId, userId, commentText) {
    // Adicione um novo comentário à lista de comentários
    const comment = { videoId, userId, text: commentText };
    videoComments.push(comment);
}

function getVideoComments(videoId) {
    // Retorne os comentários de um vídeo específico
    return videoComments.filter(comment => comment.videoId === videoId);
}

function deleteComment(commentId) {
    // Exclua um comentário com base no ID (simulado)
    const index = videoComments.findIndex(comment => comment.id === commentId);
    if (index !== -1) {
        videoComments.splice(index, 1);
    }
}
