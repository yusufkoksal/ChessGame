# 🎲 Chess Game in Java 🏁

This repository contains an implementation of a console-based chess game in Java. 

## 📚 Description 

The game uses standard chess rules. It is text-based, which means moves are entered as text and the state of the game is displayed as text. 

The program uses object-oriented programming and follows a class-based structure for pieces and the chessboard. Each type of piece (Pawn, Rook, Knight, Bishop, Queen, King) is represented with a specific class, and each has its own move validation method.

The chessboard is represented as a 2D array of `Piece` objects. The `Piece` class is an abstract class that contains common attributes and methods for all pieces.

## 🚀 Getting Started

To play the game, simply clone the repository and run the `Main` class. The game alternates between players (white and black) and asks for input to move pieces.

## 🕹️ How to Play 

1. At the start of each turn, the current state of the board will be displayed.

2. The game will ask for the location of the piece to move.

3. Input the location in the format 'e2', where 'e' is the column (file) and '2' is the row (rank).

4. The game will ask for the location to move the piece to.

5. Input the new location in the same format as above.

6. If the move is valid, the piece will be moved. If the move is invalid, the game will ask for input again.

## 🛠️ Built With 

- Java

## 🙌 Contribution

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## ⚖️ License 

This project is licensed under the MIT License - see the LICENSE.md file for details

## 🎉 Acknowledgments 

- 🙏 Thanks to everyone who will participate in this project!
