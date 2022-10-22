package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPosition() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Cell position = bb.position();
        assertEquals(position, Cell.C8);
    }

    @Test
    void whenCopy() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Figure bbCopy = bb.copy(Cell.D7);
        assertEquals(bbCopy.position(), Cell.D7);
    }

    @Test
    void whenWay() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] arr = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(bb.way(Cell.G5), arr);

    }
}