import java.util.List;

public class TicTacToeGame {
    private int[][] rows = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    private int[][] columns = {{0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
    private int[][] diagonals = {{0, 4, 8}, {2, 4, 6}};

    public int solveTTT(List<String> board) {
        throwExceptionIfBoardIsFull(board);

        for (int[] row : rows) {
            if (thereIsAWinningMoveIn(board, row)) {
                return getWinningMoveIn(board, row);
            }
        }

        for (int[] column : columns) {
            if (thereIsAWinningMoveIn(board, column)) {
                return getWinningMoveIn(board, column);
            }
        }

        for (int[] diagonal : diagonals) {
            if (thereIsAWinningMoveIn(board, diagonal)) {
                return getWinningMoveIn(board, diagonal);
            }
        }

        return firstAvailableMove(board);
    }

    private int firstAvailableMove(List<String> board) {
        int index = 0;
        while (!board.get(index).equals("")) {
            index++;
        }
        return index;
    }

    private void throwExceptionIfBoardIsFull(List<String> board) {
        if (board.stream()
                .filter(item -> item != null && !item.isEmpty())
                .count()
                 == 9) {
            throw new IllegalArgumentException("Board is full!!");
        }
    }

    private int getWinningMoveIn(List<String> board, int[] location) {
        if (board.get(location[0]).equals("")) {
            return location[0];
        } else if (board.get(location[1]).equals("")) {
            return location[1];
        } else {
            return location[2];
        }
    }

    private boolean thereIsAWinningMoveIn(List<String> board, int[] location) {
        return (board.get(location[0]).equals("X") && board.get(location[1]).equals("X") && board.get(location[2]).equals(
                ""))
                || (board.get(location[0]).equals("X") && board.get(location[1]).equals("") && board.get(location[2]).equals(
                        "X"))
                || (board.get(location[0]).equals("") && board.get(location[1]).equals("X") && board.get(location[2]).equals(
                        "X"));
    }
}
