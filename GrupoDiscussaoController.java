@RestController
@RequestMapping("/api/grupos-discussao")
public class GrupoDiscussaoController {

    @Autowired
    private GrupoDiscussaoService grupoDiscussaoService;

    @GetMapping("/")
    public List<GrupoDiscussao> getAllGruposDiscussao() {
        return grupoDiscussaoService.getAllGruposDiscussao();
    }

    @GetMapping("/{id}")
    public GrupoDiscussao getGrupoDiscussaoById(@PathVariable Long id) {
        return grupoDiscussaoService.getGrupoDiscussaoById(id);
    }

    @PostMapping("/")
    public GrupoDiscussao createGrupoDiscussao(@RequestBody GrupoDiscussao grupoDiscussao) {
        return grupoDiscussaoService.createGrupoDiscussao(grupoDiscussao);
    }

    @DeleteMapping("/{id}")
    public void deleteGrupoDiscussao(@PathVariable Long id) {
        grupoDiscussaoService.deleteGrupoDiscussao(id);
    }
}
