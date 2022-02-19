package pl.naapp.boxrank.testowa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

@Repository
public interface BoxerRepo extends CrudRepository<Boxer, Long> {
}
