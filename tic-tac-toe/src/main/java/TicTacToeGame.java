import java.util.List;

public class TicTacToeGame {

    public int solveTTT(List<String> board) {
        int index = 0;
        while (!board.get(index).equals("")) {
            index++;
        }
        return index;
    }
}
