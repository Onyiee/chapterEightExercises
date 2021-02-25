import java.util.Arrays;

public class TicTacToeBoard {

    private TicTacToeValues[][] ticTacToeArray = new TicTacToeValues[3][3];

    public TicTacToeBoard() {
        for (int row = 0; row < ticTacToeArray.length; row++) {
            for (int column = 0; column < ticTacToeArray[row].length; column++) {
                ticTacToeArray[row][column] = TicTacToeValues.EMPTY;
            }
        }
    }

    public TicTacToeValues[][] getTicTacToeArray() {
        return ticTacToeArray;
    }

    public void displayBoard() {
        /*System.out.println(Arrays.deepToString(getTicTacToeArray()));*/
        for (int row = 0; row < ticTacToeArray.length; row++) {
            for (int column = 0; column < ticTacToeArray[row].length; column++) {
                System.out.print((ticTacToeArray[row][column])+" ");
            }
            System.out.println();
        }
    }

}
