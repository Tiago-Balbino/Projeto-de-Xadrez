package aplicatioon.interfaceUsuario;

import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IU {
    public static ChessPosition readChessPosition(Scanner leitor) {
        try {

            String s = leitor.nextLine();
            char ColunaMovendo = s.charAt(0);
            int LinhaMovendo = Integer.parseInt(s.substring(1));
            return new ChessPosition(ColunaMovendo, LinhaMovendo);
        }
        catch(RuntimeException e){
            throw  new InputMismatchException("erro lendo a posição.");

        }

    }

    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
