@RestController
@RequestMapping("/api/avaliacoes-video")
public class AvaliacaoVideoController {

    @Autowired
    private AvaliacaoVideoService avaliacaoVideoService;

    @GetMapping("/")
    public List<AvaliacaoVideo> getAllAvaliacoesVideo() {
        return avaliacaoVideoService.getAllAvaliacoesVideo();
    }

    @GetMapping("/{id}")
    public AvaliacaoVideo getAvaliacaoVideoById(@PathVariable Long id) {
        return avaliacaoVideoService.getAvaliacaoVideoById(id);
    }

    @PostMapping("/")
    public AvaliacaoVideo createAvaliacaoVideo(@RequestBody AvaliacaoVideo avaliacaoVideo) {
        return avaliacaoVideoService.createAvaliacaoVideo(avaliacaoVideo);
    }

    @PutMapping("/{id}")
    public AvaliacaoVideo updateAvaliacaoVideo(@PathVariable Long id, @RequestBody AvaliacaoVideo avaliacaoVideo) {
        return avaliacaoVideoService.updateAvaliacaoVideo(id, avaliacaoVideo);
    }

    @DeleteMapping("/{id}")
    public void deleteAvaliacaoVideo(@PathVariable Long id) {
        avaliacaoVideoService.deleteAvaliacaoVideo(id);
    }
}
