import java.util.List;

public class TicTacToeGame {
    private int[][] rows = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    private int[][] columns = {{0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
    private int[][] diagonals = {{0, 4, 8}, {2, 4, 6}};

    public int solveTTT(List<String> board) {
        throwExceptionIfBoardIsFull(board);
        if (thereIsAWinningMove(board)) {
            return getWinningMove(board);
        }
        return firstAvailableMove(board);
    }

    private boolean thereIsAWinningMove(List<String> board) {
        return thereIsAWinningMoveIn(board, rows)
                || thereIsAWinningMoveIn(board, columns)
                || thereIsAWinningMoveIn(board, diagonals);
    }

    private int getWinningMove(List<String> board) {
        if (thereIsAWinningMoveIn(board, rows)) {
            return getWinningMoveIn(board, rows);
        } else if (thereIsAWinningMoveIn(board, columns)) {
            return getWinningMoveIn(board, columns);
        } else {
            return getWinningMoveIn(board, diagonals);
        }
    }

    private boolean thereIsAWinningMoveIn(List<String> board, int[][] vectors) {
        for (int[] vector : vectors) {
            if (thereIsAWinningMoveInOne(board, vector)) {
                return true;
            }
        }
        return false;
    }

    private int getWinningMoveIn(List<String> board, int[][] vectors) {
        for (int[] vector : vectors) {
            if (thereIsAWinningMoveInOne(board, vector)) {
                return getWinningMoveInOne(board, vector);
            }
        }
        return -1;
    }

    private boolean thereIsAWinningMoveInOne(List<String> board, int[] location) {
        boolean thereIsAWinningMoveAtFirstSquare =
                board.get(location[0]).equals("")
                        && board.get(location[1]).equals("X")
                        && board.get(location[2]).equals("X");
        boolean thereIsAWinningMoveAtSecondSquare =
                board.get(location[0]).equals("X")
                        && board.get(location[1]).equals("")
                        && board.get(location[2]).equals("X");
        boolean thereIsAWinningMoveAtThirdSquare =
                board.get(location[0]).equals("X")
                        && board.get(location[1]).equals("X")
                        && board.get(location[2]).equals("");
        return thereIsAWinningMoveAtFirstSquare || thereIsAWinningMoveAtSecondSquare || thereIsAWinningMoveAtThirdSquare;
    }

    private int getWinningMoveInOne(List<String> board, int[] locations) {
        for (int location : locations) {
            if (board.get(location).equals("")) {
                return location;
            }
        }
        return -1;
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
}
