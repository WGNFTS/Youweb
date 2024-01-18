@RestController
@RequestMapping("/api/politicas-privacidade")
public class PoliticaPrivacidadeController {

    @Autowired
    private PoliticaPrivacidadeService politicaPrivacidadeService;

    @GetMapping("/")
    public List<PoliticaPrivacidade> getAllPoliticasPrivacidade() {
        return politicaPrivacidadeService.getAllPoliticasPrivacidade();
    }

    @GetMapping("/{id}")
    public PoliticaPrivacidade getPoliticaPrivacidadeById(@PathVariable Long id) {
        return politicaPrivacidadeService.getPoliticaPrivacidadeById(id);
    }

    @PostMapping("/")
    public PoliticaPrivacidade createPoliticaPrivacidade(@RequestBody PoliticaPrivacidade politicaPrivacidade) {
        return politicaPrivacidadeService.createPoliticaPrivacidade(politicaPrivacidade);
    }

    @DeleteMapping("/{id}")
    public void deletePoliticaPrivacidade(@PathVariable Long id) {
        politicaPrivacidadeService.deletePoliticaPrivacidade(id);
    }
}
