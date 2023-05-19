public class Pawn extends Piece {
    Pawn(boolean isWhite) {
        super(isWhite ? 'P' : 'p', isWhite);
    }


    @Override
    boolean isValidMove(Square from, Square to, ChessBoard board) {
        if (!isInsideBoard(to)) {
            return false;
        }

        int dx = from.getX() - to.getX();
        int dy = to.getY() - from.getY();

        if (dx == 0 && ((isWhite && dy == 1) || (!isWhite && dy == -1))) {
            return board.getPieceAt(to) == null;
        } else if (dx == 0 && ((isWhite && from.getY() == 1 && dy == 2) || (!isWhite && from.getY() == 6 && dy == -2))) {
            return board.getPieceAt(to) == null && board.getPieceAt(new Square(from.getX(), from.getY() + (isWhite ? 1 : -1))) == null;
        } else if (Math.abs(dx) == 1 && ((isWhite && dy == 1) || (!isWhite && dy == -1))) {
            Piece targetPiece = board.getPieceAt(to);
            return targetPiece != null && targetPiece.isWhite() != isWhite;
        }
        return false;
    }
}
