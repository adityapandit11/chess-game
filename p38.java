import java.util.Scanner;

public class p38 {

        // piece encoding
        public static final int e = 0;
        public static final int P = 1;
        public static final int N = 2;
        public static final int R = 3;
        public static final int Q = 4;
        public static final int p = 5;
        public static final int n = 6;
        public static final int r = 7;
        public static final int q = 8;
        public static final int o = 9;

        // ascii pieces
        public static final String ascii_pieces = ".PNRQpnrqO";

        // unicode pieces
        public static String[] unicode_pieces = {"A-p1", "A-p2","A-p3","A-p4", "A-p5", "B-p1","B-p2", "B-p3","B-p4", "B-p5",".", ".",".", ".",".", ".",".", ".",".", ".",".",".", ".",".", ".","."};

        // chess board representation
        public static int[] board = {r, n, q, n, r, o, o, o, o, o,
                                     p, p, p, p, p, o, o, o, o, o,
                                     e, e, e, e, e, o, o, o, o, o,
                                     P, P, P, P, P, o, o, o, o, o,
                                     R, N, Q, N, R, o, o, o, o, o};

        // print board
        public static void print_board()
        {
            // print new line
            System.out.print("\n");

            // loop over board ranks
            for (int rank = 0; rank < 5; rank++)
            {
                for (int file = 0; file < 10; file++)
                {
                    // init square
                    int square = rank * 10 + file;

                    // print ranks
                    if (file == 0)
                    {
                        System.out.printf(" %d  ", 5 - rank);
                    }

                    // if square is on board
                    if ((square & 0x55) == 0)
                    {
                        //printf("%c ", ascii_pieces[board[square]]);
                        System.out.printf("%s ", unicode_pieces[board[square]]);
                    }
                }

                // print new line every time new rank is encountered
                System.out.print("\n");
            }

            // print files
            System.out.print("\n    a b c d e\n\n");
        }

        // main driver
        public static void main(String[] args)
        {
            print_board();
            System.out.print("♔");
        }


}
