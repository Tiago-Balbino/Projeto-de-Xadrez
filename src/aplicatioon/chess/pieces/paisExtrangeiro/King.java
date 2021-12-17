package aplicatioon.chess.pieces.paisExtrangeiro;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class King extends ChessPiece {

    public King (Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    public String toString(){
        return "K";
    }
}

