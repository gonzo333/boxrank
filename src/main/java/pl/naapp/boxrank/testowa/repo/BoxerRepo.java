package pl.naapp.boxrank.testowa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BoxerRepo extends CrudRepository<Boxer, Long> {
}
