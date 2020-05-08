package jdbc.one;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ChessGameTest {

    @Autowired
    private ChessGameRepository chessGameRepository;

    @AfterEach
    void tearDown() {
        chessGameRepository.deleteAll();
    }

    @DisplayName("private 기본 생성자 확인")
    @Test
    public void privateConstructor() {
        ChessGame chessGame = new ChessGame("방 제목", true);
        chessGameRepository.save(chessGame);

        assertThat(chessGameRepository.findAll().size()).isEqualTo(1);
    }
}
