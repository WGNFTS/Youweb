// Simulação de sistema de denúncias
const reportedContent = [];

function reportContent(userId, videoId, reason) {
    // Registre uma denúncia de conteúdo inadequado (simulado)
    const report = { userId, videoId, reason };
    reportedContent.push(report);
}

function handleReport(videoId, moderatorId, decision) {
    // Lide com uma denúncia e tome uma decisão (simulado)
}
