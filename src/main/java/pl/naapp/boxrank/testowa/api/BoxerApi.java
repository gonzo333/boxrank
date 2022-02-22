package pl.naapp.boxrank.testowa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.naapp.boxrank.testowa.port.BoxerPort;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

@RestController
@RequestMapping("/api/test/boxers")
public class BoxerApi {
    private BoxerPort boxerPort;

    @Autowired
    public BoxerApi(BoxerPort boxerPort) {
        this.boxerPort = boxerPort;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Boxer> getAll() {
        return boxerPort.getAll();
    }

    @CrossOrigin
    @GetMapping("/test")
    public String test() {
        return "it's work!";
    }
}
