import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class helpme {
	// We create a list of the pieces we have
	public ArrayList<Piece> pieces = new ArrayList<Piece>();

	/*
	 * Removes the last character of a string.
	 */
	private static String removeLastChar(final String str) {
		return str.substring(0, str.length() - 1);
	}

	/*
	 * Reads the input, and saves any pieces you encounter in the list of pieces
	 */
	private void readInput() throws IOException {
		// initialize a buffered reader to read the input
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// skip first line
		r.readLine();
		// for every line on the board
		for (int i = 8; i >= 1; i--) {
			// read a line
			char[] l = r.readLine().toCharArray();
			// for every character
			for (int c = 0; c < l.length; c++) {
				// if it is a letter
				if (Character.isLetter(l[c])) {
					Piece p = new Piece(l[c], i, c);
					// add said piece to all pieces
					pieces.add(p);
				}
			}
			// skip a line
			r.readLine();
		}
	}

	/*
	 * Writes the output.
	 */
	private void writeOutput() throws IOException {
		// initialize a buffered writer to write the output
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		// create two strings for each colour
		String white = "White: ";
		String black = "Black: ";

		// create a list of all pieces, in sorted order
		ArrayList<Piece> sortedPieces = Piece.sort(pieces);

		// for every single piece
		for (Piece piece : sortedPieces) {
			if (piece.isWhite()) {
				white += (piece.toString() + ",");
			} else {
				black += (piece.toString() + ",");
			}
		}

		// remove the last character from the string; this is a ','.
		white = removeLastChar(white);
		black = removeLastChar(black);

		// write both strings with a newline
		w.write(white + "\n");
		w.write(black + "\n");

		// flush your buffered writer
		w.flush();
	}

	/*
	 * Runs the program
	 */
	void run() throws IOException {
		readInput();
		writeOutput();
	}

	/*
	 * Main method
	 */
	public static void main(String[] a) throws IOException {
		(new helpme()).run();
	}
}

/*
 * This is a class for a piece on the board. This piece has a name (e.g. R for
 * rook), a rownumber, a columnnumber, a colour and it is either a pawn or no
 * pawn.
 */
class Piece {

	char name;
	int row;
	int col;
	boolean colour;
	boolean pawn;

	/*
	 * Constructor of a piece. With this one can create new pieces.
	 */
	Piece(char name, int row, int col) {
		this.name = name;
		this.row = row;
		this.col = col;
		colour = Character.isLowerCase(name) ? false : true;
		pawn = ((name == 'p') || (name == 'P')) ? true : false;
	}

	/*
	 * Returns a list sorted on index of the pieces for white pieces
	 */
	private static ArrayList<Piece> whiteIndexSort(final ArrayList<Piece> list) {
		// create a list to return on Index
		ArrayList<Piece> onIndex = new ArrayList<Piece>();

		// create an array with rowIndices
		int[] rowIndices = new int[list.size()];
		int i = 0;
		for (Piece p : list) {
			rowIndices[i] = p.row();
			i++;
		}
		// Sort on the indexes from LOW to HIGH
		Arrays.sort(rowIndices);
		// for every row index,add the corresponding piece to the list on index.
		for (int ind : rowIndices) {
			for (Piece p : list) {
				if (ind == p.row()) {
					if (!onIndex.contains(p)) {
						onIndex.add(p);
					}
				}
			}
		}
		// then return said list
		return onIndex;
	}

	/*
	 * Returns a list sorted on index of the pieces for black pieces
	 */
	private static ArrayList<Piece> blackIndexSort(final ArrayList<Piece> list) {
		// create a list to return on Index
		ArrayList<Piece> onIndex = new ArrayList<Piece>();

		// create an array with rowIndices
		int[] rowIndices = new int[list.size()];
		int i = 0;
		for (Piece p : list) {
			rowIndices[i] = p.row();
			i++;
		}
		// System.err.print("Elements: " + p.toString() + "\n");

		// Sort on the indexes from HIGH to LOW
		Arrays.sort(rowIndices);
		// for every row index,add the corresponding piece to the list on index.
		for (int ind = rowIndices.length - 1; ind >= 0; ind--) {
			for (Piece p : list) {
				if (rowIndices[ind] == p.row()) {
					if (!onIndex.contains(p)) {
						onIndex.add(p);
					}
				}
			}
		}
		// then return said list
		return onIndex;
	}

