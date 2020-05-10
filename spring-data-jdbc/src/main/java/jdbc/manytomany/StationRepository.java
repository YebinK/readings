package jdbc.manytomany;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StationRepository extends CrudRepository<Station, Long> {
    @Override
    List<Station> findAll();
}
