@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

    @Autowired
    private AssinaturaService assinaturaService;

    @GetMapping("/")
    public List<Assinatura> getAllAssinaturas() {
        return assinaturaService.getAllAssinaturas();
    }

    @GetMapping("/{id}")
    public Assinatura getAssinaturaById(@PathVariable Long id) {
        return assinaturaService.getAssinaturaById(id);
    }

    @PostMapping("/")
    public Assinatura createAssinatura(@RequestBody Assinatura assinatura) {
        return assinaturaService.createAssinatura(assinatura);
    }

    @DeleteMapping("/{id}")
    public void deleteAssinatura(@PathVariable Long id) {
        assinaturaService.deleteAssinatura(id);
    }
}
