import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (!board.get(0).equals("") && board.get(1).equals("")) {
            return 1;
        }

        if (!board.get(1).equals("")) {
            return 2;
        }
        return 0;
    }
}
