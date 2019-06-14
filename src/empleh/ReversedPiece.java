package empleh;

/**
 * Data class for {@link empleh.emplah} problem.
 */
class ReversedPiece {

    private char name;
    private int row;
    private int col;
    private boolean colour;
    private boolean pawn;

    /**
     * Constructor for a reversed piece
     *
     * @param name   name of the piece
     * @param row    the row of the piece
     * @param col    the column of the piece
     * @param colour the colour of the piece ({@code true} if white)
     * @param pawn   {@code true} if piece is a pawn
     */
    ReversedPiece(char name, int row, int col, boolean colour, boolean pawn) {
        this.name = name;
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.pawn = pawn;
    }

    char getName() {
        return name;
    }

    int getCol() {
        return col;
    }

    int getRow() {
        return row;
    }

    boolean isWhite() {
        return colour;
    }

}
