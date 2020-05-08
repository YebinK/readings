package jdbc.one;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("chessGame")
public class ChessGame {
    @Id
    private Long id;
    private String name;
    private boolean active;

    private ChessGame() { }

    public ChessGame(String name, boolean active) {
        this.name = name;
        this.active = active;
    }
}
