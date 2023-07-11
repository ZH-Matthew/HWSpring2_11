package homeworkspring2_11.controller;
import homeworkspring2_11.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void addId(@RequestParam Integer ...id) {
        service.addId(id);
    }

    @GetMapping("/get")
    public ArrayList<Integer> getId() {
        return service.getId();
    }
}
