package si.unilj.fri.prpo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/katalog")
public class KatalogController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public KatalogItem get() {
        return new KatalogItem("Spring REST API");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public KatalogItem post(@RequestBody final KatalogItem item) {
        return item;
    }

    public record KatalogItem(String name) {
    }
}
