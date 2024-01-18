// Funções para integração de compartilhamento social
function shareOnFacebook(videoId) {
    // Implemente a lógica para compartilhar um vídeo no Facebook
    const videoUrl = getVideoUrl(videoId);
    const shareLink = `https://www.facebook.com/sharer.php?u=${videoUrl}`;
    openSharePopup(shareLink);
}

function shareOnTwitter(videoId) {
    // Implemente a lógica para compartilhar um vídeo no Twitter
    const videoUrl = getVideoUrl(videoId);
    const shareLink = `https://twitter.com/intent/tweet?url=${videoUrl}`;
    openSharePopup(shareLink);
}

function shareOnInstagram(videoId) {
    // Implemente a lógica para compartilhar um vídeo no Instagram
    const videoUrl = getVideoUrl(videoId);
    const shareLink = `https://www.instagram.com/?url=${videoUrl}`;
    openSharePopup(shareLink);
}

function getVideoUrl(videoId) {
    // Recupere a URL do vídeo com base no ID (simulado)
    return `https://example.com/videos/${videoId}`;
}

function openSharePopup(shareLink) {
    // Abra uma janela pop-up para compartilhamento
    window.open(shareLink, '_blank');
}
