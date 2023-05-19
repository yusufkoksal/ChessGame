public class King extends Piece {
    King(boolean isWhite) {
        super(isWhite ? 'K' : 'k', isWhite);
    }

    @Override
    boolean isValidMove(Square from, Square to, ChessBoard board) {
        int dx = Math.abs(from.getX() - to.getX());
        int dy = Math.abs(from.getY() - to.getY());

        if ((dx == 1 || dx == 0) && (dy == 1 || dy == 0)) {
            Piece targetPiece = board.getPieceAt(to);
            return targetPiece == null || targetPiece.isWhite() != isWhite;
        }
        return false;
    }
}
