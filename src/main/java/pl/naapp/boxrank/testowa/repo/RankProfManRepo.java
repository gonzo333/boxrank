package pl.naapp.boxrank.testowa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.naapp.boxrank.testowa.repo.entity.RankProfMan;

@Repository
public interface RankProfManRepo extends CrudRepository<RankProfMan, Long> {
}
