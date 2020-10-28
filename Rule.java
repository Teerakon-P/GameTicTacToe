public class Rule {

    public char[][] board;
    public int row;
    public int col;
    public boolean win = false;

    public Rule(int rowCol) {
        this.row = rowCol;
        this.col = rowCol;
        board = new char[this.row][this.col];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        System.out.print("\nTic Tac Toe GAME " + rowCol + " x " + rowCol + "\n\n");
    }

    public boolean getWin() {
        return this.win;
    }

    public char[][] getBoard() {
        return this.board;
    }

    public void updateBoard(char choice, int row, int col) {
        this.board[row][col] = choice;
    }

    public void winCheck3x3() {

        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
                win = true;
                System.out.println("\nPlayer " + board[row][0] + " Win");
                return;
            }
        }

        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ') {
                win = true;
                System.out.println("\nPlayer " + board[0][col] + " Win");
                return;
            }
        }

        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
                || (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            win = true;
            System.out.println("\nPlayer " + board[1][1] + " Win");
            return;
        }

        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X' || board[row][col] == 'O') {
                    count++;
                }
            }
        }

        if (count == board.length * board.length) {
            win = true;
            System.out.println("Player Draw!\n");
        }
    }

    public void winCheck4x4() {

        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][2] == board[row][3] && board[row][0] != ' ') {
                win = true;
                System.out.println("\nPlayer " + board[row][0] + " Win");
                return;
            }
        }

        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[2][col] == board[3][col] && board[0][col] != ' ') {
                win = true;
                System.out.println("\nPlayer " + board[0][col] + " Win");
                return;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == board[3][3] && board[0][0] != ' ') {
            win = true;
            System.out.println("\nPlayer " + board[0][0] + " Win");
            return;
        }

        if (board[0][3] == board[1][2] && board[1][2] == board[2][1] && board[2][1] == board[3][0] && board[0][3] != ' ') {
            win = true;
            System.out.println("\nPlayer " + board[0][3] + " Win");
            return;
        }

        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X' || board[row][col] == 'O') {
                    count++;
                }
            }
        }

        if (count == board.length * board.length) {
            win = true;
            System.out.println("Player Draw!\n");
        }
    }
}