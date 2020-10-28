import java.util.Scanner;

public class Input {
    private char choice = 'X';
    private Rule board;

    public Input(Rule b) {
        this.board = b;
    }

    public void selectSpace3x3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player " + choice + ", Please enter a slot: ");
        int input = sc.nextInt();

        if (input > 0 && input < 10) {
            if (input == 1) {
                checkAndUpdateSlot(0, 0);
            } else if (input == 2) {
                checkAndUpdateSlot(0, 1);
            } else if (input == 3) {
                checkAndUpdateSlot(0, 2);
            } else if (input == 4) {
                checkAndUpdateSlot(1, 0);
            } else if (input == 5) {
                checkAndUpdateSlot(1, 1);
            } else if (input == 6) {
                checkAndUpdateSlot(1, 2);
            } else if (input == 7) {
                checkAndUpdateSlot(2, 0);
            } else if (input == 8) {
                checkAndUpdateSlot(2, 1);
            } else if (input == 9) {
                checkAndUpdateSlot(2, 2);
            }
        }
    }

    public void selectSpace4x4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player " + choice + ", Please enter a slot: ");
        int input = sc.nextInt();

        if (input > 0 && input < 17) {
            if (input == 1) {
                checkAndUpdateSlot(0, 0);
            } else if (input == 2) {
                checkAndUpdateSlot(0, 1);
            } else if (input == 3) {
                checkAndUpdateSlot(0, 2);
            } else if (input == 4) {
                checkAndUpdateSlot(0, 3);
            } else if (input == 5) {
                checkAndUpdateSlot(1, 0);
            } else if (input == 6) {
                checkAndUpdateSlot(1, 1);
            } else if (input == 7) {
                checkAndUpdateSlot(1, 2);
            } else if (input == 8) {
                checkAndUpdateSlot(1, 3);
            } else if (input == 9) {
                checkAndUpdateSlot(2, 0);
            } else if (input == 10) {
                checkAndUpdateSlot(2, 1);
            } else if (input == 11) {
                checkAndUpdateSlot(2, 2);
            } else if (input == 12) {
                checkAndUpdateSlot(2, 3);
            } else if (input == 13) {
                checkAndUpdateSlot(3, 0);
            } else if (input == 14) {
                checkAndUpdateSlot(3, 1);
            } else if (input == 15) {
                checkAndUpdateSlot(3, 2);
            } else if (input == 16) {
                checkAndUpdateSlot(3, 3);
            }
        }
    }

    public void checkAndUpdateSlot(int row, int col) {
        if (board.getBoard()[row][col] == ' ') {
            board.updateBoard(choice, row, col);
            if (choice == 'X') {
                choice = 'O';
            } else {
                choice = 'X';
            }
            System.out.print("\n");
        }
    }
}
