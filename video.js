// Funções para manipular vídeos
function playVideo() {
    const videoElement = document.getElementById('videoPlayer');
    videoElement.play();
}

function pauseVideo() {
    const videoElement = document.getElementById('videoPlayer');
    videoElement.pause();
}

function seekTo(time) {
    const videoElement = document.getElementById('videoPlayer');
    videoElement.currentTime = time;
}

