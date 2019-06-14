import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class emplah {
	// We create a list of the pieces we have
	public ArrayList<ReversedPiece> reversedPieces = new ArrayList<ReversedPiece>();

	/*
	 * Reads the input, and saves any pieces you encounter in the list of pieces
	 */
	private void readInput() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = { "" };
		r.skip(7);
		String w = r.readLine();
		String[] white = (w.length()) > 1 ? w.split(",") : temp;
		r.skip(7);
		String b = r.readLine();
		String[] black = (b.length()) > 1 ? b.split(",") : temp;

		for (String whitePiece : white) {
			boolean colour = true;
			boolean pawn;
			ReversedPiece p;// = new ReversedPiece(' ', -1, -1, false, false);
			switch (whitePiece.length()) {
			case 3:
				pawn = false;
				p = new ReversedPiece(whitePiece.charAt(0), convertCol(whitePiece.charAt(1)),
						convertRow(whitePiece.charAt(2)), colour, pawn);
				reversedPieces.add(p);
				break;
			case 2:
				pawn = true;
				p = new ReversedPiece('P', convertCol(whitePiece.charAt(0)), convertRow(whitePiece.charAt(1)), colour,
						pawn);
				reversedPieces.add(p);
				break;
			default:
				break;
			}
		}

		for (String blackPiece : black) {
			boolean colour = false;
			boolean pawn;
			ReversedPiece p;// = new ReversedPiece(' ', -1, -1, false, false);
			switch (blackPiece.length()) {
			case 3:
				pawn = false;
				p = new ReversedPiece(blackPiece.charAt(0), convertCol(blackPiece.charAt(1)),
						convertRow(blackPiece.charAt(2)), colour, pawn);
				reversedPieces.add(p);
				break;
			case 2:
				pawn = true;
				p = new ReversedPiece('P', convertCol(blackPiece.charAt(0)), convertRow(blackPiece.charAt(1)), colour,
						pawn);
				reversedPieces.add(p);
				break;
			default:
				break;
			}
		}
	}

	/*
	 * Writes the output.
	 */
	private void writeOutput() throws IOException {
		// initialize a buffered writer to write the output
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		// code to build the board
		char[][] board = {
				// 0
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 1
				{ '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
						'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|' },
				// 2
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 3
				{ '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
						'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|' },
				// 4
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 5
				{ '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
						'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|' },
				// 6
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 7
				{ '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
						'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|' },
				// 8
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 9
				{ '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
						'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|' },
				// 10
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 11
				{ '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
						'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|' },
				// 12
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 13
				{ '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.',
						'|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|' },
				// 14
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
				// 15
				{ '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|', ':', ':', ':',
						'|', '.', '.', '.', '|', ':', ':', ':', '|', '.', '.', '.', '|' },
				// 16
				{ '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-',
						'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },

		};

		// Add the pieces to the board at their place
		for (ReversedPiece p : reversedPieces) {
			board[p.getCol()][p.getRow()] = p.isWhite() ? p.getName() : Character.toLowerCase(p.getName());
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

	// Converts character to column index
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
		return -1;
	}

	// Converts character to row index
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
		return -1;
	}

	private String makeString(char[] carr) {
		String ret = "";
		for (char c : carr) {
			ret += c;
		}
		return ret;
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
		(new emplah()).run();
	}
}

class ReversedPiece {
	private char name;
	private int row;
	private int col;
	private boolean colour;
	private boolean pawn;

	ReversedPiece(char name, int row, int col, boolean colour, boolean pawn) {
		this.name = name;
		this.row = row;
		this.col = col;
		this.colour = colour;
		this.pawn = pawn;
	}

	public void setColour(boolean x) {
		this.colour = x;
	}

	public void setPawn(boolean x) {
		this.pawn = x;
	}

	public void setName(char x) {
		this.name = x;
	}

	public void setCol(int x) {
		this.col = x;
	}

	public void setRow(int x) {
		this.row = x;
	}

	public char getName() {
		return this.name;
	}

	public int getCol() {
		return this.col;
	}

	public int getRow() {
		return this.row;
	}

	public boolean getPawn() {
		return this.pawn;
	}

	public boolean isWhite() {
		return this.colour;
	}
}
