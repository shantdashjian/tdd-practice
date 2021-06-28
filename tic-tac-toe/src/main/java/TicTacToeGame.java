import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (thereIsAWinningMoveIn(board,0, 1, 2)) {
            return getWinningMoveIn(board, 0, 1, 2);
        }
        if (thereIsAWinningMoveIn(board, 3, 4, 5)) {
            return getWinningMoveIn(board, 3, 4, 5);
        }
        if (thereIsAWinningMoveIn(board, 6, 7, 8)) {
            return getWinningMoveIn(board, 6, 7, 8);
        }

        if (thereIsAWinningMoveIn(board, 0, 3, 6)) {
            return getWinningMoveIn(board, 0, 3, 6);
        }

        if (thereIsAWinningMoveIn(board, 1, 4, 7)) {
            return getWinningMoveIn(board, 1, 4, 7);
        }

        if (thereIsAWinningMoveIn(board, 2, 5, 8)) {
            return getWinningMoveIn(board, 2, 5, 8);
        }

        if (thereIsAWinningMoveIn(board, 0, 4, 8)) {
            return getWinningMoveIn(board, 0, 4, 8);
        }

        if (thereIsAWinningMoveIn(board, 2, 4, 6)) {
            return getWinningMoveIn(board, 2, 4, 6);
        }

        int index = 0;
        while (!board.get(index).equals("")) {
            index++;
        }
        return index;
    }

    private int getWinningMoveIn(List<String> board, int index0, int index1, int index2) {
        if (board.get(index0).equals("")) {
            return index0;
        } else if (board.get(index1).equals("")) {
            return index1;
        } else {
            return index2;
        }
    }

    private boolean thereIsAWinningMoveIn(List<String> board, int index0, int index1, int index2) {
        return (board.get(index0).equals("X") && board.get(index1).equals("X") && board.get(index2).equals(""))
                || (board.get(index0).equals("X") && board.get(index1).equals("") && board.get(index2).equals("X"))
                || (board.get(index0).equals("") && board.get(index1).equals("X") && board.get(index2).equals("X"));
    }
}
