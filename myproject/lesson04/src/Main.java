package lesson04;

import java.io.PrintStream;
class myproject {
    static int[] makeRow(int n) {
        return new int[n];
    }
    static void populate_ships(int[][] board) {
    }
    public static void main(String[] args) {
        PrintStream o = System.out;
        int count = 1;
        int[][] board = {
                makeRow(5),
                {0, 1, 1, 0, 0},
                {1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
        };
        o.println ("All Set. Get ready to rumble!");
        o.print(" 0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < board[0].length; i++) {
            o.print("");
        }
        o.println("");
        for (int[] row : board) {
            o.print(" "+count+" |");
            count++;
            for (int cell : row) {
                String s = switch (cell) {
                    case 0 -> "-";
                    case 1 -> "*";
                    case 2 -> "X";
                    default -> "  ";
                };
                o.print(" "+s+" |");
               // o.print("| ");
            }
            o.println("");
        }
        o.println("You have won!");

    }
}

