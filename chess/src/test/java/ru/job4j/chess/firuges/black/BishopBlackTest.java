package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenCreatedToC8ThenPositionC8() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Cell position = bb.position();
        assertEquals(position, Cell.C8);
    }

    @Test
    void whenCopiedFromC8ToC7ThenPositionC7() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Figure bbCopy = bb.copy(Cell.D7);
        assertEquals(bbCopy.position(), Cell.D7);
    }

    @Test
    void whenWayFromC1ToG5ThenCellsD2E3F4G5() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] arr = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bb.way(Cell.G5)).isEqualTo(arr);
    }

    @Test
    void whenWayFromC1ToC2ThenImpossibleMoveException() throws  ImpossibleMoveException {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Throwable exception = assertThrows(ImpossibleMoveException.class, () -> {
            bb.way(Cell.C2);
        });
        assertThat(exception.getMessage()).isEqualTo("Could not move by diagonal from C1 to C2");
    }
}