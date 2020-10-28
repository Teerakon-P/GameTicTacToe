public class Board {

    Rule board;

    public Board(Rule board) {
        this.board = board;
    }

    public void displaySlot() {
        int slot = 1;
        for (int row = 0; row < board.getBoard().length; row++) {
            for (int col = 0; col < board.getBoard().length; col++) {
                if (slot > 0 && slot < 10) {
                    System.out.print(" " + slot + " |");
                } else {
                    System.out.print(" " + slot + "|");
                }
                slot++;
            }
            System.out.print("\n");
            for (int i = 0; i < board.getBoard().length; i++) {
                System.out.print("---+");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void display() {
        for (int row = 0; row < board.getBoard().length; row++) {
            for (int col = 0; col < board.getBoard().length; col++) {
                System.out.print(" " + board.getBoard()[row][col] + " |");
            }
            System.out.print("\n");
            for (int i = 0; i < board.getBoard().length; i++) {
                System.out.print("---+");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
