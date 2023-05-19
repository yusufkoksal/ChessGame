public class Rook extends Piece {
    Rook(boolean isWhite) {
        super(isWhite ? 'R' : 'r', isWhite);
    }

    @Override
    boolean isValidMove(Square from, Square to, ChessBoard board) {
        int dx = Math.abs(from.getX() - to.getX());
        int dy = Math.abs(from.getY() - to.getY());

        if (dx != 0 && dy != 0) {
            return false;
        }

        int stepX = from.getX() < to.getX() ? 1 : -1;
        int stepY = from.getY() < to.getY() ? 1 : -1;

        int x = from.getX() + stepX;
        int y = from.getY() + stepY;

        while (x != to.getX() || y != to.getY()) {
            if (board.getPieceAt(new Square(x, y)) != null) {
                return false;
            }
            x += stepX;
            y += stepY;
        }

        Piece targetPiece = board.getPieceAt(to);
        return targetPiece == null || targetPiece.isWhite() != isWhite;
    }
}