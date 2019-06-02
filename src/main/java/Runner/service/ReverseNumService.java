package Runner.service;

import Runner.businessLogic.ReverseNum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController()
public class ReverseNumService {

    @Autowired
    ReverseNum reverseNum;

    @GetMapping(path="/reverse",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public int reverse(@RequestBody int number) {
        return reverseNum.reverseRecurs(number);
    }

}
