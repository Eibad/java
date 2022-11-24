
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(SearchController.class)
public class SearchControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    DealsListingService dealsListingService;

    @MockBean
    UserLocationsService userLocationsService;

    @Test
    public void testSearchByBookCodeAndKeyword() throws Exception {
        SearchRequestDto searchRequestDto = new SearchRequestDto("bookCode","keyword");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(searchRequestDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("user-id","userId");

        MultiValueMap<String,String> paramsMap = new LinkedMultiValueMap<>();
        paramsMap.add("keyword", "keyword");
        paramsMap.add("bookCode","bookcode");

        when(dealsListingService.searchBrands(Mockito.any(SearchRequestDto.class), Mockito.anyString(), Mockito.any(Pageable.class))).thenReturn(new SearchResponseDto());

        this.mockMvc.perform(get("/v1/public/consumer/search")
                .headers(httpHeaders).params(paramsMap)
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson))
                .andExpect(status().isOk());

    }
