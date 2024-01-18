@RestController
@RequestMapping("/api/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping("/")
    public List<Anuncio> getAllAnuncios() {
        return anuncioService.getAllAnuncios();
    }

    @GetMapping("/{id}")
    public Anuncio getAnuncioById(@PathVariable Long id) {
        return anuncioService.getAnuncioById(id);
    }

    @PostMapping("/")
    public Anuncio createAnuncio(@RequestBody Anuncio anuncio) {
        return anuncioService.createAnuncio(anuncio);
    }

    @DeleteMapping("/{id}")
    public void deleteAnuncio(@PathVariable Long id) {
        anuncioService.deleteAnuncio(id);
    }
}
