package jdbc.onetomany;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParentRepository extends CrudRepository<Parent, Long> {
    @Override
    List<Parent> findAll();
}
