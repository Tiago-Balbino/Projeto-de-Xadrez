package aplicatioon;

import aplicatioon.chess.ChessException;
import aplicatioon.chess.ChessMatch;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.ChessPosition;
import aplicatioon.interfaceUsuario.IU;

import java.util.Scanner;

public class Pograma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try {
                IU.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Posição de origem: ");
                ChessPosition source = IU.readChessPosition(leitor);

                System.out.println();
                System.out.println("Para aonde deseja mover a peça: ");
                ChessPosition target = IU.readChessPosition(leitor);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                leitor.nextLine();
            }
        }
    }
}
