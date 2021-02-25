//8.17 (Tic-Tac-Toe) Create a class TicTacToe that will enable you to write a program to play
//        TicTac-Toe. The class contains a private 3-by-3 two-dimensional array. Use an enum
//        type to represent
//        the value in each cell of the array. The enum’s constants should be named X, O and EMPTY
//        (for a position that does not contain an X or an O). The constructor should initialize the
//        board elements to
//        EMPTY. Allow two human players. Wherever the first player moves, place an X in the specified
//        square,
//        and place an O wherever the second player moves. Each move must be to an empty square. After
//        each move, determine whether the game has been won and whether it’s a draw. If you feel
//        ambitious, modify your program so that the computer makes the moves for one of the players.
//        Also, allow
//        the player to specify whether he or she wants to go first or second. If you feel exceptionally
//        ambitious, develop a program that will play three-dimensional Tic-Tac-Toe on a 4-by-4-by-4 board
//        [Note: This is an extremely challenging project!].


public class TicTacToe {
    private TicTacToeBoard ticTacToeBoard;
    private boolean lastMovePlayedWasX;
    private int numberOfMoves = 0;


    public TicTacToe() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    public TicTacToeValues[][] getBoard() {
        return ticTacToeBoard.getTicTacToeArray();
    }

    public void displayBoard() {
        ticTacToeBoard.displayBoard();
    }

    public void makeMoves(int move) {
        int row = 0;
        int column = 0;
        numberOfMoves++;
        if (numberOfMoves > 9) {
            System.out.println("test");
            throw new IllegalStateException("You have exceeded your number of moves");
        }
        if (move < 1 || move > 9) {
            throw new IllegalArgumentException("Move should be between 1 and 9");
        }

        switch (move) {
            case 1:
                row = 0;
                column = 0;
                break;
            case 2:
                row = 0;
                column = 1;
                break;
            case 3:
                row = 0;
                column = 2;
                break;
            case 4:
                row = 1;
                column = 0;
                break;
            case 5:
                row = 1;
                column = 1;
                break;
            case 6:
                row = 1;
                column = 2;
                break;
            case 7:
                row = 2;
                column = 0;
                break;
            case 8:
                row = 2;
                column = 1;
                break;
            case 9:
                row = 2;
                column = 2;
                break;
        }

        if (lastMovePlayedWasX) {
            getBoard()[row][column] = TicTacToeValues.O;
            lastMovePlayedWasX = false;
        } else {
            getBoard()[row][column] = TicTacToeValues.X;
            lastMovePlayedWasX = true;
        }
    }


}




