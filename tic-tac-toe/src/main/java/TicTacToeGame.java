import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (board.get(0).equals("X") && board.get(1).equals("X") && board.get(2).equals("")) {
            return 2;
        }
        if (thereIsAWinningMoveIn(board.get(3), board.get(4), board.get(5))) {
            return getWinningMoveIn(board, 3, 4, 5);
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

    public boolean thereIsAWinningMoveIn(String spot1, String spot2, String spot3) {
        return (spot1.equals("X") && spot2.equals("X") && spot3.equals(""))
                || (spot1.equals("X") && spot2.equals("") && spot3.equals("X"))
                || (spot1.equals("") && spot2.equals("X") && spot3.equals("X"));
    }
}
