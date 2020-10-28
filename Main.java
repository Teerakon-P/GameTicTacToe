import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rowCol = 0;
        while (rowCol != 3 && rowCol != 4) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter number a board size 3(3x3) or 4(4x4): ");
            rowCol = sc.nextInt();
        }

        Rule rule = new Rule(rowCol);
        Board board = new Board(rule);
        Input input = new Input(rule);

        while (!rule.getWin()) {
            board.displaySlot();
            board.display();

            if (rowCol == 3) {
                input.selectSpace3x3();
                rule.winCheck3x3();
            } else if (rowCol == 4){
                input.selectSpace4x4();
                rule.winCheck4x4();
            }
            if (rule.getWin()) {
                board.display();
            }
        }
    }
}
