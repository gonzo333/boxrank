package pl.naapp.boxrank.testowa.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.naapp.boxrank.testowa.repo.entity.Boxer;

import java.util.List;

@Repository
public interface BoxerRepo extends CrudRepository<Boxer, Long> {
    @Query("select b from Boxer b where b.sex='M' and b.kind='O'")
    List<Boxer> findOlimpicMan();

    @Query("select b from Boxer b where b.sex='M' and b.kind='P'")
    List<Boxer> findProfesionalMan();

}
