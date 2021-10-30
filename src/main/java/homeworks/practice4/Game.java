package homeworks.practice4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final int SIZE = 3;

    private static final char HUMAN = 'X';
    private static final char AI = 'O';
    private static final char EMPTY = '•';
    private static final char ZERO = '⭑';

    private static final char[][] BOARD = new char[SIZE][SIZE];

    static Scanner in = new Scanner(System.in);
    private static int playCounter;

    public static void main(String[] args) {
        turnGameOn();
    }

    private static void turnGameOn() {
        do {
            System.out.println("Let's the game begin \uD83D\uDCAB");
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
        System.out.println("Enter board size from 1 to 100: ");

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
        return n > 0 && n <= 100;
    }

    private static void playGame() {
        while (true) {
            playHuman();
            printBoard();
            if (checkForEnd(HUMAN)) {
                break;
            }
            playAI();
            printBoard();
            if (checkForEnd(AI)) {
                break;
            }
        }
    }

    private static boolean checkForEnd(char symbol) {
        if (checkForWin(symbol)) {
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

    private static boolean checkForWin(char symbol) {
        if (BOARD[0][0] == symbol && BOARD[0][1] == symbol && BOARD[0][2] == symbol) {
            return true;
        }
        if (BOARD[1][0] == symbol && BOARD[1][1] == symbol && BOARD[1][2] == symbol) {
            return true;
        }
        if (BOARD[2][0] == symbol && BOARD[2][1] == symbol && BOARD[2][2] == symbol) {
            return true;
        }

        if (BOARD[0][0] == symbol && BOARD[1][0] == symbol && BOARD[2][0] == symbol) {
            return true;
        }
        if (BOARD[0][1] == symbol && BOARD[1][1] == symbol && BOARD[2][1] == symbol) {
            return true;
        }
        if (BOARD[0][2] == symbol && BOARD[1][2] == symbol && BOARD[2][2] == symbol) {
            return true;
        }

        if (BOARD[0][0] == symbol && BOARD[1][1] == symbol && BOARD[2][2] == symbol) {
            return true;
        }
        if (BOARD[0][2] == symbol && BOARD[1][1] == symbol && BOARD[2][0] == symbol) {
            return true;
        }
        return false;
    }

    private static void playHuman() {
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

    private static void playAI() {
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

