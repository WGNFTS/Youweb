@RestController
@RequestMapping("/api/seguidores")
public class SeguidorController {

    @Autowired
    private SeguidorService seguidorService;

    @GetMapping("/")
    public List<Seguidor> getAllSeguidores() {
        return seguidorService.getAllSeguidores();
    }

    @GetMapping("/{id}")
    public Seguidor getSeguidorById(@PathVariable Long id) {
        return seguidorService.getSeguidorById(id);
    }

    @PostMapping("/")
    public Seguidor createSeguidor(@RequestBody Seguidor seguidor) {
        return seguidorService.createSeguidor(seguidor);
    }

    @DeleteMapping("/{id}")
    public void deleteSeguidor(@PathVariable Long id) {
        seguidorService.deleteSeguidor(id);
    }
}
