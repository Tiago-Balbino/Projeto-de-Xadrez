package aplicatioon.chess.pieces.paisExtrangeiro;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class Monstro extends ChessPiece {

    public Monstro (Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    public String toString(){
        return "M";
    }
}

