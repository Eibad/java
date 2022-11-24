
@RestController
@RequestMapping("v1")
public class SearchController {

    @Autowired
    private DealsListingService dealsListingService;

    @Autowired
    private UserLocationsService userLocationsService;


    @GetMapping("/public/consumer/search")
    public ResponseEntity<SearchResponseDto> search(SearchRequestDto searchRequestDto,
                                                         @PageableDefault(size = 10) Pageable pageable,
                                                         @RequestHeader(required = false, name = "user-id")
                                                                     String userId) {
        return ResponseEntity.ok(dealsListingService.searchBrands(searchRequestDto,userId, pageable));
    }
