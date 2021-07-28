import java.util.*;

public class Battleship {
	public static void main(String[] args) {
		System.out.println("Welcome to Battleship!\n");
		Scanner input = new Scanner(System.in);
		char[][] playerOneBoard = createPlayerBoard(1, input);
		char[][] playerTwoBoard = createPlayerBoard(2, input);

		char[][] playerOneHistory = createPlayerHistory();
		char[][] playerTwoHistory = createPlayerHistory();

		int currentPlayer = 1;
		while (true) {
			char [][] otherPlayerBoard;
			char [][] playerHistory;
			if (currentPlayer == 1) {
				otherPlayerBoard = playerTwoBoard;
				playerHistory = playerOneHistory;
				makeMove(currentPlayer, otherPlayerBoard, playerHistory, input);
				if (isWinner(currentPlayer, playerHistory)) {
					System.out.println("PLAYER " + currentPlayer + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
					break;
				}
				currentPlayer = 2;
			} else if (currentPlayer == 2) {
				otherPlayerBoard = playerOneBoard;
				playerHistory = playerTwoHistory;
				makeMove(currentPlayer, otherPlayerBoard, playerHistory, input);
				if (isWinner(currentPlayer, playerHistory)) {
					System.out.println("PLAYER " + currentPlayer + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
					break;
				}
				currentPlayer = 1;
			}
		}
		System.out.println();
		System.out.println("Final boards:");
		System.out.println();
		printBattleShip(playerOneBoard);
		System.out.println();
		printBattleShip(playerTwoBoard);
    }

	private static boolean isWinner(int playerNum, char[][] playerHistory) {
		int count = 0;

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (playerHistory[row][col] == 'X') {
					count++;
				}
				if (count == 5) {
					return true;
				}
			}
		}
		return false;
	}

	private static void makeMove(int playerNum, char[][] otherPlayerBoard, char[][] playerHistory, Scanner input) {
		boolean validMove = false;
		int otherPlayerNum;

		if (playerNum == 1) {
			otherPlayerNum = 2;
		} else {
			otherPlayerNum = 1;
		}

		do {
			try {
				System.out.println("Player " + playerNum +", enter hit row/column:");
				int row = input.nextInt();
				int col = input.nextInt();
				if (playerHistory[row][col] == 'X' || playerHistory[row][col] == 'O') {
					System.out.println("You already fired on this spot. Choose different coordinates.");
					continue;
				} else {
					if (otherPlayerBoard[row][col] == '@') {
						System.out.println("PLAYER " + playerNum + " HIT PLAYER " + otherPlayerNum +"’s SHIP!");
						playerHistory[row][col] = 'X';
						otherPlayerBoard[row][col] = 'X';
						printBattleShip(playerHistory);
						System.out.println();
						validMove = true;
					} else {
						System.out.println("PLAYER " + playerNum +" MISSED!");
						playerHistory[row][col] = 'O';
						otherPlayerBoard[row][col] = 'O';
						printBattleShip(playerHistory);
						System.out.println();
						validMove = true;
					}
				}
			} catch(Exception e) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			}
		} while(!validMove);
	}

	private static char[][] createPlayerHistory() {
		char [][] board = new char[5][5];
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				board[row][col] = '-';
			}
		}	
		return board;
	}

	private static char[][] createPlayerBoard(int playerNum, Scanner input) {
		System.out.println("PLAYER " + playerNum + ", ENTER YOUR SHIPS’ COORDINATES.");
		char [][] board = new char[5][5];
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				board[row][col] = '-';
			}
		}
		int validShips = 0;
		while (validShips < 5) {
			try {
				System.out.printf("Enter ship %d location:\n", validShips + 1);
				int row = input.nextInt();
				int col = input.nextInt();
				if (board[row][col] == '@') {
					System.out.println("You already have a ship there. Choose different coordinates.");
					continue;
				} else {
					board[row][col] = '@';
					validShips++;
				}
			} catch(Exception e) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			}
		}

		printBattleShip(board);
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		return board;
	}
	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}