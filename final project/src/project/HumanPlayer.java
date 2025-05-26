package project;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(char symbol) {
        super(symbol);
    }

    @Override
    public int makeMove(char[][] board, Scanner scanner) {
        while (true) {
            try {
                System.out.print("Player " + symbol + " turn. Choose a box number: ");
                int boxNumber = Integer.parseInt(scanner.nextLine());

                if (boxNumber < 0 || boxNumber > 8) {
                    throw new IllegalArgumentException("Invalid box number.");
                }

                int i = boxNumber / 3;
                int j = boxNumber % 3;

                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    throw new IllegalStateException("Box already occupied.");
                }

                return boxNumber;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
	



