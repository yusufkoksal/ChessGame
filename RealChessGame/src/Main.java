

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessBoard board = new ChessBoard();

        boolean whiteTurn = true;
        while (true) {
            board.displayBoard();

            System.out.println("It's " + (whiteTurn ? "White's" : "Black's") + " turn");
            System.out.println("Enter the location of piece:");
            String fromInput = scanner.nextLine();
            Square from = Square.parseSquare(fromInput);

            System.out.println("Enter the new location of piece:");
            String toInput = scanner.nextLine();
            Square to = Square.parseSquare(toInput);

            if (from == null || to == null) {
                System.out.println("Invalid input, try again");
                continue;
            }

            Piece piece = board.getPieceAt(from);
            if (piece != null && piece.isWhite() == whiteTurn && piece.isValidMove(from, to, board)) {
                board.movePiece(from, to);
                whiteTurn = !whiteTurn;
            } else {
                System.out.println("Invalid move, try again");
            }
        }

    }
}