	/*
	 * Sorts pieces as wanted by the question
	 */
	public static ArrayList<Piece> sort(ArrayList<Piece> pieces) {
		// A semi-sorted list to return
		ArrayList<Piece> sorted = new ArrayList<Piece>();

		// Create sublists
		ArrayList<Piece> whiteKings = new ArrayList<Piece>();
		ArrayList<Piece> whiteQueens = new ArrayList<Piece>();
		ArrayList<Piece> whiteRooks = new ArrayList<Piece>();
		ArrayList<Piece> whiteBishops = new ArrayList<Piece>();
		ArrayList<Piece> whiteKnights = new ArrayList<Piece>();
		ArrayList<Piece> whitePawns = new ArrayList<Piece>();
		ArrayList<Piece> blackKings = new ArrayList<Piece>();
		ArrayList<Piece> blackQueens = new ArrayList<Piece>();
		ArrayList<Piece> blackRooks = new ArrayList<Piece>();
		ArrayList<Piece> blackBishops = new ArrayList<Piece>();
		ArrayList<Piece> blackKnights = new ArrayList<Piece>();
		ArrayList<Piece> blackPawns = new ArrayList<Piece>();

		// First add the piece to their lists (also add Kings to the sorted
		// list, they are first)
		for (Piece piece : pieces) {
			switch (piece.name) {
			case 'K':
				whiteKings.add(piece);
			case 'Q':
				whiteQueens.add(piece);
			case 'R':
				whiteRooks.add(piece);
			case 'B':
				whiteBishops.add(piece);
			case 'N':
				whiteKnights.add(piece);
			case 'P':
				whitePawns.add(piece);
			case 'k':
				blackKings.add(piece);
			case 'q':
				blackQueens.add(piece);
			case 'r':
				blackRooks.add(piece);
			case 'b':
				blackBishops.add(piece);
			case 'n':
				blackKnights.add(piece);
			case 'p':
				blackPawns.add(piece);
			}
		}

		// Sort all sublists
		whiteKings = whiteIndexSort(whiteKings);
		for (Piece whiteKing : whiteKings) {
			if (!sorted.contains(whiteKing)) {
				sorted.add(whiteKing);
			}
		}

		whiteQueens = whiteIndexSort(whiteQueens);
		for (Piece whiteQueen : whiteQueens) {
			if (!sorted.contains(whiteQueen)) {
				sorted.add(whiteQueen);
			}
		}

		whiteRooks = whiteIndexSort(whiteRooks);
		for (Piece whiteRook : whiteRooks) {
			if (!sorted.contains(whiteRook)) {
				sorted.add(whiteRook);
			}
		}

		whiteBishops = whiteIndexSort(whiteBishops);
		for (Piece whiteBishop : whiteBishops) {
			if (!sorted.contains(whiteBishop)) {
				sorted.add(whiteBishop);
			}
		}

		whiteKnights = whiteIndexSort(whiteKnights);
		for (Piece whiteKnight : whiteKnights) {
			if (!sorted.contains(whiteKnight)) {
				sorted.add(whiteKnight);
			}
		}

		whitePawns = whiteIndexSort(whitePawns);
		for (Piece whitePawn : whitePawns) {
			if (!sorted.contains(whitePawn)) {
				sorted.add(whitePawn);
			}
		}

		blackKings = blackIndexSort(blackKings);
		for (Piece blackKing : blackKings) {
			if (!sorted.contains(blackKing)) {
				sorted.add(blackKing);
			}
		}

		blackQueens = blackIndexSort(blackQueens);
		for (Piece blackQueen : blackQueens) {
			if (!sorted.contains(blackQueen)) {
				sorted.add(blackQueen);
			}
		}

		blackRooks = blackIndexSort(blackRooks);
		for (Piece blackRook : blackRooks) {
			if (!sorted.contains(blackRook)) {
				sorted.add(blackRook);
			}
		}

		blackBishops = blackIndexSort(blackBishops);
		for (Piece blackBishop : blackBishops) {
			if (!sorted.contains(blackBishop)) {
				sorted.add(blackBishop);
			}
		}

		blackKnights = blackIndexSort(blackKnights);
		for (Piece blackKnight : blackKnights) {
			if (!sorted.contains(blackKnight)) {
				sorted.add(blackKnight);
			}
		}

		blackPawns = blackIndexSort(blackPawns);
		for (Piece blackPawn : blackPawns) {
			if (!sorted.contains(blackPawn)) {
				sorted.add(blackPawn);
			}
		}

		return sorted;
	}

	/*
	 * Returns the size of a Piece Array List
	 */
	@SuppressWarnings("unused")
	private int size(final ArrayList<Piece> list) {
		return list.size();
	}

	/*
	 * Returns true if a piece is a pawn
	 */

	public boolean isPawn() {
		return pawn;
	}

	/*
	 * Returns true if a piece is a white piece
	 */
	public boolean isWhite() {
		return colour;
	}

	/*
	 * Return the name of the piece
	 */
	private char name() {

		return Character.toUpperCase(name);
	}

	/*
	 * Return the row index of the piece
	 */
	private int row() {
		return row;
	}

	/*
	 * Return the col name of the piece
	 */
	private char col() {
		switch (col) {
		case 2:
			return 'a';
		case 6:
			return 'b';
		case 10:
			return 'c';
		case 14:
			return 'd';
		case 18:
			return 'e';
		case 22:
			return 'f';
		case 26:
			return 'g';
		case 30:
			return 'h';

		default:
			System.err.println("Something went wrong with finding column information...");
		}
		// something went wrong
		return ' ';
	}

	/*
	 * Overrides the toString method. We want to print out only our relevant
	 * information.
	 */
	@Override
	public String toString() {
		String ret = "";
		if (!isPawn()) {
			ret += name();
		}
		ret += col();
		ret += row();
		return ret;
	}
}
