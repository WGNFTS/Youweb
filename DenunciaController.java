@RestController
@RequestMapping("/api/denuncias")
public class DenunciaController {

    @Autowired
    private DenunciaService denunciaService;

    @GetMapping("/")
    public List<Denuncia> getAllDenuncias() {
        return denunciaService.getAllDenuncias();
    }

    @GetMapping("/{id}")
    public Denuncia getDenunciaById(@PathVariable Long id) {
        return denunciaService.getDenunciaById(id);
    }

    @PostMapping("/")
    public Denuncia createDenuncia(@RequestBody Denuncia denuncia) {
        return denunciaService.createDenuncia(denuncia);
    }

    @PutMapping("/{id}")
    public Denuncia updateDenuncia(@PathVariable Long id, @RequestBody Denuncia denuncia) {
        return denunciaService.updateDenuncia(id, denuncia);
    }

    @DeleteMapping("/{id}")
    public void deleteDenuncia(@PathVariable Long id) {
        denunciaService.deleteDenuncia(id);
    }
}
