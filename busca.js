// Simulação de pesquisa avançada
const videos = [
    { id: 'video1', title: 'Video 1', category: 'Entretenimento' },
    { id: 'video2', title: 'Video 2', category: 'Educação' },
    { id: 'video3', title: 'Video 3', category: 'Esportes' },
];

function searchVideos(query, filters) {
    // Realize a pesquisa e aplique filtros (simulado)
    return videos.filter(video => video.title.toLowerCase().includes(query.toLowerCase()));
}

function filterByCategory(category) {
    // Filtrar vídeos por categoria
    return videos.filter(video => video.category === category);
}
