import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeBoardTest {
    TicTacToeBoard ticTacToeBoard;

    @BeforeEach
    void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testArrayElementsAreEmpty() {
        TicTacToeValues[][] ticTacToeArray = ticTacToeBoard.getTicTacToeArray();
        for (int row = 0; row < ticTacToeArray.length; row++) {
            for (int column = 0; column < ticTacToeArray[row].length; column++) {
                assertEquals(TicTacToeValues.EMPTY, ticTacToeArray[row][column]);
            }
        }
    }

    @Test
    void displayBoard(){
        ticTacToeBoard.displayBoard();
    }



}