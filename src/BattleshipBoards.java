public class BattleshipBoards {

    public int countBattleships(char[][]board){

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    dfs(board, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] board, int i, int j) {
        int row = i;
        int col = j;
        if (row < 0 || row == board.length || col < 0 || col == board[row].length) {
            return;
        }
        if (board[row][col] == '.' || board[row][col] == 'N') {
            return;
        }
        board[row][col] = 'N';
        dfs(board, row - 1, col);
        dfs(board, row + 1, col);
        dfs(board, row, col - 1);
        dfs(board, row, col + 1);
    }



}
