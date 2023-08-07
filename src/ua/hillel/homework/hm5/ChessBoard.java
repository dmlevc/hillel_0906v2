package ua.hillel.homework.hm5;

public class ChessBoard {
    public static void main(String[] args) {
        chessBoard();
    }

    public static void chessBoard() {


        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            if (i == 0) {
            } else {
                System.out.println();
            }
            for (int k = 0; k < board[i].length; k++) {
                if (i % 2 == k % 2) {
//                i % 2 == 0 && k % 2 == 0 || i % 2 != 0 && k % 2 != 0
                    board[i][k] = "Б";
                } else {
                    board[i][k] = "Ч";
                }
                System.out.print(board[i][k]);
            }
        }
    }
}
