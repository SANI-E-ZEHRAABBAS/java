package project;

import java.util.*;

public class Tictactoe {

    public static final int SIZE = 3;
    private char[][] board;
    private Scanner scanner;
    private Player playerX, playerO;
    private Queue<Player> turnQueue;
    private ArrayList<String> moveHistory;
    private LinkedList<String> moveQueue;
    private Stack<String> undoStack;

    public Tictactoe() {
        board = new char[SIZE][SIZE];
        scanner = new Scanner(System.in);
        playerX = new HumanPlayer('X');
        playerO = new HumanPlayer('O');
        turnQueue = new LinkedList<>();
        moveHistory = new ArrayList<>();
        moveQueue = new LinkedList<>();
        undoStack = new Stack<>();

        turnQueue.offer(playerX);
        turnQueue.offer(playerO);

        resetBoard();
    }

    private void resetBoard() {
        int boxNumber = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = (char) ('0' + boxNumber++);
            }
        }
        moveHistory.clear();
        moveQueue.clear();
        undoStack.clear();
    }

    private void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf(" %s ", board[i][j]);
                if (j + 1 < SIZE) System.out.print("|");
            }
            System.out.println();
            if (i + 1 < SIZE) System.out.println("-----------");
        }
    }

    private boolean checkWinner(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
        }
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Character.isDigit(board[i][j])) return false;
            }
        }
        return true;
    }

    public void play() {
        boolean playAgain;

        do {
            while (!checkWinner('X') && !checkWinner('O') && !isBoardFull()) {
                printBoard();
                Player currentPlayer = turnQueue.poll();
                int move = currentPlayer.makeMove(board, scanner);
                int i = move / SIZE;
                int j = move % SIZE;
                board[i][j] = currentPlayer.getSymbol();

                String moveStr = currentPlayer.getSymbol() + " to " + move;
                moveHistory.add(moveStr);
                moveQueue.offer(moveStr);
                undoStack.push(moveStr);

                turnQueue.offer(currentPlayer);
            }

            printBoard();

            if (checkWinner('X')) {
                System.out.println("Player X wins!");
            } else if (checkWinner('O')) {
                System.out.println("Player O wins!");
            } else {
                System.out.println("It's a draw!");
            }

            System.out.println("Move History: " + moveHistory);
            System.out.println("Last Move: " + (undoStack.isEmpty() ? "None" : undoStack.peek()));

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
            if (playAgain) resetBoard();

        } while (playAgain);

        System.out.println("Thanks for playing!");
    }
}