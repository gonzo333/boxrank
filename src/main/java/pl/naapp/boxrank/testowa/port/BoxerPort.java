package pl.naapp.boxrank.testowa.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.naapp.boxrank.testowa.repo.BoxerRepo;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

@Service
public class BoxerPort {
    private BoxerRepo boxerRepo;

    @Autowired
    public BoxerPort(BoxerRepo boxerRepo) {
        this.boxerRepo = boxerRepo;
    }

    public Iterable<Boxer> getAll() {
        return boxerRepo.findAll();
    }
}
