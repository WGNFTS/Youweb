@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/")
    public List<Video> searchVideos(@RequestParam String query) {
        return searchService.searchVideos(query);
    }
}
