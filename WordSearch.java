class Solution {
    static boolean isvalid = false;

    static boolean searchWord(String word, char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isFound(word, i, j, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isFound(String word, int row, int col, char[][] board) {
        if (word.length() == 0) {
            return true;
        }

        if (row < 0 || row == board.length || col < 0 || col == board[0].length || board[row][col] != word.charAt(0)) {

            return false;
        }

        // mark visited
        board[row][col] = '#';

        // take directions

        int directions[][] = {
                { 0, 1 }, // to move right direction
                { 1, 0 }, // to move down
                { 0, -1 }, // to move left
                { -1, 0 }// to move up

        };

        for (int direction = 0; direction < directions.length; direction++) {
            int stratRow = directions[direction][0];// 00 initially will give 0
            int startcol = directions[direction][1];// 01 intially gives 1

            isvalid = isFound(word.substring(1), stratRow + row, startcol + col, board);

            if (isvalid) {
                break;
            }
        }
        board[row][col] = word.charAt(0); // Store the Value
        return isvalid;
    }

    public boolean exist(char[][] board, String word) {
        Solution s = new Solution();
        boolean b = s.searchWord(word, board);
        return b;
    }
}
