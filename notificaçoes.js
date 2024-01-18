// Simulação de notificações
const notifications = [];

function sendNotification(userId, message) {
    // Envie uma notificação para o usuário (simulado)
    const notification = { userId, message };
    notifications.push(notification);
}

function notifyNewComment(videoId, userId) {
    // Notifique o usuário sobre um novo comentário (simulado)
    const message = `Novo comentário no vídeo ${videoId}`;
    sendNotification(userId, message);
}
