import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (board.get(0).equals("X") && board.get(1).equals("X") && board.get(2).equals("")) {
            return 2;
        }
        if (board.get(3).equals("X") && board.get(4).equals("X") && board.get(5).equals("")) {
            return 5;
        }

        int index = 0;
        while (!board.get(index).equals("")) {
            index++;
        }
        return index;
    }
}
