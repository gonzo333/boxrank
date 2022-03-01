package pl.naapp.boxrank.testowa.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.naapp.boxrank.testowa.repo.RankProfManRepo;
import pl.naapp.boxrank.testowa.repo.entity.RankProfMan;

import java.util.ArrayList;

@Service
public class RankProfManPort {
    private RankProfManRepo rankProfManRepo;

    @Autowired
    public RankProfManPort(RankProfManRepo rankProfManRepo) {
        this.rankProfManRepo = rankProfManRepo;
    }

    public ArrayList<RankProfMan> getAll() {
        ArrayList<RankProfMan> rankProfMEN = (ArrayList<RankProfMan>) rankProfManRepo.findAll();
        RankProfMan single = rankProfMEN.get(0);

        return rankProfMEN;
    }
}
