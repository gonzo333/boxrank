package pl.naapp.boxrank.testowa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.naapp.boxrank.testowa.port.BoxerPort;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

import java.util.ArrayList;
import java.util.Comparator;

@RestController
@RequestMapping("/api/test/boxers")
public class BoxerApi {
    private BoxerPort boxerPort;

    @Autowired
    public BoxerApi(BoxerPort boxerPort, BoxerPort rankProfManPort) {
        this.boxerPort = boxerPort;
        this.boxerPort = rankProfManPort;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Boxer> getAll() {
        return boxerPort.getAll();
    }

    @CrossOrigin
    @GetMapping("/rank-prof-man")
    public ArrayList<Boxer> getRankProfMan() {
        ArrayList<Boxer> rankProfManArray = boxerPort.getAllProfMan();
        rankProfManArray.sort(Comparator.comparing(rankProfMan -> rankProfMan.getPlace()));
        return rankProfManArray;
    }

    @CrossOrigin
    @GetMapping("/rank-olimp-man")
    public ArrayList<Boxer> getRankOlimpMan() {
        ArrayList<Boxer> rankProfManArray = boxerPort.getAllOlimpMan();
        rankProfManArray.sort(Comparator.comparing(rankProfMan -> rankProfMan.getPlace()));
        return rankProfManArray;
    }

    @CrossOrigin
    @GetMapping("/test")
    public String test() {
        return "it's work!";
    }
}
