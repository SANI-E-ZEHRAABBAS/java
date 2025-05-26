package project;

import java.util.Scanner;

public abstract class Player {

    protected char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract int makeMove(char[][] board, Scanner scanner);
}

