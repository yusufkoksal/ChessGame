class Square {
    private final int x, y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    static Square parseSquare(String input) {
        if (input == null || input.length() != 2) {
            return null;
        }

        char file = input.charAt(0);
        char rank = input.charAt(1);

        if (file >= 'a' && file <= 'h' && rank >= '1' && rank <= '8') {
            int x = file - 'a';
            int y = rank - '1';
            return new Square(x, y);
        } else {
            return null;
        }
    }
}
