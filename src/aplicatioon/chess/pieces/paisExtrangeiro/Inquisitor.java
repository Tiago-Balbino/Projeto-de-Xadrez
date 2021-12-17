package aplicatioon.chess.pieces.paisExtrangeiro;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class Inquisitor extends ChessPiece {

    public Inquisitor (Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    public String toString(){
        return "I";
    }
}
