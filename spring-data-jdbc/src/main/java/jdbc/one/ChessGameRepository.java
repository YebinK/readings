package jdbc.one;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@Repository //없어도 된다.
public interface ChessGameRepository extends CrudRepository<ChessGame, Long> {
    @Override
    List<ChessGame> findAll();
}