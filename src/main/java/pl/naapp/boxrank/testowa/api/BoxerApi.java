package pl.naapp.boxrank.testowa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.naapp.boxrank.testowa.port.BoxerPort;
import pl.naapp.boxrank.testowa.port.RankProfManPort;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;
import pl.naapp.boxrank.testowa.repo.entity.RankProfMan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@RestController
@RequestMapping("/api/test/boxers")
public class BoxerApi {
    private BoxerPort boxerPort;
    private RankProfManPort rankProfManPort;

    @Autowired
    public BoxerApi(BoxerPort boxerPort, RankProfManPort rankProfManPort) {
        this.boxerPort = boxerPort;
        this.rankProfManPort = rankProfManPort;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Boxer> getAll() {
        return boxerPort.getAll();
    }

    @CrossOrigin
    @GetMapping("/rank-prof-man")
    public ArrayList<RankProfMan> getRankProfMan() {
        ArrayList<RankProfMan> rankProfMENArray = rankProfManPort.getAll();
        rankProfMENArray.sort(Comparator.comparing(rankProfMan -> rankProfMan.getPlace()));
        return rankProfMENArray;
    }


    @CrossOrigin
    @GetMapping("/test")
    public String test() {
        return "it's work!";
    }
}
