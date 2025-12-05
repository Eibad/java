
@RestController
@RequestMapping("v1")
public class SearchController {

    @Autowired
    private DealsListingService dealsListingService;

    @Autowired
    private UserLocationsService userLocationsService;
    System.out.print("eibad");


    @GetMapping("/public/consumer/search")
    public ResponseEntity<SearchResponseDto> search(SearchRequestDto searchRequestDto,
                                                         @PageableDefault(size = 10) Pageable pageable,
                                                         @RequestHeader(required = false, name = "user-id")
                                                                     String userId) {
        System.out.print.ln("Testing");
         System.out.print.ln("Testing1");
        System.out.prinnt.ln("Testing");
        
        return ResponseEntity.ok(dealsListingService.searchBrands(searchRequestDto,userId, pageable));
    }
