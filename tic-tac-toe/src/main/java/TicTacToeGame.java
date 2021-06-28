import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        if (!board.get(0).equals("")) {
            return 1;
        }
        return 0;
    }
}
