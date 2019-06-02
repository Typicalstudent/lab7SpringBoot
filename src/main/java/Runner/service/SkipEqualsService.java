package Runner.service;

import Runner.businessLogic.DeleteEqualElements;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkipEqualsService {

    @GetMapping(path="/skip-equals",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Object> skipEquals(@RequestBody List<Object> list) {
        DeleteEqualElements deleteEqualElements = new DeleteEqualElements(list);
        return deleteEqualElements.skipNoRecurs(list);
    }
}
