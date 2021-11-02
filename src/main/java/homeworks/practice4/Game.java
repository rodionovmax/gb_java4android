package homeworks.practice4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner in = new Scanner(System.in);

    private static final int SIZE = getBoardSize();

    private static final char HUMAN = 'X';
    private static final char AI = 'O';
    private static final char EMPTY = '•';
    private static final char ZERO = '⭑';

    private static final char[][] BOARD = new char[SIZE][SIZE];

    private static int playCounter;

    public static void main(String[] args) {
        turnGameOn();
    }

    private static void turnGameOn() {
        do {
            System.out.println("Let's the game begin \uD83D\uDCAB");
            System.out.printf("You need to place %d symbols together to win the game\n", getN());
            init();
            printBoard();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        initBoard();
        playCounter = 0;
    }


    private static void initBoard() {
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD.length; j++) {
                BOARD[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        System.out.printf("%2s", ZERO);
        for (int i = 0; i < SIZE; i++) {
            printNumbers(i);
        }
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            printNumbers(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2s", BOARD[i][j]);
            }
            System.out.println();
        }
    }

    private static void printNumbers(int i) {
        System.out.printf("%2s", i + 1);
    }

    private static int getBoardSize() {
        System.out.print("Enter board size from 3 to 100: ");

        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isBoardSizeValid(n)) {
                    return n;
                } else {
                    System.out.print("The board size is out of bounce. Please enter board size again: ");
                }
            } else {
                in.next();
                System.out.print("You can enter only integer numbers. Please enter board size again: ");
            }

        }
    }

    private static boolean isBoardSizeValid(int n) {
        return n >= 3  && n <= 100;
    }

    private static void playGame() {
        while (true) {
            int[] lastHumanMove = playHuman();
            printBoard();
            if (checkForEnd(HUMAN, lastHumanMove)) {
                break;
            }
            int[] lastAIMove = playAI();
            printBoard();
            if (checkForEnd(AI, lastAIMove)) {
                break;
            }
        }
    }

    private static boolean checkForEnd(char symbol, int[] lastMove) {
        if (checkForWin(symbol, lastMove)) {
            if (symbol == HUMAN) {
                System.out.println("Congrats dude, you won!");
            } else {
                System.out.println("Ooops, looks like machine won");
            }
            return true;
        }
        if (checkForDraw(BOARD)) {
            System.out.println("It's a draw! Let's play another one");
            return true;
        }
        return false;
    }

    private static boolean checkForDraw(char[][] BOARD) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkForWin(char symbol, int[] lastMove) {

        int n = getN();

        if (checkRow(symbol, n, lastMove)) {
            return true;
        }
        if (checkColumn(symbol, n, lastMove)) {
            return true;
        }
        /*
        * Note: checkDiagonal() and checkReverseDiagonal() work only with diagonals coming from the corners
        */
        if (checkDiagonal(symbol, n, lastMove)) {
            return true;
        }
        if (checkReverseDiagonal(symbol, n, lastMove)) {
            return true;
        }
        return false;
    }

    private static int getN() {
        // Get number of symbols which have to be placed together to win the game
        int n;
        if (SIZE >= 3 && SIZE <= 5) {
            n = 3;
        } else if (SIZE > 5 && SIZE <= 10) {
            n = 4;
        } else {
            n = 5;
        }

        return n;
    }

    private static boolean checkRow(char symbol, int n, int[] lastMove) {
        int row = 0;
        int x = lastMove[1];
        int y = lastMove[0];
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[y][i] == symbol) {
                row++;
//                System.out.println("Check for row: " + row);
                if (row == n) {
                    return true;
                }
            } else {
                row = 0;
            }
        }
        return false;
    }

    private static boolean checkColumn(char symbol, int n, int[] lastMove) {
        int column = 0;
        int x = lastMove[1];
        int y = lastMove[0];
        for (int i = 0; i < SIZE; i++) {
            if (BOARD[i][x] == symbol) {
                column++;
//                System.out.println("Check for COLUMN: " + column);
                if (column == n) {
                    return true;
                }
            } else {
                column = 0;
            }
        }
        return false;
    }

    private static boolean checkDiagonal(char symbol, int n, int[] lastMove) {
        int diag = 0;
        int x = lastMove[1];
        int y = lastMove[0];
        for (int i = 0; i < SIZE; i++) {
            if (x == y) {
                if (BOARD[i][i] == symbol) {
                    diag++;
//                    System.out.println("Check for diag: " + diag);
                    if (diag == n) {
                        return true;
                    }
                } else {
                    diag = 0;
                }
            }
        }
        return false;
    }

    private static boolean checkReverseDiagonal(char symbol, int n, int[] lastMove) {
        int reverseDiag = 0;
        int x = lastMove[1];
        int y = lastMove[0];
        for (int i = 0; i < SIZE; i++) {
            if (x + y == SIZE - 1) {
                if (BOARD[i][(SIZE - 1) - i] == symbol) {
                    reverseDiag++;
//                    System.out.println("Check for reverse diag: " + reverseDiag);
                    if (reverseDiag == n) {
                        return true;
                    }
                } else {
                    reverseDiag = 0;
                }
            }
        }
        return false;
    }

    private static int[] playHuman() {
        System.out.println("It's your turn dude");
        int x, y;
        while (true) {
            System.out.print("Enter coordinate by X: ");
            x = getValidNumberFromUser() - 1;
            System.out.print("Enter coordinate by Y: ");
            y = getValidNumberFromUser() - 1;
            if (isCellFree(x, y)) {
                break;
            } else {
                System.out.println("This cell has been already taken. Try another one!");
            }
        }
        BOARD[y][x] = HUMAN;
        playCounter++;
        System.out.println("You played!");
        return new int[] {y, x};
    }

    private static boolean isCellFree(int x, int y) {
        return BOARD[y][x] == EMPTY;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                } else {
                    System.out.println("The coordinate is out of bounce! Dude, don't fuck with me");
                    System.out.print("Enter coordinate again: ");
                }
            } else {
                in.next();
                System.out.println("You can enter only integer numbers");
            }

        }
    }

    private static boolean isNumberValid(int n) {
        return n > 0 && n <= SIZE;
    }

    private static int[] playAI() {
        int x, y;
        while (true) {
            Random random = new Random();
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            if (isCellFree(x, y)) {
                break;
            }
        }
        BOARD[y][x] = AI;
        playCounter++;
        System.out.println("Computer played!");
        return new int[] {y, x};
    }

    private static boolean isContinueGame() {
        System.out.print("Do you want to continue? (y/n) ");
        return switch (in.next()) {
            case "y", "yes" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Game is over ☃. Bye-bye!");
    }

}

