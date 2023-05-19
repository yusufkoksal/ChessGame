import java.util.*;

public abstract class Piece {
    char symbol;
    boolean isWhite;

    Piece(char symbol, boolean isWhite) {
        this.symbol = symbol;
        this.isWhite = isWhite;
    }

    boolean isInsideBoard(Square square) {
        int x = square.getX();
        int y = square.getY();
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    abstract boolean isValidMove(Square from, Square to, ChessBoard board);

    char getSymbol() {
        return symbol;
    }

    boolean isWhite() {
        return isWhite;
    }
}
