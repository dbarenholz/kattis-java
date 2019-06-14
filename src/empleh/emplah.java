package empleh;

import java.io.*;
import java.util.*;

/**
 * Solution to the emplah problem.
 *
 * @author Daniel Barenholz
 */
public class emplah {

    // We create a list of the pieces we have
    private ArrayList<ReversedPiece> reversedPieces =
            new ArrayList<>();

    /*
     * Main method
     */
    public static void main(String[] a)
            throws IOException {
        (new emplah()).run();
    }

    /**
     * Reads the input, and saves any pieces you encounter in the list of
     * pieces
     */
    private void readInput()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = {""};
        r.skip(7);
        String w = r.readLine();
        String[] white = (w.length()) > 1 ? w.split(",") : temp;
        r.skip(7);
        String b = r.readLine();
        String[] black = (b.length()) > 1 ? b.split(",") : temp;

        for (String piece : white) {
            processPiece(piece, true);
        }

        for (String piece : black) {
            processPiece(piece, false);
        }
    }

    /**
     * Processes a piece.
     *
     * @param piece   a piece
     * @param isWhite {@code true} if the piece is white, {@code false}
     *                otherwise
     */
    private void processPiece(String piece, boolean isWhite) {
        boolean pawn;
        ReversedPiece p;// = new ReversedPiece(' ', -1, -1, false, false);
        switch (piece.length()) {
            case 3:
                pawn = false;
                p = new ReversedPiece(piece.charAt(0),
                        convertCol(piece.charAt(1)),
                        convertRow(piece.charAt(2)), isWhite, pawn);
                reversedPieces.add(p);
                break;
            case 2:
                pawn = true;
                p = new ReversedPiece('P',
                        convertCol(piece.charAt(0)),
                        convertRow(piece.charAt(1)), isWhite,
                        pawn);
                reversedPieces.add(p);
                break;
            default:
                break;
        }
    }

    /**
     * Writes the output.
     */
    private void writeOutput()
            throws IOException {
        // initialize a buffered writer to write the output
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // code to build the board
        char[][] board = {
                // 0
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 1
                {'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':',
                        ':', '|'},
                // 2
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 3
                {'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.',
                        '.', '|'},
                // 4
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 5
                {'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':',
                        ':', '|'},
                // 6
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 7
                {'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.',
                        '.', '|'},
                // 8
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 9
                {'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':',
                        ':', '|'},
                // 10
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 11
                {'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.',
                        '.', '|'},
                // 12
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 13
                {'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.',
                        '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':',
                        ':', '|'},
                // 14
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},
                // 15
                {'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':',
                        '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.',
                        '.', '|'},
                // 16
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-',
                        '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-',
                        '-', '+'},

        };

        // Add the pieces to the board at their place
        for (ReversedPiece p : reversedPieces) {
            board[p.getCol()][p.getRow()] = p.isWhite() ? p.getName() :
                    Character.toLowerCase(p.getName());
        }

        // Code to print the board that was made
        String[] boardPrint = new String[board[0].length];
        for (int i = 0; i < board.length; i++) {
            // boardPrint[i] = board[i].toString();
            boardPrint[i] = makeString(board[i]);
        }
        for (String line : boardPrint) {
            if (line != null) {
                w.write(line + "\n");
            }
        }

        // flush your buffered writer
        w.flush();
    }

    /**
     * Convert character to column index.
     *
     * @param x character
     * @return corresponding column index
     */
    private int convertCol(char x) {
        switch (x) {
            case 'a':
                return 2;
            case 'b':
                return 6;
            case 'c':
                return 10;
            case 'd':
                return 14;
            case 'e':
                return 18;
            case 'f':
                return 22;
            case 'g':
                return 26;
            case 'h':
                return 30;
        }
        return - 1;
    }

    /**
     * Converts a character to the row index.
     *
     * @param x character
     * @return corresponding row index
     */
    private int convertRow(char x) {
        switch (x) {
            case '1':
                return 15;
            case '2':
                return 13;
            case '3':
                return 11;
            case '4':
                return 9;
            case '5':
                return 7;
            case '6':
                return 5;
            case '7':
                return 3;
            case '8':
                return 1;
        }
        return - 1;
    }

    /**
     * Makes a string from a character array.
     *
     * @param carr character array
     * @return String
     */
    private String makeString(char[] carr) {
        StringBuilder ret = new StringBuilder();
        for (char c : carr) {
            ret.append(c);
        }
        return ret.toString();
    }

    /*
     * Runs the program
     */
    private void run()
            throws IOException {
        readInput();
        writeOutput();
    }

}
