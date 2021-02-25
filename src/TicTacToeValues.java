public enum TicTacToeValues {
    X,
    O,
    EMPTY;


    @Override
    public String toString() {
        if (this == TicTacToeValues.X) {
            return "X";
        }
        if (this == TicTacToeValues.O) {
            return "O";
        }
        return " ";

    }
}
