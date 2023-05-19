import java.util.Scanner;

public class ChessBoard {
    Piece[][] board;

    ChessBoard() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            board[i][6] = new Pawn(false);  // White Pawns at 2nd rank
            board[i][1] = new Pawn(true); // Black Pawns at 7th rank
        }

        // ... initialize other pieces accordingly ...

        board[0][7] = new Rook(false); // Black Rooks
        board[7][7] = new Rook(false);
        board[0][0] = new Rook(true);  // White Rooks
        board[7][0] = new Rook(true);

        board[1][7] = new Knight(false); // Black Knights
        board[6][7] = new Knight(false);
        board[1][0] = new Knight(true);  // White Knights
        board[6][0] = new Knight(true);

        board[2][7] = new Bishop(false); // Black Bishops
        board[5][7] = new Bishop(false);
        board[2][0] = new Bishop(true);  // White Bishops
        board[5][0] = new Bishop(true);

        board[3][7] = new Queen(false); // Black Queen
        board[3][0] = new Queen(true);  // White Queen

        board[4][7] = new King(false); // Black King
        board[4][0] = new King(true);  // White King
    }


    void displayBoard() {
        String separator = "  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

        System.out.println(separator);
        for (int y = 7; y >= 0; y--) {
            System.out.print((y + 1) + "      |");
            for (int x = 0; x < 8; x++) {
                Piece piece = board[x][y];
                System.out.print("    " + (piece == null ? ' ' : piece.getSymbol()) + "    |");
            }
            System.out.println("  " + (y + 1));
            System.out.println(separator);
        }
        System.out.print("          ");
        for (String letter : letters) {
            System.out.print("   " + letter + "    ");
        }
        System.out.println();
    }


    Piece getPieceAt(Square square) {
        return board[square.getX()][square.getY()];
    }

    void setPieceAt(Square square, Piece piece) {
        board[square.getX()][square.getY()] = piece;
    }

    void movePiece(Square from, Square to) {
        Piece piece = getPieceAt(from);
        setPieceAt(to, piece);
        setPieceAt(from, null);
    }
}

