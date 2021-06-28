import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (board.get(0).equals("X") && board.get(1).equals("X") && board.get(2).equals("")) {
            return 2;
        }
        if (thereIsAWinningMoveIn(board.get(3), board.get(4), board.get(5))) {
            return winningMoveIn(board.get(3), board.get(4), board.get(5));
        }

        int index = 0;
        while (!board.get(index).equals("")) {
            index++;
        }
        return index;
    }

    public boolean thereIsAWinningMoveIn(String spot1, String spot2, String spot3) {
        return false;
    }
}
