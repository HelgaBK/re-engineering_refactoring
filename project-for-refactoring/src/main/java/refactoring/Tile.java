package refactoring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tile {
    private final Position position;
    private Mark mark;

    public static Tile empty(Position position) {
        return new Tile(position, Mark.NONE);
    }
}