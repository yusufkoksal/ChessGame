public class Queen extends Piece {
    Queen(boolean isWhite) {
        super(isWhite ? 'Q' : 'q', isWhite);
    }

    @Override
    boolean isValidMove(Square from, Square to, ChessBoard board) {
        int dx = Math.abs(from.getX() - to.getX());
        int dy = Math.abs(from.getY() - to.getY());

        if (dx != dy && (dx != 0 && dy != 0)) {
            return false;
        }

        int stepX = dx == 0 ? 0 : (from.getX() < to.getX() ? 1 : -1);
        int stepY = dy == 0 ? 0 : (from.getY() < to.getY() ? 1 : -1);

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