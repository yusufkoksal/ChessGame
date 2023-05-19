public class Knight extends Piece {
    Knight(boolean isWhite) {
        super(isWhite ? 'N' : 'n', isWhite);
    }

    @Override
    boolean isValidMove(Square from, Square to, ChessBoard board) {
        if (!isInsideBoard(to)) {
            return false;
        }

        Piece destinationPiece = board.getPieceAt(to);
        if (destinationPiece != null && destinationPiece.isWhite() == isWhite()) {
            return false; // Cannot capture a piece of the same color
        }

        int dx = Math.abs(from.getX() - to.getX());
        int dy = Math.abs(from.getY() - to.getY());

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}