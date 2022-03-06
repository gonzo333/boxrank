package pl.naapp.boxrank.testowa.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.naapp.boxrank.testowa.repo.BoxerRepo;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

import java.util.ArrayList;

@Service
public class BoxerPort {
    private BoxerRepo rankProfManRepo;

    @Autowired
    public BoxerPort(BoxerRepo rankProfManRepo) {
        this.rankProfManRepo = rankProfManRepo;
    }

    public ArrayList<Boxer> getAll() {
        ArrayList<Boxer> rankProfMan = (ArrayList<Boxer>) rankProfManRepo.findAll();
        return rankProfMan;
    }

    public ArrayList<Boxer> getAllProfMan() {
        ArrayList<Boxer> rankProfMan = (ArrayList<Boxer>) rankProfManRepo.findProfesionalMan();
        return rankProfMan;
    }

    public ArrayList<Boxer> getAllOlimpMan() {
        ArrayList<Boxer> rankProfMan = (ArrayList<Boxer>) rankProfManRepo.findOlimpicMan();
        return rankProfMan;
    }
}
