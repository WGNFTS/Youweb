@RestController
@RequestMapping("/api/curtidas")
public class CurtidaController {

    @Autowired
    private CurtidaService curtidaService;

    @GetMapping("/")
    public List<Curtida> getAllCurtidas() {
        return curtidaService.getAllCurtidas();
    }

    @GetMapping("/{id}")
    public Curtida getCurtidaById(@PathVariable Long id) {
        return curtidaService.getCurtidaById(id);
    }

    @PostMapping("/")
    public Curtida createCurtida(@RequestBody Curtida curtida) {
        return curtidaService.createCurtida(curtida);
    }

    @DeleteMapping("/{id}")
    public void deleteCurtida(@PathVariable Long id) {
        curtidaService.deleteCurtida(id);
    }
}
