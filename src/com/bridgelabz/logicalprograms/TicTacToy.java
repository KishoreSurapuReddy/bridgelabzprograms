package com.bridgelabz.logicalprograms;

import java.util.Scanner;

class Game {
	private char[][] board;
	private char currentPlayer;

	public Game() {
		board = new char[3][3];
		currentPlayer = 'x';
		intializeBoard();
	}

	public char currentPlayer() {
		return currentPlayer;

	}

	public void intializeBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '-';
			}
		}
	}

	public void printBoard() {
		System.out.println("-------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print("|");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public boolean isBoardFull() {
		boolean isFull = true;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}

		return isFull;

	}

	public boolean isWinner() {
		return (checkRows() || checkColoumns() || checkDiagonals());

	}

	private boolean checkDiagonals() {

		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	}

	private boolean checkColoumns() {
		for (int i = 0; i < board.length; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;

	}

	private boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkRowCol(char c, char d, char e) {

		return ((c != '-') && (c == d) && (d == e));
	}

	public void changePlayer() {
		if (currentPlayer == 'x') {
			currentPlayer = 'o';
		} else {
			currentPlayer = 'x';
		}
	}

	public boolean placeMark(int row, int col) {

		if ((row >= 0) && (row < board.length)) {
			if ((col >= 0) && (col < board.length)) {
				if (board[row][col] == '-') {
					board[row][col] = currentPlayer;
					return true;
				}
			}
		}
		return false;

	}

}

public class TicTacToy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		game.intializeBoard();
		System.out.println("tictoktoy....");
		do {
			game.printBoard();
			int row;
			int col;
			do {
				System.out
						.println("player " + game.currentPlayer() + " enter in empty row and column to place a mark ");
				row = sc.nextInt();
				col = sc.nextInt();

			} while (!game.placeMark(row, col));
			game.changePlayer();

		} while (!(game.isWinner()) && !(game.isBoardFull()));

		if (game.isBoardFull() && !game.isWinner()) {
			System.out.println("The game was a tie!");
		} else {
			System.out.println("Current board layout:");
			game.printBoard();
			game.changePlayer();
			System.out.println(Character.toUpperCase(game.currentPlayer()) + " Wins!");
		}
	}

}
