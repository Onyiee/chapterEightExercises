import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;


    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void makeMoves() {
        ticTacToe.makeMoves(6);
        assertEquals(TicTacToeValues.X, ticTacToe.getBoard()[1][2]);
        ticTacToe.makeMoves(7);
        assertEquals(TicTacToeValues.O, ticTacToe.getBoard()[2][0]);
        assertThrows(IllegalArgumentException.class, () -> {
            ticTacToe.makeMoves(90);
        });

    }

    @Test
    void test(){
        ticTacToe.makeMoves(6);
        ticTacToe.makeMoves(9);
        ticTacToe.makeMoves(1);
        ticTacToe.makeMoves(2);
        ticTacToe.makeMoves(3);
        ticTacToe.makeMoves(4);
        ticTacToe.makeMoves(5);
        ticTacToe.makeMoves(8);
        ticTacToe.makeMoves(7);
        ticTacToe.displayBoard();
        assertThrows(IllegalStateException.class, ()-> {
            ticTacToe.makeMoves(1);
        });
    }
}